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

    public ArbolBinInt() {
        raiz=null;
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
                
                //if(temp==null)
                    //temp=new NodoInt(d);
                //break;
            }
            
        }
        /*else terminar el else
            Arboles y grafos
            Investigar aplicaciones de arboles y de grafos
            
        if(d<raiz.getInfo())
                raiz.setDer(new NodoInt(d));
        */ 
    }
    
    
    public static void main(String[] args){
        ArbolBinInt abi=new ArbolBinInt();
        int e;
        do{
            e=Integer.parseInt(showInputDialog("Ingrese el entero"));
            
        }while(showConfirmDialog(null, "Otro")==0);
    }
     
    
}
