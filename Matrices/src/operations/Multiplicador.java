/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

/**
 *
 * @author Administrator
 */
public class Multiplicador {
    int[][] c;
    
    public Multiplicador(){
        
    }
    
    public Multiplicador(int c, int r){
        this.c=new int[c][r];
        
    }
    
    public int[][] multiplicar(int[][] a,int[][] b){
        for(int i=0;i<a[0].length;i++){
            for(int j=0;i<a.length;j++){
                //multiplica
                int x=0;
                for(int k=0;k<b[0].length;k++){
                    x+=a[i][k]*b[k][j];
                }
                c[i][j]=x;
            }
        }
            
        return c;
    }
    
    
    
}
