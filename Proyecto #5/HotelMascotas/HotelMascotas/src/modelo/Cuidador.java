/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Cuidador extends Persona {
    
    private int nivelExperiencia;
    private String [] razas;

    public Cuidador() {
    }
    
    public Cuidador(int nivelExperiencia, String[] razas) {
        this.nivelExperiencia = nivelExperiencia;
        this.razas = razas;
    }

    public Cuidador(int nivelExperiencia, String[] razas, String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
        this.nivelExperiencia = nivelExperiencia;
        this.razas = razas;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public String[] getRazas() {
        return razas;
    }

    public void setRazas(String[] razas) {
        this.razas = razas;
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
