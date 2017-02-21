/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;


import com.app.bdd.conexion.ConexionSQL;
import com.app.bdd.models.Usuario;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class UserController {

    Statement st;

    public UserController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public int registrarUsuario(Usuario user) throws Exception {

        int us = 0;

        try {
            
            String sql = "INSERT INTO  [BodegaDatos].[dbo].[usuarios] "
                    + "           ([varNombreUser] "
                    + "           ,[varApellidosUser]"
                    + "           ,[varCargoUser]"
                    + "           ,[varUsuario]"
                    + "           ,[varPassword])"
                    + "     VALUES "
                    + "           (" + user.getVarNombreUser()
                    + "           ," + user.getVarApellidosUser()
                    + "           ," + user.getVarCargoUser()
                    + "           ,'" + user.getVarUsuario()
                    + "'           ,'" + user.getVarPassword()+ "');";

          

            st.execute(sql);

            us++;

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return us;

    }

}
