/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaSucesiva;

/**
 *
 * @author SB-C3
 */
public class DivisionRestaSuc {
    
    //No recursiva
    public int drc(int n, int d){
        //if(den<num)
        int r=0;
        
        while(d<n){
            r+=n-d;
            r++;
            
        }
        
        return r;
    }
    
    //Recursiva
    public int drcR(int n, int d){
        int r;
        if(n<d)return 0;
        return 1;
    }
    
    /*
    TAREA:
    - Implementar decimales (sin cambiar de int, concatenando)
    
    - Ejemplo de recursividad
    
    */
    
}
