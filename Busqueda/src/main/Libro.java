/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author SG-A1
 */
public class Libro {
    private String ISBN, titulo,autor,ed;
    private float precio;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, String ed, float precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ed = ed;
        this.precio = precio;
    }
    
    

    //Setters
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    //Getters

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEd() {
        return ed;
    }

    public float getPrecio() {
        return precio;
    }
    
    
    
    
    
    
}
