/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peliculasycatalogo;

import java.util.Scanner;

/**
 *
 * @author damt110
 */
public class Catalogo {

    private Pelicula[] peliculas;

    public Catalogo(int n) {
        peliculas = new Pelicula[n];
    }

    public void llenar() {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("Introduce codigo");
            int codigo = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Introduce titulo");
            String titulo = teclado.nextLine();
            System.out.println("Introduce duración");
            int duracion = teclado.nextInt();
            Pelicula pelicula = new Pelicula(codigo, titulo, duracion);
            peliculas[i] = pelicula;
        }
    }

    public void mostrar() {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas != null) {
                System.out.println("Codigo de pelicula" + i + ": " + peliculas[i].getCodigo() + "titulo: "
                        + peliculas[i].getTitulo() + " Duración: " + peliculas[i].getDuracion());
            }
        }
    }

    public String largas() {
        String largasPeliculas = "";
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getDuracion() > 120) {
                largasPeliculas += "Codigo: " + peliculas[i].getCodigo() + " Titulo: "
                        + peliculas[i].getTitulo() + " Duracion: " + peliculas[i].getDuracion() + "\n";
            }
        }
        return largasPeliculas;
    }
}
