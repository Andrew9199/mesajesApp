package com.andrew.mensajesapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
//Aqui crea que podemos entender que es un menu que hara x accion si se elije x valor en opcion
        do {
            System.out.println("_________________________");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. Crear mensajes");
            System.out.println(" 2. Listar mensajes");
            System.out.println(" 3. Editar mensajes");
            System.out.println(" 4. Eliminar mensajes");
            System.out.println(" 5. Salir");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    MensajeServices.crearMensaje();
                    break;
                case 2:
                    MensajeServices.listarMensajes();
                    break;
                case 3:
                    MensajeServices.editarMensaje();
                    break;
                case 4:
                    MensajeServices.borrarMensajes();
                    break;
            }
        }while (opcion != 5);
    }
}
