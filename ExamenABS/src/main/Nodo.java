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
public class Nodo {
    private Alumno info;
    private Nodo izq,der;

    public Nodo() {
    }

    public Nodo(Alumno info) {
        this.info = info;
        izq=der=null;
    }
    
    //Setters

    public void setInfo(Alumno info) {
        this.info = info;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
    //Getters

    public Alumno getInfo() {
        return info;
    }

    public Nodo getIzq() {
        return izq;
    }

    public Nodo getDer() {
        return der;
    }
    
    
    
    
    
    
    
}
