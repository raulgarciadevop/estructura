/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrolatino;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author SB-C3
 */
public class CuadroLatino {
    private String cad;
    
    public CuadroLatino(){
        
    }
    
    
    public void cuadro(){
        int r=Integer.parseInt(showInputDialog("Numero de renglones: ")),
        c=r, M[][]=new int[r][c];
        
        for(int i=0;i<r;i++)
            for(int k=0;k<c;k++)
                //M[i][k]=i+k;//Ensayo
                if((i+k)==(r-1))M[i][k]=1;
        
        
        cad="";
        for(int i=0;i<r;i++){
            for(int k=0;k<c;k++)cad+=M[i][k]+" ";
            cad+="\n";
        }
        
        
    }
    
    public String getCad(){
        return cad;
    }
    
    
    
     public static void main(String[] args){
         CuadroLatino cl=new CuadroLatino();
         cl.cuadro();
         showMessageDialog(null, cl.getCad());
     }
     
     /*
     Tarea:
     Cuadro latino con recursividad;
     */
    
}
