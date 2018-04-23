package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RG
 */
public class OrdenamientoExterno {
    
     public static int [] intercalar(int[] A, int[] B){
         int tc = A.length + B.length;
         int C[] = new int[tc];
         int ia = 0, ib = 0, ic = 0;

         while (ia < A.length && ib < B.length) {
             if (A[ia] < B[ib])
                 C[ic++] = A[ia++];
             else 
                 C[ic++] = B[ib++];
             
         }
         while (ia < A.length) 
             C[ic++] = A[ia++];
         
         while (ib < B.length) 
             C[ic++] = B[ib++];
         
         // asi seria con un for el segundo fo(;)
         return C;
     }
     
     public static int[] mezclaDirecta(int[] F){
         int n=F.length;
         int[] F1=new int[n];
         int[] F2=new int[n];
         int tam=0,i=0;
         
         boolean par=(F.length)%2>0;
         
         if(par){
             while(tam<=n/2){
                 tam=(int)Math.pow(2, i);
                 
                 
                 i++;
             }
         }
             
             
         /*
         while(tam<=n/2){
             tam=(int)Math.pow(2, i);
             i++;
         }
        */
         
         return F;
     }
     
     public static int[] mDirecta(int[] F){
         int i,j,k;
         if(F.length>1){
             int nElementosIzq=F.length/2;
             int nElementosDer=F.length-nElementosIzq;
             int[] arregloIzq=new int[nElementosIzq];
             int[] arregloDer=new int[nElementosDer];
             
             //Se divide el arreglo original en:
             
             //Izquierda
             for(i=0;i<nElementosIzq;i++)
                 arregloIzq[i]=F[i];
             //Derecha
             for(i=nElementosIzq;i<nElementosIzq+nElementosDer;i++)
                 arregloDer[i-nElementosIzq]=F[i];
             
             //Recursividad
             arregloIzq=mDirecta(arregloIzq);
             arregloDer=mDirecta(arregloDer);
             i=j=k=0;
             while(arregloIzq.length!=j && arregloDer.length!=k){
                 if(arregloIzq[j]<arregloDer[k]){
                     F[i]=arregloIzq[j];
                     i++;
                     k++;
                 }
                 else{
                     F[i]=arregloDer[k];
                     i++;
                     k++;
                 }
             }
             
             while(arregloIzq.length!=j){
                 F[i]=arregloIzq[j];
                 i++;j++;
             }
             while(arregloDer.length!=k){
                 F[i]=arregloDer[k];
                 i++;k++;
             }
             
             
         }
         return F;
     }
}
