/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intt;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author SB-C3
 */
public class ArbolBinInt {
    private NodoInt raiz;
    private String cad;

    public ArbolBinInt() {
        raiz=null;
        cad="";
    }
    
    public void insertar(int d){
        
        if(raiz==null)
            raiz=new NodoInt(d);
        else{
            NodoInt nuevo=new NodoInt(d);
            NodoInt temp=raiz;
            
            
            while(temp!=null){
                if(d<=temp.getInfo()){
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
    
    public void preOrden(NodoInt r){
        if(r==null)
            return;
        
        cad+=r.getInfo()+" - ";
        preOrden(r.getIzq());
        preOrden(r.getDer());
    }
    
    public void postOrden(NodoInt r){
        if(r==null)
            return;
        
        preOrden(r.getIzq());
        preOrden(r.getDer());
        cad+=r.getInfo()+" - ";
    }
    
    public void inOrden(NodoInt r){
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
        ArbolBinInt abi=new ArbolBinInt();
        int e;
        do{
            e=Integer.parseInt(showInputDialog("Ingrese el entero"));
            abi.insertar(e);
        }while(showConfirmDialog(null, "Otro")==0);
        abi.verArbol(Integer.parseInt(showInputDialog("Seleccione el ordenamiento:\n\n1.- Pre orden.\n2.- Post orden.\n3.- In orden.")));
    }
     
    
}
