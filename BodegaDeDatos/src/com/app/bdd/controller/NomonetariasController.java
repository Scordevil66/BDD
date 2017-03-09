/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;

import com.app.bdd.conexion.ConexionSQL;
import com.app.bdd.models.NoMonetarias;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        
        String sql="";

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
                nomonetaria.setVarCodBin(texto.substring(14, 23));
                nomonetaria.setVarNumTarjeta(texto.substring(23, 42));
                nomonetaria.setVarNombreTarjetahabiente(texto.substring(42, 64));
                nomonetaria.setVarSubTipo(texto.substring(64, 67));
                nomonetaria.setVarTipoCuenta(texto.substring(67, 70));
                nomonetaria.setVarNumeroCuenta(texto.substring(70, 89));
                nomonetaria.setVarOficina(texto.substring(89, 94));
                nomonetaria.setVarTipoDocumTatjetaHabiente(texto.substring(94, 96));
                nomonetaria.setVarNumDocumento(texto.substring(96, 111));
                nomonetaria.setVarNitEmpresa(texto.substring(111, 126));
                nomonetaria.setVarNombreEmpresa(texto.substring(126, 156));
                
                if(texto.length()>156){
                    int ext = texto.length()-156;
                    int extn = 156 + ext;
                    
                    nomonetaria.setVarNumTarjetaAnterior(texto.substring(156, extn));
                }else{
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
