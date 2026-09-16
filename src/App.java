import java.util.Date;
import models.Cliente;
import models.Libro;
import models.Reserva;
import models.Venta;

public class App {

    public static void main(String[] args) {

        //Instaciamos los objetos de en las clases
        //clientes
        Cliente cliente1 = new Cliente(
                "Ana Torres",
                "72845612",
                "ana@gmail.com");

        Cliente cliente2 = new Cliente(
                "Luis Mendoza",
                "71458963",
                "luis@gmail.com");

        // Libros
        Libro libro1 = new Libro(
                "El programador pragmatico",
                "Herbert Schildt",
                "9781111111111",
                120.00,
                10);

        Libro libro2 = new Libro(
                "Bases de Datos",
                "Carlos Coronel",
                "9782222222222",
                95.50,
                5);

        Libro libro3 = new Libro(
                "Introducción a la Algoritmia",
                "Thomas Cormen",
                "9783333333333",
                150.00,
                0);

        //Variables inician en 0 para el libro 1
        int cantidadVentasLibro1 = 0;
        double dineroGeneradoLibro1 = 0;

        //Variables inician en 0 para el libro 2
        int cantidadVentasLibro2 = 0;
        double dineroGeneradoLibro2 = 0;

        //Metodo para la venta

        // VENTA 1

        int cantidad1 = 2;

        if (cantidad1 > 0 && cantidad1 <= libro1.getStock()) {

            Venta venta1 = new Venta(
                    cliente1,
                    libro1,
                    new Date(),
                    cantidad1);

            libro1.descontarStock(cantidad1);

            cantidadVentasLibro1++;
            dineroGeneradoLibro1 += venta1.calcularTotal();

            System.out.println("=== VENTA 1 ===");
            System.out.println("Cliente: " + venta1.getCliente().getNombre());
            System.out.println("Libro: " + venta1.getLibro().getTitulo());
            System.out.println("Cantidad: " + venta1.getCantidad());
            System.out.println("Precio unitario: " + venta1.getLibro().getPrecio());
            System.out.println("Total: " + venta1.calcularTotal());
            System.out.println("Stock restante: " + libro1.getStock());

        } else {

            System.out.println("No hay stock suficiente para la venta 1.");
        }

        // VENTA 2

        int cantidad2 = 1;

        if (cantidad2 > 0 && cantidad2 <= libro1.getStock()) {

            Venta venta2 = new Venta(
                    cliente2,
                    libro1,
                    new Date(),
                    cantidad2);

            libro1.descontarStock(cantidad2);

            cantidadVentasLibro1++;
            dineroGeneradoLibro1 += venta2.calcularTotal();

            System.out.println();
            System.out.println("=== VENTA 2 ===");
            System.out.println("Cliente: " + venta2.getCliente().getNombre());
            System.out.println("Libro: " + venta2.getLibro().getTitulo());
            System.out.println("Cantidad: " + venta2.getCantidad());
            System.out.println("Precio unitario: " + venta2.getLibro().getPrecio());
            System.out.println("Total: " + venta2.calcularTotal());
            System.out.println("Stock restante: " + libro1.getStock());

        } else {

            System.out.println("No hay stock suficiente para la venta 2.");
        }

        // VENTA 3 - usamos el libro 2

        int cantidad3 = 2;

        if (cantidad3 > 0 && cantidad3 <= libro2.getStock()) {

            Venta venta3 = new Venta(
                    cliente1,
                    libro2,
                    new Date(),
                    cantidad3);

            libro2.descontarStock(cantidad3);

            cantidadVentasLibro2++;
            dineroGeneradoLibro2 += venta3.calcularTotal();

            System.out.println();
            System.out.println("=== VENTA 3 ===");
            System.out.println("Cliente: " + venta3.getCliente().getNombre());
            System.out.println("Libro: " + venta3.getLibro().getTitulo());
            System.out.println("Cantidad: " + venta3.getCantidad());
            System.out.println("Precio unitario: " + venta3.getLibro().getPrecio());
            System.out.println("Total: " + venta3.calcularTotal());
            System.out.println("Stock restante: " + libro2.getStock());

        } else {

            System.out.println("No hay stock suficiente para la venta 3.");
        }

        // RESERVA

        if (libro3.getStock() == 0) {

            Reserva reserva1 = new Reserva(
                    cliente2,
                    libro3,
                    new Date());

            System.out.println();
            System.out.println("=== RESERVA ===");
            System.out.println("Cliente: " + reserva1.getCliente().getNombre());
            System.out.println("Libro: " + reserva1.getLibro().getTitulo());
            System.out.println("Fecha: " + reserva1.getFecha());
            System.out.println("Reserva registrada correctamente.");
        }

        // RESUMEN POR LIBROS

        System.out.println();
        System.out.println("=== RESUMEN LIBRO 1 ===");
        System.out.println("Libro: " + libro1.getTitulo());
        System.out.println("Cantidad de ventas: " + cantidadVentasLibro1);
        System.out.println("Dinero generado: " + dineroGeneradoLibro1);
        System.out.println("Stock actual: " + libro1.getStock());

        System.out.println();
        System.out.println("=== RESUMEN LIBRO 2 ===");
        System.out.println("Libro: " + libro2.getTitulo());
        System.out.println("Cantidad de ventas: " + cantidadVentasLibro2);
        System.out.println("Dinero generado: " + dineroGeneradoLibro2);
        System.out.println("Stock actual: " + libro2.getStock());

        System.out.println();
        System.out.println("=== RESUMEN LIBRO 3 ===");
        System.out.println("Libro: " + libro3.getTitulo());
        System.out.println("Cantidad de ventas: 0");
        System.out.println("Dinero generado: 0.0");
        System.out.println("Stock actual: " + libro3.getStock());
    }
}