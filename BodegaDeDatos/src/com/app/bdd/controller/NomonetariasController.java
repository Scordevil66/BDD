/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;

import com.app.bdd.conexion.ConexionSQL;

import com.app.bdd.models.Movimientos;
import com.app.bdd.controller.NomonetariasController;
import com.app.bdd.models.NoMonetarias;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author Gustavo
 */
public class NomonetariasController {

    static Statement st;

    public static void NomonetariasController() throws SQLException {
        NomonetariasController.st = ConexionSQL.conexion();
    }

//    public static void main(String[] args) {
//        LeerArchivoNoMonetariasTxt("");
//    }
    public static int registrarNoMonetaria(NoMonetarias nomonetarias) throws Exception {

        NomonetariasController.NomonetariasController();

        int no = 0;

        String sql = "";

        try {

            sql = "INSERT INTO  [BodegaDatos].[dbo].[nomonetarias] "
                    + "           ([varTipoNovedad]"
                    + "           ,[dateFechaNovedad]"
                    + "           ,[varCodFranquicia]"
                    + "           ,[varCodBin]"
                    + "           ,[varNumTarjeta]"
                    + "           ,[varNombreTarjetahabiente]"
                    + "           ,[varSubTipo]"
                    + "           ,[varTipoCuenta]"
                    + "           ,[varNumeroCuenta]"
                    + "           ,[varOficina]"
                    + "           ,[varTipoDocumTatjetaHabiente]"
                    + "           ,[varNumDocumento]"
                    + "           ,[varNitEmpresa]"
                    + "           ,[varNombreEmpresa]"
                    + "           ,[varNumTarjetaAnterior])"
                    + "     VALUES "
                    + "           ('" + nomonetarias.getVarTipoNovedad()
                    + "'           ,'" + nomonetarias.getVardateFechaNovedad()
                    + "'           ,'" + nomonetarias.getVarCodFranquicia()
                    + "'           ,'" + nomonetarias.getVarCodBin()
                    + "'           ,'" + nomonetarias.getVarNumTarjeta()
                    + "'           ,'" + nomonetarias.getVarNombreTarjetahabiente()
                    + "'           ,'" + nomonetarias.getVarSubTipo()
                    + "'           ,'" + nomonetarias.getVarTipoCuenta()
                    + "'          ,'" + nomonetarias.getVarNumeroCuenta()
                    + "'           ,'" + nomonetarias.getVarOficina()
                    + "'           ,'" + nomonetarias.getVarTipoDocumTatjetaHabiente()
                    + " '          ,'" + nomonetarias.getVarNumDocumento()
                    + " '          ,'" + nomonetarias.getVarNitEmpresa()
                    + "'           ,'" + nomonetarias.getVarNombreEmpresa()
                    + " '          ,'" + nomonetarias.getVarNumTarjetaAnterior() + "');";

            st.execute(sql);

            no++;

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return no;

    }

    /* EJECUTA CONSULTA SALDO POR TARJETA  */
    public List<NoMonetarias> consultaPorTarjeta(String NumTarjeta, String FechIni, String FechFin, String entidad) throws SQLException {

        List<NoMonetarias> nomonetarias = new ArrayList<>();
        NoMonetarias nomonetaria = new NoMonetarias();

        NomonetariasController.NomonetariasController();

        String sql = "";

        try {

            sql = "  SELECT		nomo.varTipoNovedad, \n"
                    + "                                       nomo.dateFechaNovedad, /*fecha*/\n"
                    + "                                       nomo.varCodBin, /*Bin*/\n"
                    + "					nomo.varNumTarjeta,/* tarjeta fulano*/\n"
                    + "					nomo.varNombreTarjetahabiente, /*nombre fulnano*/\n"
                    + "       				nomo.varOficina, /*oficina*/\n"
                    + "					nomo.varTipoDocumTatjetaHabiente, /*codigo tipo documento*/\n"
                    + "					tipodoc.varDescripcionTipoDocumento,/*descp tipo doicumento*/\n"
                    + "					nomo.varNumDocumento, /*documento */\n"
                    + "					nomo.varNitEmpresa, /*nit empresa*/\n"
                    + "					nomo.varNombreEmpresa, /*nombre empresa*/\n"
                    + " 				        nomo.varNumTarjetaAnterior,/*tarjeta anterior*/\n"
                    + "					mov.decValCarCobr,/*comision*/\n"
                    + "                                       nomo.varSubTipo,/*codigo subtipo*/\n"
                    + "					mov.varDescriSubtipo, /*Descripcion subtipo*/\n"
                    + "					tip.varDescripcionTipoNovedad,/*tipó*/\n"
                    + "					sa.varEstadoTarjeta,/*codigo estado trarjeta*/\n"
                    + "					sa.varDescripEsta /*descripcion estado tarjeta*/\n"
                    + " FROM movimientos as mov, nomonetarias as nomo, saldos as sa, tiposnovedad  as tip, tipodocumento as tipodoc, comerciosred as comer \n"
                    + " WHERE  sa.varTarjeta = mov.varTarjeta\n"
                    + " and mov.varTarjeta=nomo.varNumTarjeta\n"
                    + " and mov.varCodEstablecimiento=comer.varCodigoComercio\n"
                    + " and nomo.varTipoDocumTatjetaHabiente=tipodoc.varCodigoTipoDocumento\n"
                    + " and sa.varSubtipo =nomo.varSubTipo\n"
                    + " and nomo.varTipoNovedad = tip.varCodigoTipoNovedad ";

            if (!(NumTarjeta.equals(""))) {
                sql = sql + " and nomo.varNumTarjeta='" + NumTarjeta + "'\n";
            }
            
             if (!((entidad+"").equals(""))) {
                sql = sql + " and mov.varBin ='"+ entidad +"' \n";
            }

            if (!(FechIni.equals("")) && !(FechFin.equals(""))) {
                sql = sql + " and mov.dateFechaTransac  BETWEEN '" + FechIni + "' AND '" + FechFin + "'\n";
            }

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                nomonetarias.add(new NoMonetarias(rs.getString(1), Double.parseDouble(rs.getString(2)), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), Double.parseDouble(rs.getString(13)), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18)));

            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return nomonetarias;
    }

