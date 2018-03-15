/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author SB-C3
 */
public class Grafo {
    private static final int M[][]={{1,1,-1,-1},
                              {1,1, 1,-1}};
    
    public static boolean eside(String p){
        int edo=0,ent;
        for(int i=0;i<p.length();i++){
            int c=p.charAt(i);
            if(c=='_')
                ent=1;
            else if(c>=65 && c<=90 | c>=97 && c<=120)
                ent=0;
            else if(c>=48 && c<=50)
                ent=2;
            else 
                ent=3;
            
            edo=M[edo][ent];
            if(edo==-1)
                return false;
            
            
        }
        return true;
    }
}

/*
    Examen de unidad 3, estructuras de datos lineales
    Cola doble 
*/
