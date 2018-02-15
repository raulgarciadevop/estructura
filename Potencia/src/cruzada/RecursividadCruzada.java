/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruzada;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author SB-C3
 */
public class RecursividadCruzada {//Recursividad Cruzada
    
    public RecursividadCruzada(){
        
    }
    
    public boolean positivo(int n){
        if(n>0) return true;
        return negativo(n);
    }
    
    public boolean negativo(int n){
        
        if(n<0)return false;
        return positivo(n);
    }
    
    public static void main(String[] args){
        RecursividadCruzada rc=new RecursividadCruzada();
        int n=1;
        
        
        showMessageDialog(null, "El numero "+n+" es: "+rc.negativo(n));
        //Puede iniciarse con cualquiera de las funciones
    }
    
    
    
    
    
}
