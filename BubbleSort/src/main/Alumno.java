/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author SB-A1
 */
public class Alumno {
    private String no_ctrl,nombre;
    private int edad, calif;

    public Alumno() {
    }

    public Alumno(String no_ctrl, String nombre, int edad, int calif) {
        this.no_ctrl = no_ctrl;
        this.nombre = nombre;
        this.edad = edad;
        this.calif = calif;
    }
    
    //Setters

    public void setNo_ctrl(String no_ctrl) {
        this.no_ctrl = no_ctrl;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }
    
    //Getters

    public String getNo_ctrl() {
        return no_ctrl;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCalif() {
        return calif;
    }

    
    //To string 
    @Override
    public String toString() {
        return "Alumno{" + "no_ctrl=" + no_ctrl + ", nombre=" + nombre + ", edad=" + edad + ", calif=" + calif + '}';
    }
    
    
    
    
    
}
