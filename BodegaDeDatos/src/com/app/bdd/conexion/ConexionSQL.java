/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.conexion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ContabilidadPC
 */
public class ConexionSQL {

    //static String clave = "yU7eywfXILoZjtaD";
    static String clave = "";
    static Statement ST = null;
    static Connection cn = null;
    static String user = "";
    static String url = "";
    static String db = "";

    public static Statement conexion() throws SQLException {

        try {

            try {
                // CLASE USADA PARA EL DRIVER
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
            // RUTA DE LA BASE DE DATOS
            //  149.56.93.6
            //  String url = "jdbc:mysql://149.56.93.6:3306/smsrenta_actualizada";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=SadRBM";
            // CONECCION A LA BASE DE DATOS
            cn = DriverManager.getConnection(url, "ce", clave);
            // TRAE LOS DATOS
            Statement st = cn.createStatement();

            ST = st;

            System.out.print("-------------------consulta BD:" + ST);

        } catch (ClassNotFoundException ex) {
            System.out.print("Error en el Driver");
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
//		finally {
//			cerrarConexion();
//		   }
        return ST;

    }
    public static Connection CerrarConexion() throws SQLException {

        try {
            if (cn != null) {
                cn.close();
                cn = null;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return null;

    }

    public static void main(String arg[]) throws SQLException {
        conexion();
    }
}
