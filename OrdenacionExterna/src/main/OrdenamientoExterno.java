package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liliana Gonzalez
 */
public class OrdenamientoExterno {
    
     public static int [] intercalat(int[] A, int[] B){
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
         
         while(tam<=n/2){
             tam=(int)Math.pow(2, i);
             
             
             
             
             i++;
         }
         
         return F;
     }
}