    /* FIN CONSULTA SALDO POR TARJETA */
 /* EJECUTA CONSULTA SALDO POR EMPRESA  */
    public List<NoMonetarias> consultaPorEmpresa(String Bin, String FechIni, String FechFin, String Nit, String Subtipo, String entidad) throws SQLException {

        List<NoMonetarias> nomonetarias = new ArrayList<>();
        NoMonetarias nomonetaria = new NoMonetarias();

        NomonetariasController.NomonetariasController();

        String sql = "";

        try {

            sql = "  SELECT		nomo.varTipoNovedad, \n"
                    + "                                       nomo.dateFechaNovedad, /*fecha*/\n"
                    + "                                       nomo.varCodBin, /*Bin*/\n"
                    + "					nomo.varNumTarjeta,/* tarjeta fulano*/\n"
                    + "					nomo.varNombreTarjetahabiente, /*nombre fulnano*/\n"
                    + "       				nomo.varOficina, /*oficina*/\n"
                    + "					nomo.varTipoDocumTatjetaHabiente, /*codigo tipo documento*/\n"
                    + "					tipodoc.varDescripcionTipoDocumento,/*descp tipo doicumento*/\n"
                    + "					nomo.varNumDocumento, /*documento */\n"
                    + "					nomo.varNitEmpresa, /*nit empresa*/\n"
                    + "					nomo.varNombreEmpresa, /*nombre empresa*/\n"
                    + " 				        nomo.varNumTarjetaAnterior,/*tarjeta anterior*/\n"
                    + "					mov.decValCarCobr,/*comision*/\n"
                    + "                                       nomo.varSubTipo,/*codigo subtipo*/\n"
                    + "					mov.varDescriSubtipo, /*Descripcion subtipo*/\n"
                    + "					tip.varDescripcionTipoNovedad,/*tipó*/\n"
                    + "					sa.varEstadoTarjeta,/*codigo estado trarjeta*/\n"
                    + "					sa.varDescripEsta /*descripcion estado tarjeta*/\n"
                    + " FROM movimientos as mov, nomonetarias as nomo, saldos as sa, tiposnovedad  as tip, tipodocumento as tipodoc, comerciosred as comer \n"
                    + " WHERE "
                    + " sa.varTarjeta = mov.varTarjeta\n"
                    + " and mov.varTarjeta=nomo.varNumTarjeta\n"
                    + " and saldos.varNombTajHabiente = nomonetarias.varNombreTarjetahabiente\n"
                    + " and nomo.varTipoDocumTatjetaHabiente=tipodoc.varCodigoTipoDocumento\n"
                    + " and sa.varSubtipo =nomo.varSubTipo\n"
                    + " and nomo.varTipoNovedad = tip.varCodigoTipoNovedad ";

            if (!(Bin.equals(""))) {
                sql = sql + " nomo.varCodBin='" + Bin + "'\n";
            }
            if (!(Nit.equals(""))) {
                sql = sql + " and nomo.varNitEmpresa='" + Nit + "'\n";
            }
            if (!(Subtipo.equals(""))) {
                sql = sql + " and mov.varDescriSubtipo='" + Subtipo + "'\n";
            }
            
            if (!((entidad+"").equals(""))) {
                sql = sql + " and mov.varBin ='"+ entidad +"' \n";
            }
            
            if (!(FechIni.equals("")) && !(FechFin.equals(""))) {
                sql = sql + " and mov.dateFechaTransac  BETWEEN '" + FechIni + "' AND '" + FechFin + "'\n";
            }

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                nomonetarias.add(new NoMonetarias(rs.getString(1), Double.parseDouble(rs.getString(2)), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), Double.parseDouble(rs.getString(13)), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18)));

            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return nomonetarias;
    }

    /* FIN CONSULTA SALDO POR EMPRESA */
 /* EJECUTA CONSULTA SALDO POR ENTIDAD  */
    public List<NoMonetarias> consultaPorEntidad(String Bin, String FechIni, String FechFin, String entidad) throws SQLException {

        List<NoMonetarias> nomonetarias = new ArrayList<>();
        NoMonetarias noMonetarias = new NoMonetarias();

        NomonetariasController.NomonetariasController();

        String sql = "";

        try {

            sql = " 	SELECT	nomo.varTipoNovedad, \n"
                    + "                                       nomo.dateFechaNovedad, /*fecha*/\n"
                    + "                                       nomo.varCodBin, /*Bin*/\n"
                    + "					nomo.varNumTarjeta,/* tarjeta fulano*/\n"
                    + "					nomo.varNombreTarjetahabiente, /*nombre fulnano*/\n"
                    + "       				nomo.varOficina, /*oficina*/\n"
                    + "					nomo.varTipoDocumTatjetaHabiente, /*codigo tipo documento*/\n"
                    + "					tipodoc.varDescripcionTipoDocumento,/*descp tipo doicumento*/\n"
                    + "					nomo.varNumDocumento, /*documento */\n"
                    + "					nomo.varNitEmpresa, /*nit empresa*/\n"
                    + "					nomo.varNombreEmpresa, /*nombre empresa*/\n"
                    + " 				        nomo.varNumTarjetaAnterior,/*tarjeta anterior*/\n"
                    + "					mov.decValCarCobr,/*comision*/\n"
                    + "                                       nomo.varSubTipo,/*codigo subtipo*/\n"
                    + "					mov.varDescriSubtipo, /*Descripcion subtipo*/\n"
                    + "					tip.varDescripcionTipoNovedad,/*tipó*/\n"
                    + "					sa.varEstadoTarjeta,/*codigo estado trarjeta*/\n"
                    + "					sa.varDescripEsta /*descripcion estado tarjeta*/\n"
                    + " FROM movimientos as mov, nomonetarias as nomo, saldos as sa, tiposnovedad  as tip, tipodocumento as tipodoc, comerciosred as comer \n"
                    + " WHERE "
                    + " and sa.varTarjeta = mov.varTarjeta\n"
                    + " and mov.varTarjeta=nomo.varNumTarjeta\n"
                    + " and mov.varCodEstablecimiento=comer.varCodigoComercio\n"
                    + " and nomo.varTipoDocumTatjetaHabiente=tipodoc.varCodigoTipoDocumento\n"
                    + " and sa.varSubtipo =nomo.varSubTipo\n"
                    + " and nomo.varTipoNovedad = tip.varCodigoTipoNovedad  ";

            if (!(Bin.equals(""))) {
                sql = sql + " nomo.varCodBin='" + Bin + "'\n";
            }
            if (!(FechIni.equals("")) && !(FechFin.equals(""))) {
                sql = sql + " and mov.dateFechaTransac  BETWEEN '" + FechIni + "' AND '" + FechFin + "'\n";
            }
            
            if (!((entidad+"").equals(""))) {
                sql = sql + " and mov.varBin ='"+ entidad +"' \n";
            }

            ResultSet rs = null;

            rs = st.executeQuery(sql);

            while (rs.next()) {
                nomonetarias.add(new NoMonetarias(rs.getString(1), Double.parseDouble(rs.getString(2)), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), Double.parseDouble(rs.getString(13)), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18)));

            }

        } catch (Exception e) {

//            throw e;.
            System.out.println("errror------" + e);

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return nomonetarias;
    }

    /* FIN CONSULTA SALDO POR ENTIDAD */
    public static int LeerArchivoNoMonetariasTxt(String ruta) {
        //Creamos un String que va a contener todo el texto del archivo
        String texto = "";

        int resultado = 0;

        NoMonetarias nomonetaria = new NoMonetarias();

        // double decValTransaccion = 0, decValDispensado = 0, decValCarCobr = 0, decValIva = 0, decTotalCobrar = 0, decImpEmerEcono = 0;
        try {
//Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader(ruta);

//El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);

//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while ((texto = contenido.readLine()) != null) {

                nomonetaria = new NoMonetarias();
//                decValTransaccion = 0;
//                decValDispensado = 0;
//                decValCarCobr = 0;
//                decValIva = 0;
//                decTotalCobrar = 0;
//                decImpEmerEcono = 0;
                nomonetaria.setVarTipoNovedad(texto.substring(0, 3));
                nomonetaria.setVardateFechaNovedad(texto.substring(3, 11));
                nomonetaria.setVarCodFranquicia(texto.substring(11, 14));
                //nomonetaria.setVarCodBin(texto.substring(14, 23));
                
                String primer= substring(14,18);
                primer =primer+"XXXX";
                String restobin = texto.substring(18, 23);
                nomonetaria.setVarCodBin(primer+restobin);
                
                
               /* String codigobin = texto.substring(9, 18);
                String varTarjeta = substring(18, 23); 
                varTarjeta = varTarjeta + "xxxx";
                varTarjeta = codigobin + varTarjeta  + texto.substring(23, 28); 
                movimiento.setVarTarjeta(varTarjeta*/
                
//                String codigobin = texto.substring(23, 32);
//                String varTarjeta = substring(32,37);
//                 varTarjeta = varTarjeta + "XXXX";
//                String varnumtarjeta =(substring(23, 37));
//                varnumtarjeta= codigobin + varTarjeta + (texto.substring(37, 42));
//                
//              nomonetaria.setVarNumTarjeta(varnumtarjeta);
              
                if((texto.substring(23, 42)).length() > 16){
                  String corte= substring(23,27);
                corte=corte+"XXXX";
                String codigobin = texto.substring(27, 32);
                String varTarjeta = substring(32, 35); 
                varTarjeta = varTarjeta + "XXX";
                varTarjeta = corte + codigobin + varTarjeta  + texto.substring(35, 42); 
                nomonetaria.setVarNumTarjeta(varTarjeta);
                  
              }else{
                  
                String ntarjeta = (texto.substring(23, 42));
                String corte= ntarjeta.substring(0,3);
                corte=corte+"XXX";
                String codigobin = texto.substring(3, 8);
                String varTarjeta = substring(8, 11); 
                varTarjeta = varTarjeta + "XXX";
                varTarjeta = corte + codigobin + varTarjeta  + texto.substring(11, 16); 
                nomonetaria.setVarNumTarjeta(varTarjeta);
              
              } 
              
              
                
                
                nomonetaria.setVarNombreTarjetahabiente(texto.substring(42, 64));
                nomonetaria.setVarSubTipo(texto.substring(64, 67));
                nomonetaria.setVarTipoCuenta(texto.substring(67, 70));
                nomonetaria.setVarNumeroCuenta(texto.substring(70, 89));
                nomonetaria.setVarOficina(texto.substring(89, 94));
                nomonetaria.setVarTipoDocumTatjetaHabiente(texto.substring(94, 96));
                nomonetaria.setVarNumDocumento(texto.substring(96, 111));
                nomonetaria.setVarNitEmpresa(texto.substring(111, 126));
                nomonetaria.setVarNombreEmpresa(texto.substring(126, 156));

                if (texto.length() > 156) {
                    int ext = texto.length() - 156;
                    int extn = 156 + ext;

                    nomonetaria.setVarNumTarjetaAnterior(texto.substring(156, extn));
                } else {
                    nomonetaria.setVarNumTarjetaAnterior(" ");
                }

                // nomonetaria.setVarNumTarjetaAnterior(texto.substring(156, 175));
                System.out.println(texto);

                resultado = registrarNoMonetaria(nomonetaria);

            }
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println("Error al leer");
        }
        return resultado;
    }

}
