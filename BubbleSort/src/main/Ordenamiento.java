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
    
    //BURBUJA
    
    public void bubble(int A[]){//Integer
        for(int p=1;p<=A.length;p++)
            for(int i=0;i<A.length-p;i++)
                if(A[i]>A[i+1]){
                    int aux=A[i];
                    A[i]=A[i+1];
                    A[i+1]=aux;
                }
        
    }
    
    public void bubble(String[] A){//String
        for(int p=1;p<=A.length;p++)
            for(int i=0;i<A.length-p;i++)
                if(A[i].compareToIgnoreCase(A[i+1])>0){//checkthis){
                    String aux=A[i];
                    A[i]=A[i+1];
                    A[i+1]=aux;
                }
    }
    
    public void bubble(Alumno[] A, int c){//Alumno
        for(int p=1;p<=A.length;p++)
            for(int i=0;i<A.length-p;i++)
                switch(c){
                    case 1://String
                        if (A[i].getNo_ctrl().compareToIgnoreCase(A[i + 1].getNo_ctrl()) > 0) {//checkthis){
                            String aux = A[i].getNo_ctrl();
                            A[i] = A[i + 1];
                            A[i + 1].setNo_ctrl(aux);
                        }
                        break;
                        
                    case 2://String
                        if (A[i].getNombre().compareToIgnoreCase(A[i + 1].getNo_ctrl()) > 0) {//checkthis){
                            String aux = A[i].getNombre();
                            A[i] = A[i + 1];
                            A[i + 1].setNombre(aux);
                        }
                        break;
                        
                    case 3:
                        if (A[i].getEdad() > A[i + 1].getEdad()) {
                            int aux = A[i].getEdad();
                            A[i] = A[i + 1];
                            A[i + 1].setEdad(aux);
                        }
                        break;
                        
                    case 4:
                        if (A[i].getCalif() > A[i + 1].getCalif()) {
                            int aux = A[i].getCalif();
                            A[i] = A[i + 1];
                            A[i + 1].setCalif(aux);
                        }
                        break;
                        
                }
    }
    
    
    //QUICKSORT
    
    public void quicksort(int[] A , int i, int f){
        
    }
    
    public void shell(){
        
    }
    
    public int[] radix(int[] A){
        int mayor=A[0],n=A.length;
        for(int i=0;i<n;i++)
            if(A[i]>mayor)
                mayor=A[i];
        
        int d=(mayor+"").length();
        //Buscar cola simple
        
        ColaSimple M[] =new ColaSimple[10];
        
        for(int i=1;i<n;i++)
            M[i]=new ColaSimple(n);
        
        //int c=0;
        
        for(int dig=1;dig<=d;dig++){
            for(int i=0;i<n;i++){
                String num=A[i]+"";
                int inicio=num.length()-dig,pos,fin=inicio+1;
                if(inicio<0)
                    pos=0;
                pos=Integer.parseInt(num.substring(inicio,fin));
                M[pos].inscola(A[i]);//Insertar
            }
            int a=0;
            
            for(int c=0;c<10;c++)
                while(M[c].getTope()>=0){
                    //A[a++]=M[c].sacar();
                }
            
        }
        return A;
        
        
    }
    
    /*
    
    
    
                if(A[i].compareToIgnoreCase(A[i+1])>0){//checkthis){
                    String aux=A[i];
                    A[i]=A[i+1];
                    A[i+1]=aux;
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
        
        while(i<f){
            
            while(A[i]<=piv && i<f)
            i++;
            
            while(A[f])
            
        }
        
        if()
        
            
    }
    */
}


// tienes cola simpl

//Reciben arreglo, encuentran el mayor 