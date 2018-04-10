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
public class Ordenamiento {
    
    public Ordenamiento(){
        
    }
    
    /*
    if(A[i]<A[i]){
                
            }
    */
    
    public void bubble(int A[]){
        for(int p=1;p<=A.length;p++)
            for(int i=0;i<A.length-p;i++)
                if(A[i]>A[i+1]){
                    int aux=A[i];
                    A[i]=A[i+1];
                    A[i+1]=aux;
                }
        
    }
    
    public void quicksort(int[] A, int i, int f){
        int aux;
        int piv=A[f];
        
        while(i!=f){
            
        }
        
        
        
        
        
        
        
        
        
        
        //if(i==f)
          //  return;
        //else{
          //  piv=A[f];
        //}
        
        
        
        while(A[i]<= piv){
            i++;
            aux=A[i];
            A[i]=
            
        }
        
        while(A[f]>piv){
            f--;
        }
        
        if(A[i]<A[f]){
            
        }
        
        
        
            
        
        /*
        while(i<f){
            
            while(A[i]<=piv && i<f)
            i++;
            
            while(A[f])
            
        }
        
        if()
        */
            
    }
    
}
