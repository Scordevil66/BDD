/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;


import com.app.bdd.conexion.ConexionSQL;
import com.app.bdd.models.Usuario;
import java.sql.Date;
import java.sql.ResultSet;
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
            
            String sql = "";

//            String sql = "INSERT INTO [dbo].[sadRecursoHumano] "
//                    + "           ([rhNumIden] "
//                    + "           ,[rhCodDeptoIden]"
//                    + "           ,[rhCodCiudadIden]"
//                    + "           ,[rhNombres]"
//                    + "           ,[rhApellido1]"
//                    + "           ,[rhApellido2]"
//                    + "           ,[rhCodSexo]"
//                    + "           ,[rhCodEstCivil]"
//                    + "           ,[rhDireccion]"
//                    + "           ,[rhBarrio]"
//                    + "           ,[rhFchNacimiento]"
//                    + "           ,[rhCodDeptoOrigen]"
//                    + "           ,[rhCodCiudadOrigen]"
//                    + "           ,[rhTelefono]"
//                    + "           ,[rhCelular]"
//                    + "           ,[rhCodTipVivienda]"
//                    + "           ,[rhEstrato]"
//                    + "           ,[rhGrupoSang]"
//                    + "           ,[rhRH]"
//                    + "           ,[rhCodEstado]"
//                    + "           ,[rhCorreo])"
//                    + "     VALUES "
//                    + "           (" + usuario.getRhNumIden()
//                    + "           ," + usuario.getRhCodDeptoIden()
//                    + "           ," + usuario.getRhCodCiudadIden()
//                    + "           ,'" + usuario.getRhNombres()
//                    + "'           ,'" + usuario.getRhApellido1()
//                    + "'           ,'" + usuario.getRhApellido2()
//                    + "'           ," + usuario.getRhCodSexo()
//                    + "           ," + usuario.getRhCodEstCivil()
//                    + "           ,'" + usuario.getRhDireccion()
//                    + "'           ,'" + usuario.getRhBarrio()
//                    + "'           ,CONVERT(VARCHAR, '" + mesN+"/"+diaN+"/" +anioN +"', 103)"
//                    + "           ," + usuario.getRhCodDeptoOrigen()
//                    + "           ," + usuario.getRhCodCiudadOrigen()
//                    + "           ," + usuario.getRhTelefono()
//                    + "           ," + usuario.getRhCelular()
//                    + "           ," + usuario.getRhCodTipVivienda()
//                    + "           ," + usuario.getRhEstrato()
//                    + "           ,'" + usuario.getRhGrupoSang()
//                    + "'           ,'" + usuario.getRhRH()
//                    + "'           ," + usuario.getRhCodEstado()
//                    + "           ,'" + usuario.getRhCorreo() + "');";

          

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
