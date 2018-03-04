/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import exceptions.EstaVaciaException;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author SB-C3
 */
public class ListaSimple {
    private NodoF inicio,fin;

    public ListaSimple() {
        inicio=fin=null;
    }
    
    public boolean estaVacia(){
        return inicio==null;
    }
    
    public void ingresar(float d){
        if(estaVacia())
            inicio=fin=new NodoF(d);
        else{
            fin.setSig(new NodoF(d));
            fin=fin.getSig();
        }
    }
    
    public NodoF existe(float d){
        for(NodoF i=inicio;i!=fin;i=i.getSig())
            if(i.getSig().getInfo()==d)
                return i;
        
        return null;
    }
     
    public void eliminar(float d){
        if(inicio.getInfo()==d){
            inicio=inicio.getSig();
            return;
        }
        
        NodoF temp=existe(d);
        if(temp==null)
            javax.swing.JOptionPane.showMessageDialog(null, "El dato '"+d+"' no existe");
        //else tarea, terminar para eliminarlo
        else
            temp.setSig(temp.getSig().getSig());
    }
    
    public String mostrar() throws EstaVaciaException{
        String cad = "";
        if (!estaVacia()) {
            
            for (NodoF i = inicio; i != null; i=i.getSig()) {
                cad = cad + "(" + i.getInfo() + ")";
            }
        }
        else
            throw new EstaVaciaException("Lista vacia");
        
        return cad;
    }
    
    //Tarea:
    // CAMBIAR DATO
    
    public void modificar(float d){
        
        NodoF temp=existe(d);
        if(temp==null)
            javax.swing.JOptionPane.showMessageDialog(null, "El dato '"+d+"' no existe");
        else{
            float nv=Float.parseFloat(showInputDialog("Ingrese el nuevo valor para "+d));
            temp.getSig().setInfo(nv);
        }
            
    }
    
    //Tarea: mostrar los datos de la lista
    //Regresa el elemento
    
    
    
}
