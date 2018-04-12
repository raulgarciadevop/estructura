/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Liliana Gonzalez
 */
public class ordShell {

    public static void ordShell(int A[]){
      int n=A.length;
      int c=n/2;
      boolean cambios= true;
while(cambios){
    cambios=false;
    for(int i=0;i<n-c;i++)
        if(A[i]>A[i+c]){
            int aux= A[i]; A[i]= A[i+c]; A[i+c]= aux; cambios = true; }
           if(c!=1) c=c/2;


}
    }
    
    public static void Intercambia(int a, int b){
       int aux= a; a=b; b=aux;
       
        
    }
    
    
    
    
    
    public static void ordShellAsdente(int A[], boolean asc){
      int n=A.length;
      int c=n/2;
      boolean cambios= true;
while(cambios){
    cambios=false;
    for(int i=0;i<n-c;i++)
        if(asc && A[i]> A[i+c]){int aux= A[i]; A[i]= A[i+c]; A[i+c]= aux; cambios = true; }
        else if(!asc && A[i]> A[i+c]){int aux= A[i]; A[i]= A[i+c]; A[i+c]= aux; cambios = true; }
           if(c!=1) c=c/2;


}
    }
    
    // nhacerlo con el compare to
  // hacerlo de string
}

