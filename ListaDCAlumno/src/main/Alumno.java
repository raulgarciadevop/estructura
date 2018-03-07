/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author SB-C3
 */
public class Alumno {
    private String nc, nombre;
    private int edad;

    public Alumno() {
    }

    public Alumno(String nc, String nombre, int edad) {
        this.nc = nc;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    //Setters

    public void setNc(String nc) {
        this.nc = nc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //Getters

    public String getNc() {
        return nc;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nc=" + nc + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
