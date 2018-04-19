/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import exceptions.EstaLlenaException;
import exceptions.EstaVaciaException;

/**
 *
 * @author SB-C3
 */
public class ColaSimple {
    private int tam, fin;
    private int[] C;

    public ColaSimple() {
        tam=0;
        fin=-1;
    }

    public ColaSimple(int t) {
        this.tam = t;
        this.fin = -1;
        this.C = new int[tam];
    }
    
    //Entrada
    public void entrada(int al) throws EstaLlenaException{
        if(!estaLleno())
            C[++fin]=al;
        else{
            throw new EstaLlenaException("Cola llena.");
        }
    }
    
    //Salida
    public int salida() throws EstaVaciaException{
        
        if(!estaVacio())
            return C[fin--];
        else{
            //return null;
            //javax.swing.JOptionPane.showMessageDialog(null, "Cola vacia.");
            throw new EstaVaciaException("Cola vacia");
        }
    }
    
    //Esta lleno, vacio, etc
    public boolean estaVacio(){
        return fin==-1 || fin==0;
    }
    
    public boolean estaLleno(){
        return fin==tam-1;
    }

    //Setters
    public void setTam(int tam) {
        this.tam = tam;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public void setC(int[] C) {
        this.C = C;
    }
    
    //Getters

    public int getTam() {
        return tam;
    }

    public int getFin() {
        return fin;
    }

    public int[] getC() {
        return C;
    }
    
    
    
}
