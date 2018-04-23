/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Objects.ColaSimple;
import Objects.Materia;
import exceptions.EstaLlenaException;
import exceptions.EstaVaciaException;

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

    public void bubble(Materia[] A, int c) {//Alumno
        for (int p = 1; p <= A.length; p++) {
            for (int i = 0; i < A.length - p; i++) {
                switch (c) {
                    case 0://String
                        if (A[i].getNombre().compareToIgnoreCase(A[i + 1].getNombre()) > 0) {//checkthis){
                            String aux = A[i].getNombre();
                            A[i].setNombre(A[i+1].getNombre());
                            A[i + 1].setNombre(aux);
                        }
                        break;

                    case 1://int
                        if (A[i].getCalif() > A[i + 1].getCalif()) {
                            int aux = A[i].getCalif();
                            A[i].setCalif(A[i+1].getCalif());
                            A[i + 1].setCalif(aux);
                        }
                        break;

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

    public void quicksort(Materia[] A, int izq, int der, int c) {
        switch (c) {
            case 0://Nombre
                String pivote;
                int i,j;
                String aux;
                pivote = A[izq].getNombre();
                i = izq;
                j = der;
                while (i < j) {
                    while (A[i].getNombre().compareToIgnoreCase(pivote) <= 0 && i < j) {
                        i++;
                    }
                    while (A[j].getNombre().compareToIgnoreCase(pivote) > 0) {
                        j--;
                    }
                    if (i < j) {
                        aux = A[i].getNombre();
                        A[i].setNombre(A[j].getNombre());
                        A[j].setNombre(aux);
                    }
                }
                A[izq].setNombre(A[j].getNombre());
                A[j].setNombre(pivote);
                if (izq < j - 1) {
                    quicksort(A, izq, j - 1, 0);
                }
                if (j + 1 < der) {
                    quicksort(A, j + 1, der, 0);
                }
                break;

            case 1://Calificacion
                int piv = A[izq].getCalif(),
                 auxx;
                i = izq;
                j = der;
                while (i < j) {
                    while (A[i].getCalif() <= piv && i < j) {
                        i++;
                    }
                    while (A[j].getCalif() > piv) {
                        j--;
                    }
                    if (i < j) {
                        auxx = A[i].getCalif();
                        A[i].setCalif(A[j].getCalif());
                        A[j].setCalif(auxx);
                    }//if
                }//while
                A[izq].setCalif(A[j].getCalif());
                A[j].setCalif(piv);
                if (izq < j - 1) {
                    quicksort(A, izq, j - 1, 1);
                }
                if (j + 1 < der) {
                    quicksort(A, j + 1, der, 1);
                }
                break;
                
                
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

    public void shell(Materia[] A, boolean asc, int c) {
        switch (c) {

            case 0:
                int n = A.length;
                int cc = n / 2;
                boolean cambios = true;
                n = A.length;
                cc = n / 2;
                cambios = true;
                while (cambios) {
                    cambios = false;
                    for (int i = 0; i < n - cc; i++) {
                        if (A[i].getNombre().compareToIgnoreCase(A[i + cc].getNombre()) > 0) {
                            String aux = A[i].getNombre();
                            A[i].setNombre(A[i+cc].getNombre());
                            A[i + cc].setNombre(aux);
                            cambios = true;
                        }
                    }
                    if (cc != 1) {
                        cc = cc / 2;
                    }
                }//while
                break;

            case 1:
                int nn,ccc;
                nn = A.length;
                ccc = nn / 2;
                cambios = true;
                while (cambios) {
                    cambios = false;
                    for (int i = 0; i < nn - ccc; i++) {
                        if (asc && A[i].getCalif() > A[i + ccc].getCalif()) {
                            int aux = A[i].getCalif();
                            A[i].setCalif(A[i + ccc].getCalif());
                            A[i + ccc].setCalif(aux);
                            cambios = true;
                        } else if (!asc && A[i].getCalif() < A[i + ccc].getCalif()) {
                            int aux = A[i].getCalif();
                            A[i].setCalif(A[i + ccc].getCalif());
                            A[i + ccc].setCalif(aux);
                            cambios = true;
                        }
                    }
                    if (ccc != 1) {
                        ccc = ccc / 2;
                    }
                }
                break;
        }
    }

    //RADIX
    public int[] radix(int[] A) throws EstaLlenaException, EstaVaciaException {
        int mayor = A[0], n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] > mayor) {
                mayor = A[i];
            }
        }

        int d = (mayor + "").length();
        //Buscar cola simple

        ColaSimple M[] = new ColaSimple[10];//Reserva espacio

        //for(int i=1;i<n;i++)
        for (int i = 1; i < 10; i++) {
            M[i] = new ColaSimple(n);//Crear colas, del tamaño del arreglo
        }
        //int cc=0;

        for (int dig = 1; dig <= d; dig++) {
            for (int i = 0; i < n; i++) {//Recorre todos los elementos del arreglo
                String num = A[i] + "";
                int inicio = num.length() - dig, pos, fin = inicio + 1;
                if (inicio < 0) {
                    pos = 0;
                }
                pos = Integer.parseInt(num.substring(inicio, fin));

                M[pos].entrada(A[i]);//Insertar, EstaLlenaException
            }
            int a = 0; //Regresar los datos al array original, ordenados por digito

            for (int c = 0; c < 10; c++) //while(M[cc].getFin()>=0)
            {
                while (!M[c].estaVacio()) {
                    A[a++] = M[c].salida(); //Obtener, EstaVaciaException
                }
            }

        }
        return A;
    }

    public int[] radix(Materia[] A, int c) throws EstaLlenaException, EstaVaciaException {
        int[] E = new int[A.length];
        switch (c) {

            case 0:
                javax.swing.JOptionPane.showMessageDialog(null, "No es posible ordenar String por metodo radix en este momento.");
                break;
                
            case 1:
                int mayor,n,j;
                E = new int[A.length];
                j = 0;
                for (Materia al : A) {
                    E[j] = al.getCalif();
                    j++;
                }

                mayor = E[0];
                n = E.length;
                for (int i = 0; i < n; i++) {
                    if (E[i] > mayor) {
                        mayor = E[i];
                    }
                }

                int d = (mayor + "").length();
                //Buscar cola simple

                ColaSimple[] M = new ColaSimple[10];//Reserva espacio

                //for(int i=1;i<n;i++)
                for (int i = 1; i < 10; i++) {
                    M[i] = new ColaSimple(n);//Crear colas, del tamaño del arreglo
                }
                //int cc=0;

                for (int dig = 1; dig <= d; dig++) {
                    for (int i = 0; i < n; i++) {//Recorre todos los elementos del arreglo
                        String num = E[i] + "";
                        int inicio = num.length() - dig, pos, fin = inicio + 1;
                        if (inicio < 0) {
                            pos = 0;
                        }
                        pos = Integer.parseInt(num.substring(inicio, fin));

                        M[pos].entrada(E[i]);//Insertar, EstaLlenaException
                    }
                    int a = 0; //Regresar los datos al array original, ordenados por digito

                    for (c = 0; c < 10; c++) //while(M[cc].getFin()>=0)
                    {
                        while (!M[c].estaVacio()) {
                            E[a++] = M[c].salida(); //Obtener, EstaVaciaException
                        }
                    }

                }
                return E;

        }

        return E;
    }

    
    /*
        Informe de avance:
        
        -Radix no funciona, error de ejecucion en linea 511 y 460:
            M[pos].entrada(E[i]);//Insertar, EstaLlenaException
        Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
    
    */
}
