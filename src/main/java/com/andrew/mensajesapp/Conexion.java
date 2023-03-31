package com.andrew.mensajesapp;
//8 Aqui podemos ver las librerias importadas, la implemetacion en la estructura del proyecto funciono bien
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_conection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/mensajes_app", "root", "");
        }catch (SQLException e){
            System.out.println(e);
        }
        return connection;
    }
}
