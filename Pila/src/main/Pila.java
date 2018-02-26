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
public class Pila {
    private int p[];
    private int tam;
    private int tope=0;
    
    public Pila(int t){
        tope=tam=t;
    }
    
    public Pila(){
        tope=tam=0;
    }
    
    //Func
    public void ingresar(int n){
        if(tam<tope)
            p[++tope]=n;
    }
    
    public int obtener(){
        return p[tope];
    }
    
    public void setTam(int t){
        this.tam=t;
    }
    
    public boolean estaVacia(){
        return this.tam==0;
    }
    
    public int getTope(){
        return tope;
    }
    
    public int getTam(){
        return tam;
    }

    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
    }
    * */
    
    
    /*
        Hacer una interfaz
        
        Completar la clase
    
    */
    
    
    
    
}
