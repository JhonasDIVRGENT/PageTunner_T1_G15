# T1 - Librería Académica "PageTurner"

**CARRERA:** Ing. De Sistemas Computacionales - UPN

**CURSO:** Técnicas de programación orientada objetos

**DOCENTE:** Victor Alfredo Muguerza Capristan

**TEMA:** T1 - Librería Académica "PageTurner"



## Integrantes

- **Jonathan Calderon Gamarra** - N00571575 - Coordinador
- **Karla Mariel Quispe Padilla** - N00353037
- **Dara Rina Borja Goñi** - N00422554
- **Andre Aaron Colchado Robles** - N00418772

---

## 1. Descripción del proyecto

PageTurner es una librería académica que necesita controlar libros, clientes, ventas, stock, reservas y el dinero generado por las ventas. Este proyecto corresponde a la implementación del modelo desarrollado para el examen T1 del curso.

El programa es una simulación sencilla realizada en Java para demostrar los conceptos aprendidos de Programación Orientada a Objetos. No se presenta como un sistema completo de producción, sino como una propuesta básica para representar el caso de negocio de una librería escolar.

---

## 2. Objetivo

Implementar mediante Java un modelo orientado a objetos que permita representar clientes, libros, ventas y reservas de la librería PageTurner, aplicando clases, objetos, encapsulamiento, constructores, métodos, relaciones entre objetos y estructuras condicionales.

---

## 3. Tecnologías utilizadas

- Java 21
- Visual Studio Code
- Programación Orientada a Objetos
- Java No Build Tools

---

## 4. Estructura del proyecto

La estructura principal del proyecto es la siguiente:

```text
src/
├── App.java
└── models/
    ├── Cliente.java
    ├── Libro.java
    ├── Venta.java
    └── Reserva.java
```

Cada archivo cumple una función específica:

- `Cliente.java`: representa a los clientes registrados en la librería.
- `Libro.java`: representa los libros y contiene información como título, autor, ISBN, precio y stock.
- `Venta.java`: representa una venta realizada por un cliente sobre un libro.
- `Reserva.java`: representa la reserva de un libro sin stock.
- `App.java`: es la clase principal donde se crean los objetos y se realiza una simulación del funcionamiento del sistema.

---

## 5. Programación Orientada a Objetos

El proyecto usa conceptos básicos de POO para organizar la lógica del negocio.



## 6. Lógica del programa

La lógica principal se encuentra en `App.java` y se ejecuta de manera secuencial para simular el funcionamiento de la librería.

El flujo del programa es el siguiente:

1. Se crean los clientes.
2. Se crean los libros.
3. Se inicializan contadores de ventas y dinero generado.
4. Se intenta realizar una venta.
5. Se verifica si existe stock suficiente.
6. Si existe stock, se crea una `Venta`.
7. Se descuenta la cantidad vendida del stock.
8. Se calcula el total de la venta.
9. Se incrementa el contador de ventas.
10. Se acumula el dinero generado.
11. Se realizan otras ventas.
12. Si un libro tiene stock 0, se crea una `Reserva`.
13. Finalmente se muestra un resumen de ventas por libro.

Este proceso permite observar cómo interactúan las clases y cómo se actualizan los datos durante la simulación.

---

## 7. Uso de condicionales

El programa usa condicionales `if` para validar la disponibilidad del stock y decidir si una venta o reserva es posible.



## 8. Métodos principales

### `descontarStock()`

Este método se encuentra en la clase `Libro`.

Su función es disminuir el stock después de una venta válida. La idea es sencilla:

- Stock inicial: 10
- Cantidad vendida: 2
- Stock final: 8

La lógica se implementa dentro de la propia clase `Libro` para mantener la responsabilidad del manejo del stock.

### `calcularTotal()`

Este método está en la clase `Venta`.

Su lógica consiste en calcular el total de la venta mediante:

```java
precio del libro × cantidad comprada
```

Ejemplo:

- Precio: 120
- Cantidad: 2
- Total: 240

---

## 9. Programación estructurada en `App.java`

Aunque el proyecto está basado principalmente en Programación Orientada a Objetos, el método `main` de `App.java` también usa programación estructurada para controlar el flujo de ejecución.

Esto se observa en el uso de:

- ejecución secuencial
- variables
- condicionales `if` y `else`
- llamadas a métodos





## 10. Requisitos funcionales

La simulación realizada en `App.java` demuestra los siguientes requerimientos:

| Código | Requerimiento | Implementación |
|---|---|---|
| RF-01 | Registrar libros | El programa crea objetos `Libro` con título, autor, ISBN, precio y stock. |
| RF-02 | Registrar clientes | El programa crea objetos `Cliente` con nombre, DNI y correo. |
| RF-03 | Registrar ventas | Se crean objetos `Venta` relacionados con un `Cliente` y un `Libro`, almacenando fecha y cantidad. |
| RF-04 | Actualizar stock | Al realizar una venta se ejecuta `descontarStock()`. |
| RF-05 | Registrar reservas | Cuando un libro tiene stock 0 se puede crear un objeto `Reserva`. |
| RF-06 | Consultar ventas e ingresos | `App.java` mantiene contadores de ventas y acumuladores del dinero generado para mostrar un resumen por libro. |

Estos requisitos están demostrados mediante la simulación ejecutada en la clase principal, sin afirmar que el sistema sea un CRUD completo o un proyecto de producción.

---

## 11. Historias de usuario

La implementación responde principalmente a estas necesidades:

- **Cliente:** poder reservar un libro cuando no exista stock.
- **Asistente:** poder registrar ventas y actualizar automáticamente el stock.
- **Dueña:** poder conocer las ventas realizadas y el dinero generado por los libros.

---



## Conclusión

PageTurner es una propuesta académica orientada a comprender la relación entre clases, objetos y lógica de negocio en Java. El proyecto no busca ser un sistema completo ni una solución empresarial, sino una demostración clara del uso de POO aplicada a un caso realista de una librería académica.
