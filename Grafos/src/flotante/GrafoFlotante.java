/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flotante;

/**
 *
 * @author SB-C3
 */
public class GrafoFlotante {//      dig |-| . | otro
    private static final int M[][]={{ 2, 1,-1,-1},//0
                                    { 2,-1,-1,-1},//1
                                    { 2,-1, 3,-1},//2
                                    { 3,-1,-1,-1}};//3
    
    
    public static boolean eside(String p){
        int edo=0,ent;
        for(int i=0;i<p.length();i++){
            int c=p.charAt(i);
            
            if(c>=48 && c<=57)//Es digito
                ent=0;
            else if(c=='-')
                ent=1;//1
            else if(c=='.')
                ent=2;
            else 
                ent=3;
            
            edo=M[edo][ent];
            if(edo==-1)
                return false;
            
            
        }
        return true;
    }
    
    public static int esOp(String c){
        String O[]={"=","+","-","*","/","<",">",";"};
        
        for(int i=0;i<O.length;i++){
            if(c.equals(O[i]))
                return i;
        }
        
        
        return -1;
    }
    
    
}
