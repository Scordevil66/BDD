/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;

import com.app.bdd.conexion.ConexionSQL;
import com.app.bdd.form.CargaMasivaMovimiento;
import com.app.bdd.form.Cargando;
import com.app.bdd.form.Menu;
import com.app.bdd.form.Progress;
import com.app.bdd.models.Contador;
import com.app.bdd.models.Movimientos;
import com.itextpdf.io.source.PdfTokenizer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Visibility;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.xml.bind.Marshaller.Listener;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author Gustavo
 */
public class MovimientoController {

    static Statement st;
    static Cargando c = new Cargando();
    static String rutas = "";
    static int retorno = 0;
    static int error = 0;
    static int fin = 0;

//    public void MostrarCargando() {
//        c.setLocationRelativeTo(null);
//        c.setVisible(true);
//
//        Timer t;
//        t = new Timer(2000, new Listener());
//        t.start();
//
//    }
//    class Listener implements ActionListener {
//
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }
    public static void MovimientoController() throws SQLException {
        // MovimientoController.st = ConexionSQL.conexion();
        try {

            MovimientoController.st = ConexionSQL.conexion();
        } catch (Exception e) {
            System.out.println(e);
        }
        {
        }
    }

//    public static void main(String[] args) {
//        LeerArchivoMovimientoTxt();
//    }
    public static int registrarMovimiento(Movimientos movimiento) throws Exception {

        //   JOptionPane.showMessageDialog(null, "Por favor espere" );
        MovimientoController.MovimientoController();

        int mo = 0;

        String sql = "";
//        
        String converFechaTransac = movimiento.getVarDateFechaTransac();
        String anioTransac = converFechaTransac.substring(0, 4);
        String mesTransac = converFechaTransac.substring(4, 6);
        String diaTransac = converFechaTransac.substring(6, 8);

        String convertergetVarFechAutoriza = movimiento.getVarFechAutoriza();
        String anioAutoriza = convertergetVarFechAutoriza.substring(0, 4);
        String mesAutoriza = convertergetVarFechAutoriza.substring(4, 6);
        String diaAutoriza = convertergetVarFechAutoriza.substring(6, 8);

//        CONVERT(VARCHAR, '" + mesN+"/"+diaN+"/" +anioN +"', 103)"
        try {

            sql = "INSERT INTO  [movimientos] "
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
                    + "           ('" + movimiento.getVarBin()
                    + "'           ,'" + movimiento.getVarTarjeta()
                    + "'           ,'" + movimiento.getVarNitEmpresa()
                    + "'           ,'" + movimiento.getVarNumCuenta()
                    + "'           ,'" + movimiento.getVarDispOrigen()
                    + "'           ,'" + movimiento.getVarDesEstCoCargos()
                    + "'           ,'" + movimiento.getVarDescTransac()
                    + "'           ,'" + movimiento.getDecValTransaccion()
                    + " '          ,'" + movimiento.getDecValDispensado()
                    + "'           ,CONVERT(VARCHAR, '" + mesTransac + "/" + diaTransac + "/" + anioTransac + "', 103)"
                    + "           ,'" + movimiento.getDecValCarCobr()
                    + "'           ,'" + movimiento.getDecValIva()
                    + "'           ,'" + movimiento.getDecTotalCobrar()
                    + " '          ,'" + movimiento.getDecImpEmerEcono()
                    + " '          ,'" + movimiento.getVarIndicadorRever()
                    + " '          ,'" + movimiento.getVarRespuAutoriz()
                    + " '          ,'" + movimiento.getVarDescrpResp()
                    + " '          ,'" + movimiento.getVarCodAutoriza()
                    + " '          ,'" + movimiento.getVarFiller()
                    + "'           ,CONVERT(VARCHAR, '" + diaAutoriza + "/" + mesAutoriza + "/" + anioAutoriza + "', 103)"
                    + "           ,'" + movimiento.getVarHoraAutoriza()
                    + " '          ,'" + movimiento.getVarHortaDisposi()
                    + "'           ,'" + movimiento.getVarNumReferencia()
                    + "'           ,'" + movimiento.getVarRedAdquiriente()
                    + "'           ,'" + movimiento.getVarNumDispos()
                    + "'           ,'" + movimiento.getVarCodEstablecimiento()
                    + "'           ,'" + movimiento.getVarSubtipo()
                    + "'           ,'" + movimiento.getVarDescriSubtipo()
                    + "'           ,'" + movimiento.getVarNumTarjSecundari()
                    + "'           ,'" + movimiento.getVarValorPropina()
                    + "'           ,'" + movimiento.getVarValorIva()
                    + "'           ,'" + movimiento.getVarValorBaseDevIva()
                    + "'           ,'" + movimiento.getVarNumCuotas()
                    + "'           ,'" + movimiento.getVarFiller2() + "');";

            st.execute(sql);

            mo++;

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return mo;

    }

    /* EJECUTA CONSULTA SALDO POR TARJETA  */
    public List<Movimientos> consultaSaldoPorTarjeta(String NumTarjeta, String FechIni, String FechFin, String entity) throws SQLException {

        List<Movimientos> movimientos = new ArrayList<>();
        Movimientos movimiento = new Movimientos();

        MovimientoController.MovimientoController();

        String sql = "";

        try {

            sql = " select  sal.varNombTajHabiente, "
                    + " mov.varTarjeta,"
                    + " mov.varDispOrigen,"
                    + " mov.varDesEstCoCargos, "
                    + "mov.varDescTransac ,"
                    + "mov.decValTransaccion,"
                    + " mov.dateFechaTransac,"
                    + "mov.decValIva,"
                    + "mov.decTotalCobrar,"
                    + "mov.decImpEmerEcono,"
                    + "mov.varIndicadorRever,"
                    + "mov.varDescrpResp,"
                    + " mov.varCodAutoriza,"
                    + "mov.varRedAdquiriente, "
                    + " mov.varCodEstablecimiento,"
                    + "mov.varDescriSubtipo,"
                    + "mov.varNumTarjSecundari"
                    + ",mov.varValorBaseDevIva,"
                    + "sal.decSaldoDispo,"
                    + "sal.varDescripEsta,"
                    + "comer.varNombreComercio  \n"
                    + " from saldos as sal, movimientos as mov,comerciosred as comer\n"
                    + " where sal.varTarjeta= mov.varTarjeta\n"
                    + " and comer.varCodigoComercio=mov.varCodEstablecimiento\n"
                    + " and mov.varBin= sal.varBin\n"
                    + " and mov.varSubtipo=sal.varSubtipo\n";
            if (!(NumTarjeta.equals(""))) {
                sql = sql + " and mov.varTarjeta='" + NumTarjeta + "'\n";
            }
            if (!((entity + "").equals(""))) {
                sql = sql + " and mov.varBin ='" + entity + "' \n";
            }
            if (!(FechIni.equals("")) && !(FechFin.equals(""))) {
                sql = sql + " and mov.dateFechaTransac  BETWEEN '" + FechIni + "' AND '" + FechFin + "'\n";
            }
            sql = sql + "order by mov.dateFechaTransac asc   ";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                movimientos.add(new Movimientos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), Double.parseDouble(rs.getString(6)), rs.getString(7), Double.parseDouble(rs.getString(8)), Double.parseDouble(rs.getString(9)), Double.parseDouble(rs.getString(10)), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21)));

            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return movimientos;
    }

    /* FIN CONSULTA SALDO POR TARJETA */
 /**/
 /**/
 /* EJECUTA SALDO TARJETAS POR EMPRESA */
    /**
     *
     * @param FechIni
     * @param FechFin
     * @param Nit
     * @param SubTipo
     * @param Bin
     * @param NumTarjeta
     * @param entity
     * @param codigoBin
     * @return
     * @throws java.sql.SQLException
     */
    public List<Movimientos> consultaSaldoTarjetasEmpresa(String FechIni, String FechFin, String Nit, String Bin, String entity, String NumTarjeta, String SubTipo, String codigoBin) throws SQLException {

        List<Movimientos> movimientos = new ArrayList<>();
        Movimientos movimiento = new Movimientos();

        MovimientoController.MovimientoController();

        String sql = "";

        try {

            sql = " select  mov.varNitEmpresa, sal.varNombTajHabiente, "
                    + " mov.varTarjeta,"
                    + " mov.varDispOrigen,"
                    + " mov.varDesEstCoCargos, "
                    + "mov.varDescTransac ,"
                    + "mov.decValTransaccion,"
                    + " mov.dateFechaTransac,"
                    + "mov.decValIva,"
                    + "mov.decTotalCobrar,"
                    + "mov.decImpEmerEcono,"
                    + "mov.varIndicadorRever,"
                    + "mov.varDescrpResp,"
                    + " mov.varCodAutoriza,"
                    + "mov.varRedAdquiriente, "
                    + " mov.varCodEstablecimiento,"
                    + "mov.varDescriSubtipo,"
                    + "mov.varNumTarjSecundari"
                    + ",mov.varValorBaseDevIva,"
                    + "sal.decSaldoDispo,"
                    + "sal.varDescripEsta,"
                    + "comer.varNombreComercio  \n"
                    + " from saldos as sal, movimientos as mov,comerciosred as comer\n"
                    + " where sal.varTarjeta= mov.varTarjeta\n"
                    + " and comer.varCodigoComercio=mov.varCodEstablecimiento\n"
                    + " and mov.varBin= sal.varBin\n"
                    + " and mov.varSubtipo=sal.varSubtipo\n";
            if (!(Nit.equals(""))) {
                sql = sql + " and mov.varTarjeta='" + Nit + "'\n";
            }
            if (!(SubTipo.equals(""))) {
                sql = sql + " and mov.varTarjeta='" + SubTipo + "'\n";
            }
            if (!((entity + "").equals(""))) {
                sql = sql + " and mov.varBin ='" + entity + "' \n";
            }

            if (!(FechIni.equals("")) && !(FechFin.equals(""))) {
                sql = sql + " and mov.dateFechaTransac  BETWEEN '" + FechIni + "' AND '" + FechFin + "'\n";
            }

            sql = sql + "order by mov.dateFechaTransac asc   ";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                movimientos.add(new Movimientos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), Double.parseDouble(rs.getString(7)), rs.getString(8), Double.parseDouble(rs.getString(9)), Double.parseDouble(rs.getString(10)), Double.parseDouble(rs.getString(11)), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22)));

            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return movimientos;
    }

    /* FIN CONSULTA SALDO TARJETAS POR EMPRESA */
