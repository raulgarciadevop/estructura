/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import exceptions.EstaLlenaException;
import exceptions.EstaVaciaException;

/**
 *Salida por fin, sin recorrer datos 
 * @author SB-C3
 */
public class ColaCircular {
    private int inicio,fin, tam;
    private Object[] C;

    public ColaCircular() {
        inicio=fin=0;
    }

    public ColaCircular(int tam) {
        this.tam = tam;
        inicio=fin=0;
        C=new Object[tam];
    }
    
    //Entrada
    public void entrada(Object dato) throws EstaLlenaException{
        if(!estaLlena()){
            C[fin++]=dato;
            if(fin==tam)
                fin=0;
        }
        else
            throw new EstaLlenaException("Cola llena");
    }
    
    
     //Salida
    public Object salida() throws EstaVaciaException{
        
        if(!estaVacio()){
            Object d=C[inicio++];
            if(inicio==tam)
                inicio=0;
            return d;
        }
        
        else
            throw new EstaVaciaException("Cola vacia");
        
    }
    
    //Esta lleno, vacio, etc
    public boolean estaVacio(){
        return fin==inicio; //|| fin==0;//inicio==fin+1
    }
    
    public boolean estaLlena(){
        return inicio==fin+1;
    }
    
    
    
    
    
}
