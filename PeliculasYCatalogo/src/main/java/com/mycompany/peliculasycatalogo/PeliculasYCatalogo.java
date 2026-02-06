/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.peliculasycatalogo;

/**
 *
 * @author damt110
 */
public class PeliculasYCatalogo {

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo(3);
        catalogo.llenar();
        catalogo.mostrar();
        
        System.out.println(catalogo.largas());
    }
}
