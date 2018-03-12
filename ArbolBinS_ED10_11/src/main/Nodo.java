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
    private String info;
    private Nodo izq,der;

    public Nodo() {
    }

    public Nodo(String info) {
        this.info = info;
        izq=der=null;
    }
    
    //Setters

    public void setInfo(String info) {
        this.info = info;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
    //Getters

    public String getInfo() {
        return info;
    }

    public Nodo getIzq() {
        return izq;
    }

    public Nodo getDer() {
        return der;
    }
    
    
    
    
    
    
    
}
