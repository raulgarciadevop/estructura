package main;

import java.util.Arrays;

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
         int t=n%2==0?n/2:(n+1)/2;//Si residuo de n/2 es mayor a 0, n=n+1/2
         int[] F1=new int[t];
         int[] F2=new int[t];
         int tam=0;
         
         for(int i=0;(tam=(int)Math.pow(2, i))<=t;i++){
             int f=0,f1=0,f2=0;
             /*Progreso en clase:*/
             while(f1<F1.length && f2<F2.length){
                 if(F1[f1]<F2[f2])
                     F[f++]=F1[f1++];
                 else
                     F[f++]=F2[f2++];
             
             }
             
             //Si sobran en F1, pasarlos a F
             if(f1<F1.length)
                 System.arraycopy(F1, f1, F, f, F1.length-f1);
             //Si sobran en F2, pasarlos a F
             else
                 System.arraycopy(F2, f2, F, f, F2.length-f2);
             //System.arraycopy(fuente1, srcIndex1, dest, destIndex,
                    //fuente1.length - srcIndex1);
         }
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
     
     
     //INTERNETTTTTTTTTTTTTT
     
     private static void merge(int[] fuente1, int[] fuente2, int[] dest) {
// indices de los 3 array
        int srcIndex1 = 0;
        int srcIndex2 = 0;
        int destIndex = 0;

// merge hasta que uno de los arrays fuentes este vacio
        while (srcIndex1 < fuente1.length && srcIndex2 < fuente2.length) {
            if (fuente1[srcIndex1] < fuente2[srcIndex2]) {//Si F1 es menor a F2, se pasa F1 actual a F original
                dest[destIndex] = fuente1[srcIndex1];
                srcIndex1++;
            } else {//Si no, se pasa F2 actual a F original
                dest[destIndex] = fuente2[srcIndex2];
                srcIndex2++;
            }
            destIndex++;
        }

        if (srcIndex1 < fuente1.length) {//Si queda sobrante en F1, se pasa a F original
            System.arraycopy(fuente1, srcIndex1, dest, destIndex,
                    fuente1.length - srcIndex1);
        } else {//Si queda sobrante en F2, se pasa a F original
            System.arraycopy(fuente2, srcIndex2, dest, destIndex,
                    fuente2.length - srcIndex2);
        }
    } // fin de merge();

// Ordena usando mezcla natural
// Parametros: el array a ordenar
    public static void sort(int arr[]) {
        if (arr.length <= 1) {
            return;
        }

        int tam1 = arr.length / 2;
        int tam2 = arr.length - tam1;

        int primeraMitad[] = new int[tam1];
        int segundaMitad[] = new int[tam2];
        
        

//Se copian los elementos del arreglo "arr", desde 0 hasta
//la mitad de "arr" al arreglo "primeraMitad"
        System.arraycopy(arr, 0, primeraMitad, 0, tam1);

//Se copian los elementos del arreglo "arr", desde la mitad hasta
//el tamaño de arr menos la mitad del tamaño de arr
//al arreglo "segundaMitad"
        System.arraycopy(arr, tam1, segundaMitad, 0, tam2);
        
        //arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

        sort(primeraMitad);
        sort(segundaMitad);

        System.out.print("PREORD F1"+Arrays.toString(primeraMitad)+"F2"+Arrays.toString(segundaMitad)+"Src"+Arrays.toString(arr));
        OrdenamientoExterno.merge(primeraMitad, segundaMitad, arr);
        System.out.print("POSTORD F1"+Arrays.toString(primeraMitad)+"F2"+Arrays.toString(segundaMitad)+"Src"+Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int A[]={6,3,1,2,10,8,4,9,5,7};
        sort(A);
        System.out.print("RES: "+Arrays.toString(A));
    }
}
