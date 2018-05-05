/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import excepciones.EstaVaciaException;
import objetos.Usuario;

/**
 *
 * @author SB-C3
 */
public class ListaDE {
    private NodoDE inicio,fin;

    public ListaDE() {
        inicio=fin=null;
    }
    
    public void insertar(Usuario d){
        if(estaVacia())
            inicio=fin=new NodoDE(d);
        else{
            fin.setSig(new NodoDE(d));
            fin.getSig().setAnt(fin);
            fin=fin.getSig();
        }
    }
    
    public boolean estaVacia(){
        return inicio==null;
    }
    
    public NodoDE existe(Usuario d){
        for(NodoDE i=inicio; i!=null;i=i.getSig())
            if(i.getUsuario()==d)
                return i;
        
        
        return null;
    }
    
    public NodoDE existe(String d){
        for(NodoDE i=inicio; i!=null;i=i.getSig())
            if(i.getUsuario().getNombre_usuario().equals(d))
                return i;
        
        return null;
    }
    
    public void eliminar(Usuario d){
        NodoDE temp=existe(d);
        if(temp==null)
            javax.swing.JOptionPane.showMessageDialog(null, "No existe.");
        else{
            if(temp==inicio){
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
    
    public void modificar(Usuario d,Usuario d2){
        NodoDE temp=existe(d);
        if(temp==null)
            javax.swing.JOptionPane.showMessageDialog(null, "El dato '"+d+"' no existe");
        else{
            Usuario nv=d2;
            temp.setUsuario(nv);
        }
    }
    
    public void modificar(Usuario d,int id_usuario, String nombre_usuario, String clave_usuario, int pin_usuario){
        NodoDE temp=existe(d);
        if(temp==null)
            javax.swing.JOptionPane.showMessageDialog(null, "El dato '"+d+"' no existe");
        else{
            Usuario nv=new Usuario(id_usuario,nombre_usuario,clave_usuario,pin_usuario);
            temp.setUsuario(nv);
        }
    }
    
    
    
    public String mostrarTodo() throws EstaVaciaException{
        String cad = "";
        if (!estaVacia()) {
            
            for (NodoDE i = inicio; i != null; i=i.getSig()) {
                cad = cad + "(" + i.getUsuario() + ")";
            }
        }
        else
            throw new EstaVaciaException("Lista vacia");
        
        return cad;
    }
    
    public String mostrar(String username) throws EstaVaciaException{
        Usuario temp=existe(username).getUsuario();
        if (temp!=null)
            return temp.toString();
        else
            throw new EstaVaciaException("Lista vacia");
    }
    
    
    
    
    
}
