/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;


import com.app.bdd.conexion.ConexionSQL;
import com.app.bdd.models.Movimientos;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class MovimientoController {

    Statement st;

    public MovimientoController() throws SQLException {
        this.st = ConexionSQL.conexion();
    }

    public int registrarMovimiento(Movimientos movimiento) throws Exception {

        int mo = 0;

        try {
            
            String sql = "INSERT INTO  [BodegaDatos].[dbo].[movimientos] "
                    + "           ([varBin]"
                    + "           ,[varTarjeta]"
                    + "           ,[varNitEmpresa]"
                    + "           ,[varNumCuenta]"
                    + "           ,[varDispOrigen]"
                    + "           ,[varDesEstCoCargos]"
                    + "           ,[varDescTransac]"
                    + "           ,[decValTransaccion]"
                    + "           ,[decValDispensado]"
                    + "           ,[dateFechaTransac]"
                    + "           ,[decValCarCobr]"
                    + "           ,[decValIva]"
                    + "           ,[decTotalCobrar]"
                    + "           ,[decImpEmerEcono]"
                    + "           ,[varIndicadorRever]"
                    + "           ,[varRespuAutoriz]"
                    + "           ,[varDescrpResp]"
                    + "           ,[varCodAutoriza]"
                    + "           ,[varFiller]"
                    + "           ,[dateFechAutoriza]"
                    + "           ,[varHoraAutoriza]"
                    + "           ,[varHortaDisposi]"
                    + "           ,[varNumReferencia]"
                    + "           ,[varRedAdquiriente]"
                    + "           ,[varNumDispos]"
                    + "           ,[varCodEstablecimiento]"
                    + "           ,[varSubtipo]"
                    + "           ,[varDescriSubtipo]"
                    + "           ,[varNumTarjSecundari]"
                    + "           ,[varValorPropina]"
                    + "           ,[varValorIva]"
                    + "           ,[varValorBaseDevIva]"
                    + "           ,[varNumCuotas]"
                    + "           ,[varFiller2])"
                    + "     VALUES "
                    + "           (" + movimiento.getVarBin()
                    + "           ," + movimiento.getVarTarjeta()
                    + "           ," + movimiento.getVarNitEmpresa()
                    + "           ,'" + movimiento.getVarNumCuenta()
                    + "'           ,'" + movimiento.getVarDispOrigen()
                    + "'           ,'" + movimiento.getVarDesEstCoCargos()
                    + "'           ," + movimiento.getVarDescTransac()
                    + "           ," + movimiento.getDecValTransaccion()
                    + "           ,'" + movimiento.getDecValDispensado()
                    + "'           ,'" + movimiento.getDateFechaTransac()
                    + "           ," + movimiento.getDecValCarCobr()
                    + "           ," + movimiento.getDecImpEmerEcono()
                    + "           ," + movimiento.getDecValIva()
                    + "           ," + movimiento.getDecTotalCobrar()
                    + "           ," + movimiento.getDateFechAutoriza()
                    + "           ," + movimiento.getVarHoraAutoriza()
                    + "           ,'" + movimiento.getVarHortaDisposi()
                    + "'           ,'" + movimiento.getVarNumReferencia()
                    + "'           ," + movimiento.getVarRedAdquiriente()
                    + "'           ," + movimiento.getVarNumDispos()
                    + "'           ," + movimiento.getVarCodEstablecimiento()
                    + "'           ," + movimiento.getVarSubtipo()
                    + "'           ," + movimiento.getVarDescriSubtipo()
                    + "'           ," + movimiento.getVarNumTarjSecundari()
                    + "'           ," + movimiento.getVarValorPropina()
                    + "'           ," + movimiento.getVarValorIva()
                    + "'           ," + movimiento.getVarValorBaseDevIva()
                    + "'           ," + movimiento.getVarNumCuotas()
                    + "'           ," + movimiento.getVarFiller2() + "');";

          

            st.execute(sql);

            mo++;

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return mo;

    }

}
