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
public class Bubble {
    
    public Bubble(){
        
    }
    
    /*
    if(A[i]<A[i]){
                
            }
    */
    
    public void sort(int A[]){
        for(int p=1;p<=A.length;p++)
            for(int i=0;i<A.length-p;i++)
                if(A[i]>A[i+1]){
                    int aux=A[i];
                    A[i]=A[i+1];
                    A[i+1]=aux;
                }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
