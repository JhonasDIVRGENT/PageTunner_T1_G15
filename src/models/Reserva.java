package models;

import java.util.Date;

public class Reserva {
    //Cliente- Libro son referencia a un objeto de la clase del mismo nombre 
    private Cliente cliente;
    private Libro libro;
    private Date fecha;
    
    //Constructores
    public Reserva() {
    }

    public Reserva(Cliente cliente, Libro libro, Date fecha) {
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = fecha;
    }
    //Getter-Setter
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
}
