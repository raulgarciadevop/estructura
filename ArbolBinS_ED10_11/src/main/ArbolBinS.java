/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author SB-C3
 */
public class ArbolBinS {
    private Nodo raiz;
    private String cad;

    public ArbolBinS() {
        raiz=null;
        cad="";
    }

    public ArbolBinS(Nodo raiz) {
        this.raiz = raiz;
        cad="";
    }
    
    public void insertar(String n){
        if(raiz==null)
            raiz=new Nodo(n);
        else{
            Nodo nuevo=new Nodo(n);
            Nodo temp=raiz;
            
            
            while(temp!=null){
                if(n.compareToIgnoreCase(temp.getInfo())>=0){//Tambien se pudo usar compareTo sin IngoreCase
                    if(temp.getIzq()==null){
                        temp.setIzq(nuevo);
                        break;
                    }
                    else
                        temp=temp.getIzq();
                }
                else{
                    if(temp.getDer()==null){
                        temp.setDer(nuevo);
                        break;
                    }
                    else
                        temp=temp.getDer();
                
                }
            }
            
        }
        
            
    }
    
    /*
    Asi funciona el compareTo
    
    compareTo:
    Return Value
    The value 0 if the argument is a string lexicographically equal to this string;
    a value less than 0 if the argument is a string lexicographically greater than this string;
    and a value greater than 0 if the argument is a string lexicographically less than this string.
    */
    
    public void preOrden(Nodo r){
        if(r==null)
            return;
        
        cad+=r.getInfo()+" - ";
        preOrden(r.getIzq());
        preOrden(r.getDer());
    }
    
    public void postOrden(Nodo r){
        if(r==null)
            return;
        
        preOrden(r.getIzq());
        preOrden(r.getDer());
        cad+=r.getInfo()+" - ";
    }
    
    public void inOrden(Nodo r){
        if(r==null)
            return;
        
        preOrden(r.getIzq());
        cad+=r.getInfo()+" - ";
        preOrden(r.getDer());
        
    }
    
    public void verArbol(int tipo){
        switch(tipo){
            case 1:
                preOrden(raiz);
                break;
            case 2:
                postOrden(raiz);
                break;
            case 3:
                inOrden(raiz);
                break;
                
            default:
                break;
        }
        System.out.print(cad);
    }
    
    public static void main(String[] args){
        ArbolBinS abi=new ArbolBinS();
        String e;
        do{
            e=showInputDialog("Ingrese el String");
            abi.insertar(e);
        }while(showConfirmDialog(null, "Otro")==0);
        abi.verArbol(Integer.parseInt(showInputDialog("Seleccione el ordenamiento:\n\n1.- Pre orden.\n2.- Post orden.\n3.- In orden.")));
    }
    
    
    
    
}
