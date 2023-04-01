package com.andrew.mensajesapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajeDAO {
//10.3 Haber aqui agregamos metodos de los casos de uso basicamente, luego iremos
/* poniendoles la funcionalidad, una cosa, tal parece que los parametros que estamos poniendo
a futuro se usaran para la logica de cada metodo, cosa que estaria chida agregar cuando pongamos
dicha funcionalidad*/
    public static void CrearMensajeDB(Mensaje mensaje){
        /*11 Aqui crearemos lo necesario para enviar los parametrod que nos envie MensajeServices
        a la base de datos*/
        Conexion dbConnect = new Conexion();

        try(Connection conexion = dbConnect.get_conection()){
            PreparedStatement ps = null;
            try {
                /*11.1 En esta parte definiremos la query que necesitamos, de donde la sacamos
                esta en notion*/
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES ( ? , ?)";
                /*11.2 En esa secccion vamoa a definir como entran los mensajes, haber, el ps es una variable
                 * que guardara el objeto de prepareStament que seria en donde va la Query de arriba
                 * Las siguientes lineas vendrian a ser el donde y que se va a colocar en el registro.
                */
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                //11.5 Esta cosa ps.executeUpdate(); es muuy importante, no olvidar agregarla, no otra vez
                ps.executeUpdate();
                System.out.println("EL mensaje fue creado correctamente");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void LeerMensajesDB(){

    }

    public static void borrarMensajeDB(int id_mesaje){

    }

    public static void actualizarMensajeDB(Mensaje mensaje){

    }
}
