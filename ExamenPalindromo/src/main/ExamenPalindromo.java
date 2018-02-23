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
    
    public static boolean palindromoS(String txt){
        String tx=txt.toUpperCase().replace(" ", "");
        int j=tx.length()-1;
        for(int i=0;i<tx.length()-1;i++){//tx.lenght/2
            if(tx.charAt(i)!=tx.charAt(j)){
                return false;
            }
            j--;
        }
        
        return true;
    }
    //3
    //
    
    //Recursiva
    public static boolean palindromoR(String txt, int l, int l2){
        
        if(txt.toUpperCase().charAt(l)==txt.toUpperCase().charAt(l2)){
            return palindromoR(txt,l--,l2++);
        }
        else{
            return false;
        }
        
    }
    
    public static boolean palindromoR(String s){
        if(s.length()<=1)
            return true;
        
        if(s.charAt(0)==s.charAt(s.length()-1))
            return palindromoR(s.substring(1, s.length()-1));
        
        
        return false;
        
    }

    
    public static void main(String[] args) {
        String n="anita lava la tina";
        
        //No recursiva
        //showMessageDialog(null, "¿La palabra/frase '"+n+"' es palindromo? \n RE: "+palindromoS(n));//Funciona
        
        
        //Recursiva
        showMessageDialog(null, "¿La palabra/frase '"+n+"' es palindromo? \n RE: "+palindromoR(n.toUpperCase().replace(" ", "")));//No funciona
        
    }
    
}
