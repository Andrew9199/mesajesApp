package com.andrew.mensajesapp;

import java.util.Scanner;

public class MensajeServices {
    /*10.4 Aqui van a estar los metodos que apareceran en el menu que a su vez conectaran
    * con nuestra base de datos*/
    public static void crearMensaje(){
        //11.3 Aqui vamos a leer en pantalla lo que nos diga el usuario
        //11.4 Dato curioso, System.in lee la entrada del mensaje
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        /*11.5 Vale, aqui segun entiendo creamos una instancia Mensaje para enviar el mensaje,
        igual y mejor haciamos que Mensaje fuese una clase una clase estatica no?*/
        Mensaje registro = new Mensaje();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        MensajeDAO.CrearMensajeDB(registro);
    }
    public static void listarMensajes(){
        //12.4 Aqui solo debemos invocar el metodo mostrar mensaje recien creado
        MensajeDAO.LeerMensajesDB();
    }
    public static void borrarMensajes(){

    }
    public static void editarMensaje(){

    }
}
