/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;

/**
 *
 * @author SB-A1
 */
public class Fibonacci {
    
    public Fibonacci(){
        
    }
    
    String fib(int n){
        String f="";
        int a=0,b=0,c=0;
        
        for(int i=2;i<=n;i++){
            c=a+b;
            f=f+c;
            
        }
        
        return f;
    }
    
    public void algoritm(int n){
        int[] arr=new int[n];
        
        for(int a=0;a<n;a++)
            for(int b=0;b<n;b++)
                for(int c=0;c<n;c++){
                    
                }
                    //arr[]
                    
    }
    
    int[][] multiplica(int[][] a,int[][] b){
        int c[][]=new int[a.length][b[0].length];
        
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b[0].length;j++)
                for(int k=0;k<a[0].length;k++)
                    c[i][j]+=a[i][k]*b[k][j];
                
        return c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a={{2,3},{4,5}};
        int[][] b={{1},{2}};
        Fibonacci fib=new Fibonacci();
        
        int[][] c=fib.multiplica(a, b);
        
        Arrays.deepToString(c);
        
        
        /*
        int aux=A[i];
        A[i]=A[i+1];
        A[i-1]=A[i];
        */
        
        
        
        
    }
    
    /*
    Tarea:
        Crear interfaz visual que multiplique  matrices:
        
        A       B   C <- Autogenerado   Boton->[*]
        [][][]* []  []
        [][][]* []  []
        [][][]* []  []
    
    */
    
}
