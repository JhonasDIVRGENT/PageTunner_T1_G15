package models;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private int stock;

    // usando list para  la relacion 1 a muchos
    private List<Venta> ventas;
    private List<Reserva> reservas;

    // los constructores
    public Libro() {
        ventas = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public Libro(String titulo, String autor, String isbn, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.stock = stock;

        ventas = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    // Getter - Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    // Metodo para descontar stock
    public void descontarStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
        }
    }

    // Metodo para que se puedan ver los datos
    public void mostrarDatos() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}