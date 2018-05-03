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

    public Ordenamiento() {

    }

    //BURBUJA
    public void bubble(int A[]) {//Integer
        for (int p = 1; p <= A.length; p++) {
            for (int i = 0; i < A.length - p; i++) {
                if (A[i] > A[i + 1]) {
                    int aux = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = aux;
                }
            }
        }

    }

    public void bubble(String[] A) {//String
        for (int p = 1; p <= A.length; p++) {
            for (int i = 0; i < A.length - p; i++) {
                if (A[i].compareToIgnoreCase(A[i + 1]) > 0) {//checkthis){
                    String aux = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = aux;
                }
            }
        }
    }


    //QUICKSORT
    public void quicksort(int[] A, int i, int f) {
        int piv = A[f];
        while (i != f) {
            while (A[i] <= piv) {
                i++;
            }
            while (A[f] > piv) {
                f--;
            }
            if (A[i] > A[f]) {
                int aux = A[i];
                A[i] = A[f];
                A[f] = aux;
            }//if
        }//while
    }

    public void quicksort(String[] A, int izq, int der) {
        String pivote = A[izq];
        int i = izq;
        int j = der;
        String aux;
        while (i < j) {
            while (A[i].compareToIgnoreCase(pivote) <= 0 && i < j) {
                i++;
            }
            while (A[j].compareToIgnoreCase(pivote) > 0) {
                j--;
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1) {
            quicksort(A, izq, j - 1);
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der);
        }
    }

    //SHELL
    public void shell(int[] A, boolean asc) {
        int n = A.length;
        int c = n / 2;
        boolean cambios = true;
        while (cambios) {
            cambios = false;
            for (int i = 0; i < n - c; i++) {
                if (asc && A[i] > A[i + c]) {
                    int aux = A[i];
                    A[i] = A[i + c];
                    A[i + c] = aux;
                    cambios = true;
                } else if (!asc && A[i] < A[i + c]) {
                    int aux = A[i];
                    A[i] = A[i + c];
                    A[i + c] = aux;
                    cambios = true;
                }
            }
            if (c != 1) {
                c = c / 2;
            }
        }
    }

    public void shell(String[] A) {
        int n = A.length;
        int c = n / 2;
        boolean cambios = true;
        while (cambios) {
            cambios = false;
            for (int i = 0; i < n - c; i++) {
                if (A[i].compareToIgnoreCase(A[i + c]) > 0) {
                    String aux = A[i];
                    A[i] = A[i + c];
                    A[i + c] = aux;
                    cambios = true;
                }
            }
            if (c != 1) {
                c = c / 2;
            }
        }//while
    }

}
