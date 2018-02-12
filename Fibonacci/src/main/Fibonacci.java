/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author SB-A1
 */
public class Fibonacci {
    
    public Fibonacci(){
        
    }
    
    int fib(int n){
        //Iniciar
        if(n<=1)return n;
        else return fib(n-1)+fib(n-2);
        //Terminar
    }
    
    int fibo(int n){
        //Iniciar
        if(n<=1) return n;
        int fibo=1;
        int fiboPrev=1;
        for(int i=2;i<n;i++){
            int temp=fibo;
            fibo+=fiboPrev;
            fiboPrev=temp;
        }
        return fibo;
        //Terminar
    }
    
    /*
    String fib(int n){
        String f="";
        int a=0,b=0,c=0;
        
        if(n==1) return 0;
        
        for(int i=2;i<=n;i++){
            c=a+b;
            f=f+c;
            
        }
        
        return f;
    }
    */
    
    
    
    
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
        Fibonacci fib=new Fibonacci();
        int n=4;
        
        long ti1,ti2,tf1,tf2;
        int res1,res2;
        String res;
        
        
        
        //No recursiva
        ti1=System.nanoTime();
        res1=fib.fibo(n);
        tf1=System.nanoTime();
        
        //Recursiva
        ti2=System.nanoTime();
        res2=fib.fib(n);
        tf2=System.nanoTime();
        
        res="No recursiva:\n"
          + "Resultado: "+res1+"\n"
          + "Tiempo (Milisegundos): "+(tf1-ti1)+"\n"
          + "\n"
          + "Recursiva:\n"
          + "Resultado: "+res2+"\n"
          + "Tiempo (Milisegundos): "+(tf2-ti2);
        
        showMessageDialog(null, res);
        
        String rateA="",rateB="";
        for(int i=0;i<=35;i++){
            //No recursiva
        ti1=System.nanoTime();
        res1=fib.fibo(i);
        tf1=System.nanoTime();
        rateA+=i+" - "+(tf1-ti1)+"\n";
        
        //Recursiva
        ti2=System.nanoTime();
        res2=fib.fib(i);
        tf2=System.nanoTime();
        rateB+=i+" - "+(tf2-ti2)+"\n";
        
        }
        
        System.out.println("Tabla A:\n"+rateA);
        System.out.println("Tabla B:\n"+rateB);
        
        showMessageDialog(null, "Tabla A:\n"+rateA);
        showMessageDialog(null, "Tabla B:\n"+rateB);
        
        /*
        Tarea:
        
        - Obtener eta.
        - Graficar el eta. (Estimated time elapsed)
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
