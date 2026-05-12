/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Reserva {
    
    //private Servicio servicio;
    private Fecha fechaIngreso;
    private int duracion;
    private String serviciosAdicionales; //alimentacion especial, paseo, baño
    private Cuidador cuidador;
    private Mascota mascota;

    public Reserva() {
    }

    public Reserva(Fecha fechaIngreso, int duracion, String serviciosAdicionales, Cuidador cuidador, Mascota mascota) {
        this.fechaIngreso = fechaIngreso;
        this.duracion = duracion;
        this.serviciosAdicionales = serviciosAdicionales;
        this.cuidador = cuidador;
        this.mascota = mascota;
    }

    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(String serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    
    
}
