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
public class ColaString {
    private int tam, fin;
    private String[] C;

    public ColaString() {
        tam=0;
        fin=-1;
    }

    public ColaString(int t) {
        this.tam = t;
        this.fin = -1;
        this.C = new String[tam];
    }
    
    //Entrada
    public void entrada(String cad){
        if(!estaLleno())
            C[++fin]=cad;
        else
            javax.swing.JOptionPane.showMessageDialog(null, "Cola llena.");
    }
    
    //Salida
    public String salida(){
        if(!estaVacio())
            return C[fin--];
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Cola vacia.");
            return null;
        }
    }
    
    //Esta lleno, vacio, etc
    public boolean estaVacio(){
        return fin==-1;
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

    public void setC(String[] C) {
        this.C = C;
    }
    
    //Getters

    public int getTam() {
        return tam;
    }

    public int getFin() {
        return fin;
    }

    public String[] getC() {
        return C;
    }
    
    
    
}
