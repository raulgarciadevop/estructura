/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import exceptions.EstaLlenaException;
import exceptions.EstaVaciaException;

/**
 *
 * @author SB-C3
 */
public class ColaAlumno {
    private int tam, fin;
    private Alumno[] C;

    public ColaAlumno() {
        tam=0;
        fin=-1;
    }

    public ColaAlumno(int t) {
        this.tam = t;
        this.fin = -1;
        this.C = new Alumno[tam];
    }
    
    //Entrada
    public void entrada(Alumno al) throws EstaLlenaException{
        if(!estaLleno())
            C[++fin]=al;
        else{
            throw new EstaLlenaException("Cola llena.");
        }
    }
    
    public void entrada(int no_control, int calificacion, String nombre) throws EstaLlenaException{
        if(!estaLleno()){
            Alumno al=new Alumno(no_control,calificacion,nombre);
            C[++fin]=al;
        }
        else{
            throw new EstaLlenaException("Cola llena.");
        }
    }
    
    //Salida
    public Alumno salida() throws EstaVaciaException{
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

    public void setC(Alumno[] C) {
        this.C = C;
    }
    
    //Getters

    public int getTam() {
        return tam;
    }

    public int getFin() {
        return fin;
    }

    public Alumno[] getC() {
        return C;
    }
    
    
    
}
