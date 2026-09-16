package models;

import java.util.Date;

public class Venta {
    private Cliente cliente;
    private Libro libro;
    private Date fecha;
    private int cantidad;

    public Venta() {
    }
    //Cliente- Libro son referencia a un objeto de la clase del mismo nombre 
    public Venta(Cliente cliente, Libro libro, Date fecha, int cantidad) {
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    //Constructores

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //Getter-Setter
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
// Metodo para calcular  el total de las ventas
    public double calcularTotal() {
        return libro.getPrecio() * cantidad;
    }
}
