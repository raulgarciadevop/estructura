/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import objetos.Usuario;

/**
 *
 * @author SB-C3
 */
public class NodoDE {
    private Usuario usuario;
    private NodoDE ant, sig;

    public NodoDE() {
    }

    public NodoDE(Usuario dato) {
        this.usuario = dato;
        ant=sig=null;
    }
    
    //Setters

    public void setUsuario(Usuario dato) {
        this.usuario = dato;
    }

    public void setAnt(NodoDE ant) {
        this.ant = ant;
    }

    public void setSig(NodoDE sig) {
        this.sig = sig;
    }
    
    //Getters

    public Usuario getUsuario() {
        return usuario;
    }

    public NodoDE getAnt() {
        return ant;
    }

    public NodoDE getSig() {
        return sig;
    }
    
    
    
    
}
