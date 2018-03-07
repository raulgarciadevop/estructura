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
    private Alumno d;
    private Nodo sig, ant;

    public Nodo() {
        sig=ant=null;
    }

    public Nodo(Alumno d) {
        this.d = d;
        sig=ant=null;
    }
    
    //Setters

    public void setD(Alumno d) {
        this.d = d;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    
    //Getters

    public Alumno getD() {
        return d;
    }

    public Nodo getSig() {
        return sig;
    }

    public Nodo getAnt() {
        return ant;
    }
    
    
    
    
    
    
    
    
}
