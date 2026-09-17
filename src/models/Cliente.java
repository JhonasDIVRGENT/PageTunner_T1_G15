package models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String dni;
    private String correo;

    //  usando list  para la relación  1 a muchos

    private List<Venta> ventas;
    private List<Reserva> reservas;

    // constructores
    public Cliente() {
        ventas = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public Cliente(String nombre, String dni, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;

        ventas = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    // Getter - Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    // Se creo un metodo para mostrar los datos del cliente 
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Correo: " + correo);
    }
}