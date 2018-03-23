/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author FELICIANO
 */
public class Alumno {
    private int no_control, calificacion;
    private String nombre;

    public Alumno() {
    }

    public Alumno(int no_control, int calificacion, String nombre) {
        this.no_control = no_control;
        this.calificacion = calificacion;
        this.nombre = nombre;
    }

    //Setters
    public void setNo_control(int no_control) {
        this.no_control = no_control;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters

    public int getNo_control() {
        return no_control;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getNombre() {
        return nombre;
    }
    
    //toString

    @Override
    public String toString() {
        return "Alumno{" + "no_control=" + no_control + ", calificacion=" + calificacion + ", nombre=" + nombre + '}';
    }
    
    
    
}
