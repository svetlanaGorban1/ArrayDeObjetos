/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peliculasycatalogo;

/**
 *
 * @author damt110
 */
public class Pelicula {
    
     int codigo;
    String titulo;
    int duracion;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public Pelicula(int codigo, String titulo, int duracion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
    }
   
    public String mostrarPelicula(){
        return "Codigo: "+codigo+" Titulo: "+titulo+" Duracion: "+duracion;
    }
    
}
