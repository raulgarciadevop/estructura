/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author SB-A1
 */
public class BusquedaBinaria {
    
    public BusquedaBinaria(){
        
    }
    
    public int bBinRecur(int[] arreglo, int valor){
        return binariaRecur(arreglo,valor,0,arreglo.length-1);
    }
    
    public int binariaRecur(int[] arreglo, int valor, int inf,int sup){
        int mitad=(inf+sup)/2;
        if((inf>=sup)&&(arreglo[inf]!=valor))return -1;
        else if(arreglo[mitad]==valor)return mitad;
        else if(valor>arreglo[mitad])return binariaRecur(arreglo,valor,mitad+1,sup);
        return binariaRecur(arreglo,valor,inf,mitad-1);
    }
}
