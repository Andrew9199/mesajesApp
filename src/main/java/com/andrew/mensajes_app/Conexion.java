package com.andrew.mensajes_app;
//8 Aqui podemos ver las librerias importadas, la implemetacion en la estructura del proyecto funciono bien
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_conection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/mensajes_app", "root", "");
            if (connection != null){
                System.out.printf("Conexion exitosa");
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return connection;
    }
}
