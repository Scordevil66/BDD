/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;

import com.app.bdd.conexion.ConexionSQL;
import com.app.bdd.form.CargaMasivaMovimiento;
import com.app.bdd.models.Movimientos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class MovimientoController {

    static Statement st;

    public static void MovimientoController() throws SQLException {
        MovimientoController.st = ConexionSQL.conexion();
    }

//    public static void main(String[] args) {
//        LeerArchivoMovimientoTxt();
//    }
    public static int registrarMovimiento(Movimientos movimiento) throws Exception {

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

            sql = "INSERT INTO  [BodegaDatos].[dbo].[movimientos] "
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

    public static int LeerArchivoMovimientoTxt(String ruta) throws Exception {
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
            
            cargaMasivaMovimientos.Conteo(conteo + "", totalLineas + "");
            
            while ((texto = contenido2.readLine()) != null) {

                movimiento = new Movimientos();
                decValTransaccion = 0;
                decValDispensado = 0;
                decValCarCobr = 0;
                decValIva = 0;
                decTotalCobrar = 0;
                decImpEmerEcono = 0;

                movimiento.setVarBin(texto.substring(0, 9));
                movimiento.setVarTarjeta(texto.substring(9, 28));
                movimiento.setVarNitEmpresa(texto.substring(28, 43));
                movimiento.setVarNumCuenta(texto.substring(43, 62));
                movimiento.setVarDispOrigen(texto.substring(62, 64));
                movimiento.setVarDesEstCoCargos(texto.substring(64, 94));
                movimiento.setVarDescTransac(texto.substring(94, 124));

                String enteroValTransaccion = texto.substring(124, 139);
                String decimalValTransaccion = texto.substring(139, 141);
                String cadenaValTransaccion = enteroValTransaccion + "." + decimalValTransaccion;
                decValTransaccion = Double.parseDouble(cadenaValTransaccion);

//                decValTransaccion = Double.parseDouble(texto.substring(124, 141));
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

                cargaMasivaMovimientos.Conteo(conteo + "", totalLineas + "");

                resultado = registrarMovimiento(movimiento);

            }
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println("Error al leer");
        }
        return resultado;
    }
}
