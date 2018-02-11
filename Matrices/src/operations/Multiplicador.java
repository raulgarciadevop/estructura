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
    private int nfA, ncA, nfB, ncB;
    int[][] c;
    
    public Multiplicador(){
        
    }
    
    public Multiplicador(int c, int r){
        this.c=new int[c][r];
        
    }
    
    public int[][] multiplicar(int[][] a, int[][] b){
        nfA=a.length;
        ncA=a[0].length;
        nfB=b.length;
        ncB=b[0].length;
        
        this.c=new int[nfA][nfA];
        
        
        int fil,col,i;
        for(fil=0 ; fil<nfA ; fil++)
        {
            for(col=0 ; col<ncB ; col++)
            {
                for(i=0 ; i<nfA ; i++)
                {
                    c[fil][col]+= a[fil][i] * b[i][col];
                }
            }
        }
        return c;
    }
    
    
    //Setters
    public void setNcB(int ncB) {
        this.ncB = ncB;
    }
    
    public void setNfA(int nfA) {
        this.nfA = nfA;
    }

    public void setNcA(int ncA) {
        this.ncA = ncA;
    }

    public void setNfB(int nfB) {
        this.nfB = nfB;
    }
    

    //Getters
    public int getNfA() {
        return nfA;
    }

    public int getNcA() {
        return ncA;
    }

    public int getNfB() {
        return nfB;
    }

    public int getNcB() {
        return ncB;
    }
    
    
    
}
