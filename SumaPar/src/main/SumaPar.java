/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author SB-C3
 */
public class SumaPar {
    
    public SumaPar(){
        
    }
    
    public int sumaParR(int n){
        if(n==2)return n;
        else
            if(n%2==0)n--;
            
        return n+sumaParR(n);
    }
    
    public int numeroPrimoR(int n){
        
        return 1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SumaPar sp=new SumaPar();
        
        showMessageDialog(null, "Res: "+sp.sumaParR(10));
    }
    
}
