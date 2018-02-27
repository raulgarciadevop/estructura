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
public class PilaLibros {
    
    private int tam, tope;
    private Libro[] L;

    public PilaLibros() {
        tam=0;
        tope=-1;
    }

    public PilaLibros(int t) {
        tam = t;
        //tope = t;
        tope=-1;
        
        L=new Libro[tam];
    }
    
    public boolean estaVacia(){
        return tope==-1;
    }
    
    public boolean estaLlena(){
        return tope==tam-1;
    }
    
    public int getTam(){
        return tam;
    }
    
    public int getTope(){
        return tope;
    }
    
    public void ingresar(Libro l){
        if(!estaLlena())
            L[++tope]=l;
        else
            javax.swing.JOptionPane.showMessageDialog(null, "Pila llena");
    }
    
    public void ingresar(String ISBN, String autor, String nombre, int paginas, int precio){
        if(!estaLlena())
            L[++tope]=new Libro(ISBN,autor,nombre,paginas,precio);
        else
            javax.swing.JOptionPane.showMessageDialog(null, "Pila llena");
        
    }
    
    public Libro obtener(){
        if(!estaVacia())
            return L[tope--];
        else
            return null;
    }
    
    
    
    
}
