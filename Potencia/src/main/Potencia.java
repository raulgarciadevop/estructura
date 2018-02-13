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
public class Potencia {
    
    public Potencia(){
        
    }
    
    public int pot(int x,int n){
        int p=1;
        for(int i=1;i<=n;i++){
            p=p*x;
        }
        
        return p;
    }
    
    public int potR(int x,int n){
        if(n==0) return 1;
        return x*potR(x,n-1);
    }
    
    public static void main(String args[]){
        Potencia pt=new Potencia();
        
        
    }
    
}
