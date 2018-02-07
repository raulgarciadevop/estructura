/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author SB-A1
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    
    //Lineal
    public int fact(int n){
        int f=1;
        for(int i=n;i>=1;i--)
            f=f*i;
        return f;
    }
    /*fn=1+1+4n+1
        =3+4n
        =0n
    */
    
    //Recursiva
    public int factR(int n){
        if(n==1)return 1;
        else
            return n*factR(n-1);
    }
    /*fn=2+2n
    
    */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
