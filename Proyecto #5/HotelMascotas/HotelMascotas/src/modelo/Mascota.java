/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Mascota {
    
    private String nombre;
    private String raza;
    private int edad;
    private String nescesidades;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, int edad, String nescesidades) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.nescesidades = nescesidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNescesidades() {
        return nescesidades;
    }

    public void setNescesidades(String nescesidades) {
        this.nescesidades = nescesidades;
    }
    
    
    
}
