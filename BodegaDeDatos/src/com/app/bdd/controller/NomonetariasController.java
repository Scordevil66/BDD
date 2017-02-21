/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;


import com.app.bdd.conexion.ConexionSQL;
import com.app.bdd.models.NoMonetarias;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class NomonetariasController {

    Statement st;

    public NomonetariasController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public int registrarNoMonetaria(NoMonetarias nomonetarias) throws Exception {

        int no = 0;

        try {
            
            String sql = "INSERT INTO  [BodegaDatos].[dbo].[nomonetarias] "
                    + "           ([varNitEmpresa]"
                    + "           ,[dateFechaEnvio]"
                    + "           ,[varConsecutiEnvio]"
                    + "           ,[varTipoIndentiCliente]"
                    + "           ,[varNumIdentifCliente]"
                    + "           ,[varCodEmpleado]"
                    + "           ,[varDptoEmpresa]"
                    + "           ,[varPrimerApellido]"
                    + "           ,[varSegundoApellido]"
                    + "           ,[varPrimerNombre]"
                    + "           ,[varSegundoNombre]"
                    + "           ,[varNombreCorto]"
                    + "           ,[varDirResidencia]"
                    + "           ,[varZonaPostalResidencia]"
                    + "           ,[varCuidadResidencia]"
                    + "           ,[varDirOficina]"
                    + "           ,[varZonaPostalOficina]"
                    + "           ,[varCuidadOficina]"
                    + "           ,[varDirCorrespondencia]"
                    + "           ,[varZonaPostalCorresponde]"
                    + "           ,[varCuidadCorresponde]"
                    + "           ,[varTelResidencia]"
                    + "           ,[varTelOficina]"
                    + "           ,[varTelCorrespondencia]"
                    + "           ,[varOficina]"
                    + "           ,[varNumTarjeta]"
                    + "           ,[varTipoCuenta]"
                    + "           ,[dateFechNacimi]"
                    + "           ,[varNacionalidad]"
                    + "           ,[varEstadoCivil]"
                    + "           ,[varSexo]"
                    + "           ,[varNivelEstudio]"
                    + "           ,[varProfesion]"
                    + "           ,[dateFechaVinculacion]"
                    + "           ,[varTipoNovedad]"
                    + "           ,[varEspaciosBlancos]"
                    + "           ,[varReservado]"
                    + "           ,[varCodError])"
                    + "     VALUES "
                    + "           (" + nomonetarias.getVarNitEmpresa()
                    + "           ," + nomonetarias.getDateFechaEnvio()
                    + "           ," + nomonetarias.getVarConsecutiEnvio()
                    + "           ,'" + nomonetarias.getVarTipoIndentiCliente()
                    + "'           ,'" + nomonetarias.getVarNumIdentifCliente()
                    + "'           ,'" + nomonetarias.getVarCodEmpleado()
                    + "'           ," + nomonetarias.getVarDptoEmpresa()
                    + "           ," + nomonetarias.getVarPrimerApellido()
                    + "           ,'" + nomonetarias.getVarSegundoApellido()
                    + "'           ,'" + nomonetarias.getVarPrimerNombre()
                    + "           ," + nomonetarias.getVarSegundoNombre()
                    + "           ," + nomonetarias.getVarPrimerNombre()
                    + "           ," + nomonetarias.getVarNombreCorto()
                    + "           ," + nomonetarias.getVarDirResidencia()
                    + "           ," + nomonetarias.getVarZonaPostalResidencia()
                    + "           ," + nomonetarias.getVarCuidadResidencia()
                    + "           ,'" + nomonetarias.getVarDirOficina()
                    + "'           ,'" + nomonetarias.getVarZonaPostalOficina()
                    + "'           ," + nomonetarias.getVarCuidadOficina()
                    + "'           ," + nomonetarias.getVarDirCorrespondencia()
                    + "'           ," + nomonetarias.getVarZonaPostalCorresponde()
                    + "'           ," + nomonetarias.getVarCuidadCorresponde()
                    + "'           ," + nomonetarias.getVarTelResidencia()
                    + "'           ," + nomonetarias.getVarTelOficina()
                    + "'           ," + nomonetarias.getVarTelCorrespondencia()
                    + "'           ," + nomonetarias.getVarOficina()
                    + "'           ," + nomonetarias.getVarNumTarjeta()
                    + "'           ," + nomonetarias.getVarTipoCuenta()
                    + "'           ," + nomonetarias.getDateFechNacimi()
                    + "'           ," + nomonetarias.getVarNacionalidad()
                    + "'           ," + nomonetarias.getVarEstadoCivil()
                    + "'           ," + nomonetarias.getVarSexo()
                    + "'           ," + nomonetarias.getVarNivelEstudio()
                    + "'           ," + nomonetarias.getVarProfesion()
                    + "'           ," + nomonetarias.getDateFechaVinculacion()
                    + "'           ," + nomonetarias.getVarTipoNovedad()
                    + "'           ," + nomonetarias.getVarEspaciosBlancos()
                    + "'           ," + nomonetarias.getVarReservado()
                    + "'           ," + nomonetarias.getVarCodError() + "');";

          

            st.execute(sql);

            no++;

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return no;

    }

}