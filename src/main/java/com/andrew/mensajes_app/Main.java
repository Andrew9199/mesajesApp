package com.andrew.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
        Conexion conexion = new Conexion();

        try (Connection cnx = conexion.get_conection()){

        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
