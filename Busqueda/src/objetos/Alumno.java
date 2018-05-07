/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author SG-A1
 */
public class Alumno {
    private int edad,calif;
    private String nombre, nc;

    public Alumno() {
    }

    public Alumno(String nc, String nombre, int edad, int calif) {
        this.edad = edad;
        this.calif = calif;
        this.nombre = nombre;
        this.nc = nc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", nc=" + nc ;
    }
    
    
    
    
    
}
