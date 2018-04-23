/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author SB-C3
 */
public class Materia {
    private String nombre;
    private int calif;

    public Materia() {
    }

    public Materia(String nombre, int calif) {
        this.nombre = nombre;
        this.calif = calif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }
    
    
    
}
