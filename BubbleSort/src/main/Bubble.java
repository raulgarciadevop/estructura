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
    
    
    public void sortS(String A[]){
        for(int p=1;p<=A.length;p++)
            for(int i=0;i<A.length-p;i++)
                if(A[i].compareToIgnoreCase(A[i+1])>0){//checkthis){
                    String aux=A[i];
                    A[i]=A[i+1];
                    A[i+1]=aux;
                }
        
    }
    
    public void sortS(Alumno A[], int e){
        for(int p=1;p<=A.length;p++)
            for(int i=0;i<A.length-p;i++)
                switch(e){
                    case 1:
                        if (A[i].getNo_ctrl().compareToIgnoreCase(A[i + 1].getNo_ctrl()) > 0) {//checkthis){
                            String aux = A[i].getNo_ctrl();
                            A[i] = A[i + 1];
                            A[i + 1].setNo_ctrl(aux);
                        }
                        break;
                        /*
                    case 2:
                        if (A[i].compareToIgnoreCase(A[i + 1]) > 0) {//checkthis){
                            String aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }
                        break;
                        */
                    case 3:
                        if (A[i].getEdad() > A[i + 1].getEdad()) {
                            int aux = A[i].getEdad();
                            A[i] = A[i + 1];
                            A[i + 1].setEdad(aux);
                        }
                        break;
                        /*
                    case 4:
                        if (A[i] > A[i + 1]) {
                            int aux = A[i];
                            A[i] = A[i + 1];
                            A[i + 1] = aux;
                        }
                        break;
                        */
                }
                
                /*
                if(A[i].compareToIgnoreCase(A[i+1])>0){//checkthis){
                    String aux=A[i];
                    A[i]=A[i+1];
                    A[i+1]=aux;
                }
                */
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
   
    
}
