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
public class ListaDE {
    private NodoDE inicio,fin;

    public ListaDE() {
        inicio=fin=null;
    }
    
    public NodoDE mayor(Materia m){
        NodoDE temp=null;
        for (NodoDE i = inicio; i != fin; i = i.getSig()) {
            if (i.getDato().getCalificacion() > m.getCalificacion()) {
                temp=i;
            }
            else if(fin.getDato().getCalificacion()>m.getCalificacion()){
                temp=fin;
            }
        }
                //fin.setSig(new NodoDE(m));
               // fin.getSig().setAnt(fin);
                //fin=fin.getSig();
        
        return temp;
    }
    
    public void insertar(Materia m){
        
        if(estaVacia())
            inicio=fin=new NodoDE(m);
        else{
            /*
                Buscar numero mayor e ingresar una posicion antes el numero
            */
            NodoDE mayor=mayor(m);
            
            if(mayor==null){
                if(inicio==fin){
                    fin.setAnt(new NodoDE(m));
                    fin.getAnt().setAnt(fin);
                    inicio=fin.getAnt();
                }else{
                    fin.setAnt(new NodoDE(m));
                    fin.getAnt().setAnt(fin.getAnt().getAnt());
                }
            }else{
                if(inicio==fin){
                    inicio=new NodoDE(m);
                    fin.setAnt(inicio);
                    inicio.setSig(fin);
                }else{
                    mayor.getAnt().setSig(new NodoDE(m));
                    mayor.setAnt(mayor.getAnt().getSig());
                }
                
            }
            
            
            
            
            
            /*
            if(m.getCalificacion()>=fin.getDato().getCalificacion()){
                fin.setSig(new NodoDE(m));
                fin.getSig().setAnt(fin);
                fin=fin.getSig();
            }
            
            else{
                if(inicio==fin){
                    fin.setAnt(new NodoDE(m));
                    fin.getAnt().setAnt(fin);
                    inicio=fin.getAnt();
                }else{
                    fin.setAnt(new NodoDE(m));
                    fin.getAnt().setAnt(fin.getAnt().getAnt());
                }
                
                //fin=fin.getSig();
                
            }
            */
            
            
            
        }
    }
    
    public boolean estaVacia(){
        return inicio==null;
    }
    
    public NodoDE existe(Materia m){
        for(NodoDE i=inicio; i!=null;i=i.getSig())
            if(i.getDato()==m)
                return i;
        
        
        return null;
    }
    
    public NodoDE existe(String c){
        for(NodoDE i=inicio; i!=null;i=i.getSig())
            if(i.getDato().getClave().equals(c))
                return i;
        
        
        return null;
    }
    
    public void eliminar(String clave){
        NodoDE temp=existe(clave);
        if(temp==null)
            javax.swing.JOptionPane.showMessageDialog(null, "No existe.");
        else{
            
            if(temp==inicio && temp==fin){
                inicio=fin=null;
            }
            else if(temp==inicio){
                inicio=inicio.getSig();
                inicio.setAnt(null);
            }else if(temp==fin){
                fin=fin.getAnt();
                fin.setSig(null);
            }else{
                temp.getSig().setSig(temp.getSig());
                temp.getSig().setAnt(temp.getAnt());
            }
        }
        
    }
    
    public void modificar(Materia m){
        NodoDE temp=existe(m);
        if(temp==null)
            javax.swing.JOptionPane.showMessageDialog(null, "La materia '"+m.getNombre()+"' no existe");
        else{
            temp.setDato(m);
        }
    }
    
    public String mostrar() throws EstaVaciaException{
        String cad = "";
        if (!estaVacia()) {
            
            for (NodoDE i = inicio; i != null; i=i.getSig()) {
                cad = cad + "(" + i.getDato() + ")";
            }
        }
        else
            throw new EstaVaciaException("Lista vacia");
        
        return cad;
    }
    
    
    
    
    
}
