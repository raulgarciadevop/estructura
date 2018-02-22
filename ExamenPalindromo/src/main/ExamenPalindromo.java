/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static javax.swing.JOptionPane.*;

/**
 *
 * @author SB-C3
 */
public class ExamenPalindromo {

    /**
     * @param args the command line arguments
     */
    
    //No recursivo
    public static boolean palindromo(String txt){
        char []tx;
        tx=txt.toUpperCase().toCharArray();
        int j=tx.length-1;
        for(int i=0;i<tx.length;i++){
            if(tx[i]!=tx[j]){
                return false;
            }
            j--;
        }
        
        return true;
    }
    //3
    //
    
    //Recursiva
    public static boolean palindromoR(String txt, int l){
        
        if(txt.toUpperCase().charAt(l)==txt.toUpperCase().charAt(l)){
            return palindromoR(txt,l--);
        }
        return true;
    }

    
    public static void main(String[] args) {
        String n="ana";
        
        //No recursiva
        showMessageDialog(null, "¿La palabra/frase '"+n+"' es palindromo? \n RE: "+palindromo(n));//Funciona
        
        
        //Recursiva
        showMessageDialog(null, "¿La palabra/frase '"+n+"' es palindromo? \n RE: "+palindromoR(n,n.length()-1));//No funciona
        
    }
    
}
