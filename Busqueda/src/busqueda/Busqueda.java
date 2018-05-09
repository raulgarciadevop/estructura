/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

/**
 *
 * @author SG-A1
 */
public class Busqueda {
    
    //Secuencial
    public static int secuencial(int[] A, int e){
        for(int i=0;i<A.length;i++)
            if(e==A[i])
                return i;
            
        return -1;
    }
    
    //Binaria
    public static int binaria(int[] arreglo, int valor){
        return binariaRecur(arreglo,valor,0,arreglo.length-1);
    }
    
    private static int binariaRecur(int[] arreglo, int valor, int inf,int sup){
        int mitad=(inf+sup)/2;
        if((inf>=sup)&&(arreglo[inf]!=valor))return -1;
        else if(arreglo[mitad]==valor)return mitad;
        else if(valor>arreglo[mitad])return binariaRecur(arreglo,valor,mitad+1,sup);
        return binariaRecur(arreglo,valor,inf,mitad-1);
    }
    
    //Hash
    private static int posHash(String nc){
        return Integer.parseInt(nc)%10;
    }
    
    public static int hash(String nc){
        return posHash(nc);
    }
    
    
    
    
    
    
}
