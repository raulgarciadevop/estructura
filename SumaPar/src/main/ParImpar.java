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
public class ParImpar {
    
    //Ingresar n, retornar boolean si es par o no
    
    public ParImpar(){
        
    }
    
    public boolean par(int n){
        if(n==0) return true;
        return impar(n-1);
    }
    
    public boolean impar(int n){
        if(n==0) return false;
        return par(n-1);
    }
    
    public static void main(String[] args){
        ParImpar pi=new ParImpar();
    }
    
    
    /*
        Examen el jueves
    
        - Ejemplo de recursividad cruzada
        - MCD recursivo
    */
    
}
