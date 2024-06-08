package org.mbohorquez.webapp.jsf3.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.mbohorquez.webapp.jsf3.models.entities.Categoria;
import org.mbohorquez.webapp.jsf3.models.entities.Producto;
import org.mbohorquez.webapp.jsf3.repositories.CrudRepository;
import org.mbohorquez.webapp.jsf3.repositories.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Stateless
public class ProductoServiceImpl implements ProductoService {
    @Inject
    private ProductoRepository productoRepository;
    @Inject
    private CrudRepository<Categoria> categoriaRepository;
    @Override
    public List<Producto> listar() {
        return productoRepository.listar();
    }

    @Override
    public Optional<Producto> porId(Long id) {
        return Optional.ofNullable(productoRepository.porId(id));
    }

    @Override
    public void guardar(Producto producto) {
        productoRepository.guardar(producto);
    }

    @Override
    public void eliminar(Long id) {
        productoRepository.eliminar(id);
    }

    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepository.listar();
    }

    @Override
    public Optional<Categoria> porIdCategoria(Long id) {
        return Optional.ofNullable(categoriaRepository.porId(id));
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre) {
        return productoRepository.buscarPorNombre(nombre);
    }
}