// CONSULTA EXTRACTO POR TARJETA    
    /**
     *
     * @param NumTarjeta
     * @param FechIni
     * @param FechFin
     * @param codigoBin
     * @param entity
     * @return
     * @throws java.sql.SQLException
     */
    public List<Movimientos> consultaExtractoPorTarjeta(String NumTarjeta, String FechIni, String FechFin, String codigoBin, String entity) throws SQLException {

        List<Movimientos> movimientos = new ArrayList<>();
        Movimientos movimiento = new Movimientos();

        MovimientoController.MovimientoController();

        String sql = "";

        try {
            sql = " select  sal.varNombTajHabiente, "
                    + " mov.varTarjeta,"
                    + " mov.varDispOrigen,"
                    + " mov.varDesEstCoCargos, "
                    + " mov.varDescTransac ,"
                    + " mov.decValTransaccion,"
                    + " mov.dateFechaTransac,"
                    + " mov.decValIva,"
                    + " mov.decTotalCobrar,"
                    + " mov.decImpEmerEcono,"
                    + " mov.varIndicadorRever,"
                    + " mov.varDescrpResp,"
                    + " mov.varCodAutoriza,"
                    + " mov.varRedAdquiriente, "
                    + " mov.varCodEstablecimiento,"
                    + " mov.varDescriSubtipo,"
                    + " mov.varNumTarjSecundari,"
                    + " mov.varValorBaseDevIva,"
                    + " sal.decSaldoDispo,"
                    + " sal.varDescripEsta,"
                    + " comer.varNombreComercio  \n"
                    + " from saldos as sal, movimientos as mov,comerciosred as comer\n"
                    + " where sal.varTarjeta= mov.varTarjeta\n"
                    + " and comer.varCodigoComercio=mov.varCodEstablecimiento\n"
                    + " and mov.varBin= sal.varBin\n"
                    + " and mov.varSubtipo=sal.varSubtipo\n";

            if (!(NumTarjeta.equals(""))) {
                sql = sql + " and mov.varTarjeta='" + NumTarjeta + "'\n";
            }
            if (!((entity + "").equals(""))) {
                sql = sql + " and mov.varBin ='" + entity + "' \n";
            }

            if (!(FechIni.equals("")) && !(FechFin.equals(""))) {
                sql = sql + " and mov.dateFechaTransac  BETWEEN '" + FechIni + "' AND '" + FechFin + "'\n";
            }

            sql = sql + "order by mov.dateFechaTransac asc   ";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                movimientos.add(new Movimientos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), Double.parseDouble(rs.getString(6)), rs.getString(7), Double.parseDouble(rs.getString(8)), Double.parseDouble(rs.getString(9)), Double.parseDouble(rs.getString(10)), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21)));
            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return movimientos;
    }
    /// FIN CONSULTA ESTRACTO POR TARJETA 

    // INICIO CONSULTA  MOVIMIENTOS TARJETA POR EMPRESA
    public List<Movimientos> consultaMovimientosTarjetaEMpresa(String FechIni, String FechFin, String Bin, String Nit, String SubTipo, int codigoBin, String entity) throws SQLException {

        List<Movimientos> movimientos = new ArrayList<>();
        Movimientos movimiento = new Movimientos();

        MovimientoController.MovimientoController();

        String sql = "";

        try {

            sql = " select  sal.varNombTajHabiente, "
                    + " mov.varTarjeta,"
                    + " mov.varDispOrigen,"
                    + " mov.varDesEstCoCargos, "
                    + "mov.varDescTransac ,"
                    + "mov.decValTransaccion,"
                    + " mov.dateFechaTransac,"
                    + "mov.decValIva,"
                    + "mov.decTotalCobrar,"
                    + "mov.decImpEmerEcono,"
                    + "mov.varIndicadorRever,"
                    + "mov.varDescrpResp,"
                    + " mov.varCodAutoriza,"
                    + "mov.varRedAdquiriente, "
                    + " mov.varCodEstablecimiento,"
                    + "mov.varDescriSubtipo,"
                    + "mov.varNumTarjSecundari"
                    + ",mov.varValorBaseDevIva,"
                    + "sal.decSaldoDispo,"
                    + "sal.varDescripEsta,"
                    + "comer.varNombreComercio  \n"
                    + " from saldos as sal, movimientos as mov,comerciosred as comer\n"
                    + " where sal.varTarjeta= mov.varTarjeta\n"
                    + " and comer.varCodigoComercio=mov.varCodEstablecimiento\n"
                    + " and mov.varBin= sal.varBin\n"
                    + " and mov.varSubtipo=sal.varSubtipo\n";

            if (!(Bin.equals(""))) {
                sql = sql + " and mov.varTarjeta='" + Bin + "'\n";
            }
            if (!(Nit.equals(""))) {
                sql = sql + " and mov.varTarjeta='" + Nit + "'\n";
            }
            if (!((entity + "").equals(""))) {
                sql = sql + " and mov.varBin ='" + entity + "' \n";
            }
            if (!(SubTipo.equals(""))) {
                sql = sql + " and mov.varTarjeta='" + SubTipo + "'\n";
            }
            if (!(FechIni.equals("")) && !(FechFin.equals(""))) {
                sql = sql + " and mov.dateFechaTransac  BETWEEN '" + FechIni + "' AND '" + FechFin + "'\n";
            }

            sql = sql + "order by mov.dateFechaTransac asc   ";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                movimientos.add(new Movimientos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), Double.parseDouble(rs.getString(6)), rs.getString(7), Double.parseDouble(rs.getString(8)), Double.parseDouble(rs.getString(9)), Double.parseDouble(rs.getString(10)), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21)));
                //                                  String varTarjeta, String varDesEstCoCargos, String varDateFechaTransac, double decValCarCobr, double decValIva, double decImpEmerEcono, String varIndicadorRever, String varDescrpResp, String varCodAutoriza, String varRedAdquiriente, String varNumDispos, String varCodEstablecimiento, String varDescriSubtipo, String varNumTarjSecundari, String varValorBaseDevIva, String decSaldoDispo, String varDescripEsta, String varNombreComercio
            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return movimientos;
    }

    // FIN CONSULTA MOVIMIENTOS TARJETA POR EMPRESA
    // INICIO CONSULTA MOVIMIENTOS POR ENTIDAD 
    public List<Movimientos> consultaMovimientosTarjetaEntidad(String FechIni, String FechFin, String Bin, String entity) throws SQLException {

        List<Movimientos> movimientos = new ArrayList<>();
        Movimientos movimiento = new Movimientos();

        MovimientoController.MovimientoController();

        String sql = "";

        try {

            sql = " select  sal.varNombTajHabiente, "
                    + " mov.varTarjeta,"
                    + " mov.varDispOrigen,"
                    + " mov.varDesEstCoCargos, "
                    + "mov.varDescTransac ,"
                    + "mov.decValTransaccion,"
                    + " mov.dateFechaTransac,"
                    + "mov.decValIva,"
                    + "mov.decTotalCobrar,"
                    + "mov.decImpEmerEcono,"
                    + "mov.varIndicadorRever,"
                    + "mov.varDescrpResp,"
                    + " mov.varCodAutoriza,"
                    + "mov.varRedAdquiriente, "
                    + " mov.varCodEstablecimiento,"
                    + "mov.varDescriSubtipo,"
                    + "mov.varNumTarjSecundari"
                    + ",mov.varValorBaseDevIva,"
                    + "sal.decSaldoDispo,"
                    + "sal.varDescripEsta,"
                    + "comer.varNombreComercio  \n"
                    + " from saldos as sal, movimientos as mov,comerciosred as comer\n"
                    + " where sal.varTarjeta= mov.varTarjeta\n"
                    + " and comer.varCodigoComercio=mov.varCodEstablecimiento\n"
                    + " and mov.varBin= sal.varBin\n"
                    + " and mov.varSubtipo=sal.varSubtipo\n";

            if (!(Bin.equals(""))) {
                sql = sql + " and mov.varBin='" + Bin + "'\n";
            }
            if (!((entity + "").equals(""))) {
                sql = sql + " and mov.varBin ='" + entity + "' \n";
            }

            if (!(FechIni.equals("")) && !(FechFin.equals(""))) {
                sql = sql + " and mov.dateFechaTransac  BETWEEN '" + FechIni + "' AND '" + FechFin + "'\n";
            }

            sql = sql + "order by mov.dateFechaTransac asc   ";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                movimientos.add(new Movimientos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), Double.parseDouble(rs.getString(6)), rs.getString(7), Double.parseDouble(rs.getString(8)), Double.parseDouble(rs.getString(9)), Double.parseDouble(rs.getString(10)), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21)));

            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return movimientos;
    }

    // FIN DE CONSULTA MOVIMIENTOS POR ENTIDAD
    // INICIO CONSULTA SALDO TARJETAS POR ENTIDAD
    public List<Movimientos> consultaSaldoTarjetaEntidad(String NumTarjeta, String Bin, String entity) throws SQLException {

        List<Movimientos> movimientos = new ArrayList<>();
        Movimientos movimiento = new Movimientos();

        MovimientoController.MovimientoController();

        String sql = "";

        try {

            sql = " select  sal.varNombTajHabiente, "
                    + " mov.varTarjeta,"
                    + " mov.varDispOrigen,"
                    + " mov.varDesEstCoCargos, "
                    + "mov.varDescTransac ,"
                    + "mov.decValTransaccion,"
                    + " mov.dateFechaTransac,"
                    + "mov.decValIva,"
                    + "mov.decTotalCobrar,"
                    + "mov.decImpEmerEcono,"
                    + "mov.varIndicadorRever,"
                    + "mov.varDescrpResp,"
                    + " mov.varCodAutoriza,"
                    + "mov.varRedAdquiriente, "
                    + " mov.varCodEstablecimiento,"
                    + "mov.varDescriSubtipo,"
                    + "mov.varNumTarjSecundari"
                    + ",mov.varValorBaseDevIva,"
                    + "sal.decSaldoDispo,"
                    + "sal.varDescripEsta,"
                    + "comer.varNombreComercio  \n"
                    + " from saldos as sal, movimientos as mov,comerciosred as comer\n"
                    + " where sal.varTarjeta= mov.varTarjeta\n"
                    + " and comer.varCodigoComercio=mov.varCodEstablecimiento\n"
                    + " and mov.varBin= sal.varBin\n"
                    + " and mov.varSubtipo=sal.varSubtipo\n";

            if (!(Bin.equals(""))) {
                sql = sql + " and mov.varTarjeta='" + Bin + "'\n";
            }
            if (!((entity + "").equals(""))) {
                sql = sql + " and mov.varBin ='" + entity + "' \n";
            }
            if (!(NumTarjeta.equals(""))) {
                sql = sql + " and mov.varTarjeta='" + NumTarjeta + "'\n";
            }

            sql = sql + "order by mov.dateFechaTransac asc   ";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                movimientos.add(new Movimientos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), Double.parseDouble(rs.getString(6)), rs.getString(7), Double.parseDouble(rs.getString(8)), Double.parseDouble(rs.getString(9)), Double.parseDouble(rs.getString(10)), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21)));

            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return movimientos;
    }

    // FIN SONSULTA SALDOS TARJETA POR ENTIDAD
    // TRAER LISTADO ENTIDADES
    public static List<Movimientos> consultaEntidades() throws SQLException {

        List<Movimientos> entidades = new ArrayList<>();
        Movimientos entidad = new Movimientos();

        MovimientoController.MovimientoController();

        String sql = "";

        try {

            sql = "SELECT [idBinbanco]\n"
                    + "      ,[codBanco]\n"
                    + "      ,[CodBin]\n"
                    + "      ,[nombreBanco]\n"
                    + "  FROM [codigosbines] ";

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                entidades.add(new Movimientos(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));

            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return entidades;
    }

    public int LeerArchivoMovimiento(String ruta) {

        rutas = ruta;

        c.setLocationRelativeTo(null);
        c.setVisible(true);

        Timer t;
        t = new Timer(1000, new ListenerMov());
        t.start();

        return retorno;

    }

    public void consultaExtractoPorTarjeta(PdfTokenizer.TokenType tokenType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    class ListenerMov implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                retorno = LeerArchivoMovimientoTxt(rutas);
            } catch (Exception ex) {
                Logger.getLogger(MovimientoController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    // FIN LISTADO ENTIDADES  
    public int LeerArchivoMovimientoTxt(String ruta) throws Exception {
        //Creamos un String que va a contener todo el texto del archivo

        String texto = "";
        String texto1 = "";

        int resultado = 0;
        int conteo = 0;
        int totalLineas = 0;

        CargaMasivaMovimiento cargaMasivaMovimientos = new CargaMasivaMovimiento();

        Movimientos movimiento = new Movimientos();

        double decValTransaccion = 0, decValDispensado = 0, decValCarCobr = 0, decValIva = 0, decTotalCobrar = 0, decImpEmerEcono = 0;

        try {
//Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader(ruta);

            FileReader lector2 = new FileReader(ruta);
//El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);
            BufferedReader contenido2 = new BufferedReader(lector2);

//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while ((texto1 = contenido.readLine()) != null) {
                totalLineas++;
            }

//            Contador.setTotalLineas(totalLineas);
//            Progress frame = new Progress();
//            javax.swing.SwingUtilities.invokeLater(new Runnable() {
//                @Override
//                public void run() {
//                    frame.createAndShowGUI();
//                }
//            });
    if(fin==0){
            while ((texto = contenido2.readLine()) != null) {

                movimiento = new Movimientos();
                decValTransaccion = 0;
                decValDispensado = 0;
                decValCarCobr = 0;
                decValIva = 0;
                decTotalCobrar = 0;
                decImpEmerEcono = 0;

                String primer = substring(0, 4);
                primer = primer + "XXXX";
                String restobin = texto.substring(4, 9);
                movimiento.setVarBin(primer + restobin);

                if ((texto.substring(9, 28)).length() > 16) {
                    String corte = substring(9, 13);
                    corte = corte + "XXXX";
                    String codigobin = texto.substring(13, 18);
                    String varTarjeta = substring(18, 21);
                    varTarjeta = varTarjeta + "XXX";
                    varTarjeta = corte + codigobin + varTarjeta + texto.substring(21, 28);
                    movimiento.setVarTarjeta(varTarjeta);

                } else {

                    String ntarjeta = (texto.substring(9, 28));
                    String corte = ntarjeta.substring(0, 3);
                    corte = corte + "XXX";
                    String codigobin = texto.substring(3, 8);
                    String varTarjeta = substring(8, 11);
                    varTarjeta = varTarjeta + "XXX";
                    varTarjeta = corte + codigobin + varTarjeta + texto.substring(11, 16);
                    movimiento.setVarTarjeta(varTarjeta);

                }

                movimiento.setVarNitEmpresa(texto.substring(28, 43));
                movimiento.setVarNumCuenta(texto.substring(43, 62));
                movimiento.setVarDispOrigen(texto.substring(62, 64));
                movimiento.setVarDesEstCoCargos(texto.substring(64, 94));
                movimiento.setVarDescTransac(texto.substring(94, 124));

                String enteroValTransaccion = texto.substring(124, 139);
                String decimalValTransaccion = texto.substring(139, 141);
                String cadenaValTransaccion = enteroValTransaccion + "." + decimalValTransaccion;
                decValTransaccion = Double.parseDouble(cadenaValTransaccion);

//              decValTransaccion = Double.parseDouble(texto.substring(124, 141));
                String enteroValDispensado = texto.substring(141, 156);
                String decimalValDispensado = texto.substring(156, 158);
                String cadenaValDispensado = enteroValDispensado + "." + decimalValDispensado;
                decValDispensado = Double.parseDouble(cadenaValDispensado);

//                decValDispensado = Double.parseDouble(texto.substring(141, 158));
                movimiento.setVarDateFechaTransac(texto.substring(158, 166));

                String enteroTotalCobrar = texto.substring(166, 181);
                String decimalTotalCobrar = texto.substring(181, 183);
                String cadenaTotalCobrar = enteroTotalCobrar + "." + decimalTotalCobrar;
                decTotalCobrar = Double.parseDouble(cadenaTotalCobrar);

//                decTotalCobrar = Double.parseDouble(texto.substring(166, 183));
//                movimiento.setDecTotalCobrar(decTotalCobrar);
                String enterodecValIva = texto.substring(183, 198);
                String decimaldecValIva = texto.substring(198, 200);
                String cadenadecValIva = enterodecValIva + "." + decimaldecValIva;
                decValIva = Double.parseDouble(cadenadecValIva);

//                decValIva = Double.parseDouble(texto.substring(183, 200 ));
//                movimiento.setDecValIva(decValIva);
                String enterodecValCarCobr = texto.substring(200, 215);
                String decimaldecValCarCobr = texto.substring(215, 217);
                String cadenadecValCarCobr = enterodecValCarCobr + "." + decimaldecValCarCobr;
                decValCarCobr = Double.parseDouble(cadenadecValCarCobr);

//                decValCarCobr = Double.parseDouble(texto.substring(200, 217));
//                movimiento.setDecValCarCobr(decValCarCobr);
                String enterodecImpEmerEcono = texto.substring(217, 232);
                String decimaldecImpEmerEcono = texto.substring(232, 234);
                String cadenadecImpEmerEcono = enterodecImpEmerEcono + "." + decimaldecImpEmerEcono;
                decImpEmerEcono = Double.parseDouble(cadenadecImpEmerEcono);
//                decImpEmerEcono = Double.parseDouble(texto.substring(217, 234));

                movimiento.setVarIndicadorRever(texto.substring(234, 235));
                movimiento.setVarRespuAutoriz(texto.substring(235, 237));
                movimiento.setVarDescrpResp(texto.substring(237, 267));
                movimiento.setVarCodAutoriza(texto.substring(267, 273));
                movimiento.setVarFiller(texto.substring(273, 276));
                if (texto.substring(276, 284).equals("00000000")) {
                    movimiento.setVarFechAutoriza("00010101");
                } else {
                    movimiento.setVarFechAutoriza(texto.substring(276, 284));
                }
                movimiento.setVarHoraAutoriza(texto.substring(284, 293));
                movimiento.setVarHortaDisposi(texto.substring(293, 299));
                movimiento.setVarNumReferencia(texto.substring(299, 311));
                movimiento.setVarRedAdquiriente(texto.substring(311, 315));
                movimiento.setVarNumDispos(texto.substring(315, 331));
                movimiento.setVarCodEstablecimiento(texto.substring(331, 341));
                movimiento.setVarSubtipo(texto.substring(341, 344));
                movimiento.setVarDescriSubtipo(texto.substring(344, 374));
                movimiento.setVarNumTarjSecundari(texto.substring(374, 393));
                movimiento.setVarValorPropina(texto.substring(393, 408));
                movimiento.setVarValorIva(texto.substring(408, 423));
                movimiento.setVarValorBaseDevIva(texto.substring(423, 438));
                movimiento.setVarNumCuotas(texto.substring(438, 440));
                movimiento.setVarFiller2(texto.substring(440, 450));

                System.out.println(texto);

                conteo++;

                // cargaMasivaMovimientos.Conteo(conteo + "", totalLineas + "");
                resultado = registrarMovimiento(movimiento);

                error = 0;
                fin++;
                
                

            }
            JOptionPane.showMessageDialog(null, "Registro realizado satisfactoriamente");
    }
            c.dispose();
            c.setVisible(false);
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {

            c.dispose();
            c.setVisible(false);
            if (error == 0) {
                JOptionPane.showMessageDialog(null, "  Error al intentar cargar el archivo, Valide nuevamente ");
            }
            error++;
            //  System.out.println("Error al leer");
        }
        return resultado;
    }

    //public List<Movimientos> consultaSaldoTarjetasEmpresa(String trim, String trim0, String trim1, String trim2, String trim3) {
    //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    // }
    //public List<Movimientos> consultaSaldoTarjetasEmpresa(String trim, String trim0, String trim1, String trim2) {
    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}
