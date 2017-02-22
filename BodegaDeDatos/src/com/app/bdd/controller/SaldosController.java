/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;


import com.app.bdd.conexion.ConexionSQL;
import com.app.bdd.models.TslSaldos;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class SaldosController {

    Statement st;

    public SaldosController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public int registrarSaldo(TslSaldos saldo) throws Exception {

        int sa = 0;

        try {
            
            String sql = "INSERT INTO  [BodegaDatos].[dbo].[saldos] "
                    + "           ([varBin]"
                    + "           ,[varNitEMpresa]"
                    + "           ,[varTarjeta]"
                    + "           ,[varMiembro]"
                    + "           ,[varNombTajHabiente]"
                    + "           ,[decSaldoDispo]"
                    + "           ,[varEstadoTarjeta]"
                    + "           ,[varDescripEsta]"
                    + "           ,[varSubtipo])"
                    + "     VALUES "
                    + "           ('" + saldo.getVarBin()
                    + "'           ,'" + saldo.getVarNitEMpresa()
                    + "'           ,'" + saldo.getVarTarjeta()
                    + "'           ,'" + saldo.getVarMiembro()
                    + "'           ,'" + saldo.getVarNombTajHabiente()
                    + "'           ,'" + saldo.getDecSaldoDispo()
                    + "'           ,'" + saldo.getVarEstadoTarjeta()
                    + "'           ,'" + saldo.getVarDescripEsta()
                    + " '          ,'" + saldo.getVarSubtipo() + "');";

          

            st.execute(sql);

            sa++;

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return sa;

    }

}
