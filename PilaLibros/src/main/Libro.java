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
public class Libro {
    private String ISBN, autor, nombre;
    private int paginas;
    private int precio;

    public Libro() {
    }

    public Libro(String ISBN, String autor, String nombre, int paginas, int precio) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.nombre = nombre;
        this.paginas = paginas;
        this.precio = precio;
    }

    //Getters
    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getPrecio() {
        return precio;
    }
    
    //Setters

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //To String
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", autor=" + autor + ", nombre=" + nombre + ", paginas=" + paginas + ", precio=" + precio + '}';
    }
    
    
    

    
    
    
}
