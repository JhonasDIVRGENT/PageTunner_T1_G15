package models;

import java.util.Date;

public class Venta {

    private Cliente cliente;
    private Libro libro;
    private Date fecha;
    private int cantidad;

    // Constructores
    public Venta() {
    }

    // Cliente y Libro son referencias a objetos de esas clases
    public Venta(Cliente cliente, Libro libro, Date fecha, int cantidad) {
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    // Getter - Setter
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Metodo para calcular el total de la venta
    public double calcularTotal() {
        return libro.getPrecio() * cantidad;
    }

    // Metodo para mostrar datos
    public void mostrarDatos() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Fecha: " + fecha);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + calcularTotal());
    }
}