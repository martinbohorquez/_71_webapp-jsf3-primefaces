# Registro CRUD con Jakarta EE, PrimeFaces y PrimeFlex

Este es un proyecto de aplicación web que implementa operaciones CRUD (Crear, Leer, Actualizar, Eliminar) utilizando tecnologías Java EE modernas, incluyendo Jakarta EE, PrimeFaces y PrimeFlex. La aplicación utiliza Maven para la gestión de dependencias y construcción del proyecto, y se despliega en un servidor de aplicaciones WildFly.

## Características principales

- Implementación de CRUD utilizando Jakarta EE 10 y el API de Persistencia JPA/Hibernate.
- Interfaz de usuario moderna y receptiva gracias a PrimeFaces 12.0.0 con el tema Arya, PrimeFlex 2.0.0 y Jakarta Faces 4.0.1.
- Gestión de dependencias y construcción del proyecto facilitada con Maven.
- Configuración de DataSource con MySQL para la persistencia de datos.
- Despliegue en el servidor de aplicaciones WildFly.

## Tecnologías utilizadas

[![Jakarta EE](https://img.shields.io/badge/Jakarta%20EE-10.0.0-blue)](https://jakarta.ee/)
[![Jakarta Faces](https://img.shields.io/badge/Jakarta%20Faces-4.0.1-blue)](https://eclipse-ee4j.github.io/faces/)
[![PrimeFaces](https://img.shields.io/badge/PrimeFaces-12.0.0-orange)](https://www.primefaces.org/)
[![PrimeFlex](https://img.shields.io/badge/PrimeFlex-2.0.0-green)](https://primefaces.org/primeflex/)
[![Maven](https://img.shields.io/badge/Maven-3.9.6-yellow)](https://maven.apache.org/)
[![WildFly](https://img.shields.io/badge/WildFly-32.0.0.Final-red)](https://www.wildfly.org/)
[![MySQL Workbench](https://img.shields.io/badge/MySQL%20Workbench-8.0.32-blueviolet)](https://www.mysql.com/products/workbench/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-2024.1.1-blue)](https://www.jetbrains.com/idea/)

## Requisitos previos

- JDK 21 instalado.
- Maven 3.9.6 instalado.
- Servidor de aplicaciones WildFly 32.0.0.Final configurado y ejecutándose.
- Base de datos MySQL configurada y accesible desde el servidor WildFly.
- MySQL Workbench 8.0.32 instalado.

## Configuración del entorno de desarrollo

1. Clona este repositorio en tu máquina local.
2. Importa el proyecto en tu IDE de Java preferido.
3. Configura tu servidor de aplicaciones WildFly en el IDE.
4. Configura el DataSource en WildFly para conectar con tu base de datos MySQL.
5. Compila y despliega la aplicación en el servidor WildFly.

## Uso

Una vez que la aplicación esté desplegada, puedes acceder a ella desde tu navegador web favorito utilizando la URL proporcionada por tu servidor de aplicaciones WildFly.

## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -am 'Agrega una nueva característica'`).
4. Haz push a la rama (`git push origin feature/nueva-caracteristica`).
5. Crea un nuevo Pull Request.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).
