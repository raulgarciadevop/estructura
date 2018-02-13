/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Administrator
 */
public class InversorNumeros {
    
    public InversorNumeros(){
        
    }
    
    public int invertirR(int n){
        if(n<10) //Caso base
            return n;
        return (n%10)+invertirR(n/10)*10;
    }
    
    public static void main(String[] args){
        int a=123;
        InversorNumeros in=new InversorNumeros();
        
        showMessageDialog(null, "Original: "+a+" Invertido: "+in.invertirR(a));
    }
    
}
