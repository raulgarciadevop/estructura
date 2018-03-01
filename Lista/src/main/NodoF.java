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
public class NodoF {
    private float info;
    private NodoF sig;

    public NodoF() {
        info=0;
        sig=null;
    }

    public NodoF(float info, NodoF sig) {
        this.info = info;
        this.sig = sig;
    }

    public NodoF(float info) {
        this.info = info;
        sig=null;        
    }

    
    //Setters
    public void setInfo(float info) {
        this.info = info;
    }

    public void setSig(NodoF sig) {
        this.sig = sig;
    }
    
    //Getters

    public float getInfo() {
        return info;
    }

    public NodoF getSig() {
        return sig;
    }
    
    
    
    
    
    
    
}
