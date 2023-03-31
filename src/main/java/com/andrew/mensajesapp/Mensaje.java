package com.andrew.mensajesapp;

public class Mensaje {
    /*10 Aqui estaran los atributos de todos los objetos de tipo mensaje
    * al igual del metodo constructor con sus getters y setters*/
    int idMensaje;
    String mensaje;
    String autorMensaje;
    String fechaMensaje;
    //10.1 no se por que puso esto, es como una plantilla tal parece
    public Mensaje(){

    }

    public Mensaje(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autorMensaje = autor_mensaje;
        this.fechaMensaje = fecha_mensaje;
    }
//10.2 Estos son los getters y setter, lo normal
    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
}
