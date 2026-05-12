/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Dueño extends Persona{
    
    private Mascota mascota;
    private Reserva reserva;

    public Dueño() {
    }

    public Dueño(Mascota mascota, Reserva reserva) {
        this.mascota = mascota;
        this.reserva = reserva;
    }

    public Dueño(Mascota mascota, Reserva reserva, String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
        this.mascota = mascota;
        this.reserva = reserva;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
