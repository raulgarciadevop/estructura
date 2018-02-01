package main;

public class Unidad {

  private int num;

  private String tema;

  private int calif;

    public Unidad() {
    }

    public Unidad(int num, String tema, int calif) {
        this.num = num;
        this.tema = tema;
        this.calif = calif;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }

    @Override
    public String toString() {
        return "Unidad{" + "num=" + num + ", tema=" + tema + ", calif=" + calif + '}';
    }
    
    

}