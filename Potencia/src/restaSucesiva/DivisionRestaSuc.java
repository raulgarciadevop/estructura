/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaSucesiva;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author SB-C3
 */
public class DivisionRestaSuc {
    private int res;
    private int divisor; int dividendo;
    
    public DivisionRestaSuc(){
        
    }
    
    //No recursiva
    public int drc(int n, int d){
        //if(den<num)
        if(n<d) return 0;
        int r=0;
        
        while(n>=d){
            n=n-d;
            r++;
        }
        res=n;
        return r;
    }
    
    //Recursiva
    public int drcR(int n, int d){
        if(n<d)return 0;
        res=n;
        return drcR(n-d,d)+1;
    }
    
    

    public void setRes(int res) {
        this.res = res;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getRes() {
        return res;
    }

    public int getDivisor() {
        return divisor;
    }

    public int getDividendo() {
        return dividendo;
    }
    
    
    public static void main(String[] args){
        DivisionRestaSuc drs=new DivisionRestaSuc();
        drs.setDivisor(3);
        drs.setDividendo(55);
        int resultadoNR=drs.drc(drs.getDividendo(), drs.getDivisor());
        int resultadoR=drs.drcR(drs.getDividendo(), drs.getDivisor());
        
        showMessageDialog(null, "No recursiva: "+resultadoNR+"."+drs.drc(drs.getRes()*10, drs.getDivisor()));
        //Multiplicar*10 el residuo y dividirlo entre el divisor, despues concatenarlo al resultado entero.
        showMessageDialog(null, "Recursiva: "+resultadoR+"."+drs.drcR(drs.getRes()*10, drs.getDivisor()));
    }
    
    /*
    TAREA:
    - Implementar decimales (sin cambiar de int, concatenando)
    
    - Ejemplo de recursividad
    
    
    
    import java.util.*;
public class Suma1N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
           System.out.print("Introduce un numero entero >0 ");
           num = sc.nextInt();
        }while(num<=0);
        System.out.println("Suma desde 1 hasta " + num + " = " + suma1N(num));

    }

    //método recursivo para calcular la suma desde 1 hasta N
    public static double suma1N(int n){
           if(n == 1)  //caso base
              return 1;
           else
              return n + suma1N(n-1);
    }
}
    
    */
    
}
