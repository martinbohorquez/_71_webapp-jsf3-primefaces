package org.mbohorquez.webapp.jsf3.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.mbohorquez.webapp.jsf3.models.entities.Categoria;
import org.mbohorquez.webapp.jsf3.models.entities.Producto;
import org.mbohorquez.webapp.jsf3.services.ProductoService;

import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

//@Model= @Named y @RequestScoped
@Model
public class ProductoController {

    private Producto producto;

    private Long id;

    @Inject
    private ProductoService service;

    @Inject
    @Named("fc")
    private FacesContext facesContext;

    @Inject
    private ResourceBundle bundle;

    @Produces
    @Model
    public String titulo() {
//        return "Hola Mundo Jakarta Server Faces 3.0";
        return bundle.getString("producto.texto.titulo");
    }


    @Produces
    @RequestScoped
    @Named("listado")
    public List<Producto> findAll() {
        /*return Arrays.asList(new Producto("peras"),
                new Producto("manzanas"),
                new Producto("naranjas"));*/
        return service.listar();
    }

    @Produces
    @Model
    public Producto producto() {
        if (producto == null) {
            producto = new Producto();
            Optional.ofNullable(id)
                    .filter(i -> i > 0)
                    .flatMap(service::porId)
                    .ifPresent(p -> producto = p);
        }
        return producto;
        /*this.producto = new Producto();
        if (id != null && id > 0) {
            service.porId(id).ifPresent(p -> {
                this.producto = p;
            });
        }
        return producto;*/
    }

    @Produces
    @Model
    public List<Categoria> categorias() {
        return service.listarCategorias();
    }

    public String editar(Long id) {
        this.id = id;
        return "form.xhtml?id=" + id + "&faces-redirect=true";
    }

    public String guardar() {
        System.out.println(producto);
        service.guardar(producto);
        if (producto.getId() != null && producto.getId() > 0) {
            facesContext.addMessage(null, new FacesMessage(String.format(bundle.getString("producto.mensaje.editar"), producto.getNombre())));
        } else {
            facesContext.addMessage(null, new FacesMessage(String.format(bundle.getString("producto.mensaje.editar"), producto.getNombre())));
        }

        return "index.xhtml?faces-redirect=true";
    }

    public String eliminar(Producto producto) {
        service.eliminar(producto.getId());
        facesContext.addMessage(null, new FacesMessage(String.format(bundle.getString("producto.mensaje.eliminar"), producto.getNombre())));
        return "index.xhtml?faces-redirect=true";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
