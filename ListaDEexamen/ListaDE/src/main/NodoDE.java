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
public class NodoDE {
    private Materia dato;
    private NodoDE ant, sig;

    public NodoDE() {
    }

    public NodoDE(Materia dato) {
        this.dato = dato;
        ant=sig=null;
    }
    
    //Setters

    public void setDato(Materia dato) {
        this.dato = dato;
    }

    public void setAnt(NodoDE ant) {
        this.ant = ant;
    }

    public void setSig(NodoDE sig) {
        this.sig = sig;
    }
    
    //Getters

    public Materia getDato() {
        return dato;
    }

    public NodoDE getAnt() {
        return ant;
    }

    public NodoDE getSig() {
        return sig;
    }
    
    
    
    

    
    
    
    
    
}
