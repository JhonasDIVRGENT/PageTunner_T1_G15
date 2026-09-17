# T1 - Librería Académica "PageTurner"

**CARRERA:** Ingeniería de Sistemas Computacionales - UPN  
**CURSO:** Técnicas de programación  
**DOCENTE:** Victor Alfredo Muguerza Capristan  
**TEMA:** T1 - Librería Académica "PageTurner"

## Integrantes

- Jonathan Calderon Gamarra - N00571575 - Coordinador
- Karla Mariel Quispe Padilla - N00353037
- Dara Rina Borja Goñi - N00422554
- Andre Aaron Colchado Robles - N00418772

## Descripción

Este proyecto corresponde al examen T1 del curso Técnicas de Programación.

El objetivo es representar en código Java el modelo de clases desarrollado para el caso de la librería académica PageTurner.

El proyecto utiliza Programación Orientada a Objetos para representar las clases principales del sistema.

## Clases implementadas

### Cliente

Representa a los clientes de la librería.

Atributos principales:

- nombre
- DNI
- correo

### Libro

Representa los libros registrados en la librería.

Atributos principales:

- título
- autor
- ISBN
- precio
- stock

### Venta

Representa la relación de una venta entre un cliente y un libro.

Contiene información como:

- cliente
- libro
- fecha
- cantidad

### Reserva

Representa la reserva de un libro realizada por un cliente.

Contiene información como:

- cliente
- libro
- fecha


## Estructura

```text
src/
├── App.java
└── models/
    ├── Cliente.java
    ├── Libro.java
    ├── Venta.java
    └── Reserva.java