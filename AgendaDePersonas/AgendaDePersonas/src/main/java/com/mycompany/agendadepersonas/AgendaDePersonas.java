/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendadepersonas;

/**
 *
 * @author damt110
 */
public class AgendaDePersonas {

    public static void main(String[] args) {
        Agenda agenda=new Agenda(2);
        agenda.anadirArray();
        System.out.println(agenda.mostrar());
        
        String resultado=agenda.buscar("nombre");
        
        if (resultado==null){
            System.out.println("Contacto no existe");
        } else {
            System.out.println(resultado);
        }
        
        //System.out.println(agenda.buscar("nombre"));
        System.out.println("Numero de contactos: "+agenda.numeroContactos());
        System.out.println(agenda.modificarTelefono("nombre", "nuevoTelefono"));
    }
}
