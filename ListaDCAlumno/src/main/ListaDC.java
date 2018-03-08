/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import exceptions.EstaVaciaException;

/**
 *
 * @author SB-C3
 */
public class ListaDC {
    private Nodo inicio, fin;

    public ListaDC() {
        inicio=fin=null;
    }
    
    public void insertar(Alumno a){
        if(inicio==null)
            inicio=fin=new Nodo(a);
        else{
            fin.setSig(new Nodo(a));
            fin.getSig().setAnt(fin);
            fin=fin.getSig();
            fin.setSig(inicio);
            inicio.setAnt(fin);
        }
    }
    
    public Nodo existe(String nca){
        for(Nodo i=inicio; i!=fin;i=i.getSig())
            if(i.getD().getNc().equals(nca))
                return i;
        
        if(fin.getD().getNc().equals(nca))
            return fin;
        else
            return null;
        
    }
    
    public void eliminar(String nca){
        Nodo temp=existe(nca);
        
        if(temp==inicio){
            inicio.getSig().setAnt(fin);
            inicio=inicio.getSig();
            fin.setSig(inicio);
            //temp=null;
        }
        else if(temp==fin){
            fin.getAnt().setSig(inicio);
            fin=fin.getAnt();
            inicio.setAnt(fin);
        }
        else{
            temp.getAnt().setSig(temp.getSig());
            temp.getSig().setAnt(temp.getAnt());
        }
        temp=null;//No necesaria
        
    }
    
    public String mostrar() throws EstaVaciaException{
        String cad = "";
        if(inicio!=null) {
            
            for (Nodo i = inicio; i != null; i=i.getSig()) {
                cad = cad + "(" + i.getD().toString() + ")";
            }
        }
        else
            throw new EstaVaciaException("Lista vacia");
        
        return cad;
    }
    
    public void modificar(Alumno a){
        Nodo temp=existe(a.getNc());
        if(temp!=null)
            temp.setD(a);
        else
            javax.swing.JOptionPane.showMessageDialog(null, "No existe");
    }
    
    
    
    
    
}
