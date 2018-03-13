/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intt;

/**
 *
 * @author SB-C3
 */
public class NodoInt {
    private int info;
    private NodoInt izq,der;

    public NodoInt() {
        izq=der=null;
    }
    
    public NodoInt(int info) {
        this.info = info;
        izq=der=null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NodoInt getIzq() {
        return izq;
    }

    public void setIzq(NodoInt izq) {
        this.izq = izq;
    }

    public NodoInt getDer() {
        return der;
    }

    public void setDer(NodoInt der) {
        this.der = der;
    }
    
    
    
    
    
}
