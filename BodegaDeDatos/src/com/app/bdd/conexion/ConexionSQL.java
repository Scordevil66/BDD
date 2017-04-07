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
import javax.swing.JOptionPane;

/**
 *
 * @author ContabilidadPC
 */
public class ConexionSQL {

    //static String clave = "yU7eywfXILoZjtaD";
  //   static String clave = "qwerty78";
    static String clave = "wstinol";
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
        
      //     String rsl = "jdbc:sqlserver://SQL5020.SmarterASP.NET;databaseName=DB_9F51D1_bdd";
           String rsl = "jdbc:sqlserver://10.9.200.189:1499;databaseName=BodegaBPO";
            // CONECCION A LA BASE DE DATOS
         //   System.out.print("vamos a conectar");
           cn = DriverManager.getConnection(rsl, "HSI", clave);
       //    cn = DriverManager.getConnection(rsl, "DB_9F51D1_bdd_admin", clave);
            // TRAE LOS DATOS
            Statement st = cn.createStatement();
             
            ST = st;

            System.out.print("-------------------consulta BD:" + ST);

        } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "No se logro conectar a la base de datos" + ex);
            //System.out.print("No se logro conectar a la Base de datos");
        } catch (SQLException e) {
           
            System.out.print(e.getMessage());
        }
//		finally {
//			cerrarConexion();
//		   }
      //  System.out.println("");
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

