/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendadepersonas;

import java.util.Scanner;

/**
 *
 * @author damt110
 */
public class Agenda {

    private Persona[] contactos;
    int contador;

    public Agenda(int n) {
        contactos = new Persona[n];
    }

    public void anadirArray() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < contactos.length; i++) {
            System.out.println("Nombre: ");
            String nombre = teclado.nextLine();
            System.out.println("Teléfono: ");
            String telefono = teclado.nextLine();
            Persona persona = new Persona(nombre, telefono);
            contactos[i] = persona;
        }
    }

    public String mostrar() {
        String mostrarContactos = " ";
        for (int i = 0; i < contactos.length; i++) {
            if (contactos != null) {
                mostrarContactos += ("\n Nombre: " + contactos[i].getNombre() + " Telefono: " + contactos[i].getTelefono());
            }
        }
        return mostrarContactos;
    }

    public String buscar(String nombre) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].getNombre().equals(nombre)) {
                return "Contacto encontrado. Nombre: " + contactos[i].getNombre() + " Teléfono " + contactos[i].getTelefono();
            }
        }
        return null;
    }

    public boolean modificarTelefono(String nombre, String nuevoTelefono) {
        boolean modificado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].getNombre().equals(nombre) && contactos[i].getTelefono() != null) {
                contactos[i].setTelefono(nuevoTelefono);
                modificado = true;

            }
        }

        /*int i = 0;
        while(modificado==false  && i<contactos.length) {
             if (contactos[i].getNombre().equals(nombre)&& contactos[i].getTelefono() != null) {
                contactos[i].setTelefono(nuevoTelefono);
                modificado = true;
            }   
                          i++;
        }*/

        return modificado;
    }

    public int numeroContactos() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null) {
                contador++;
            }
        }
        return contador;
    }
}
