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

    public static void main(String[] args) {
        LeerArchivoNoMonetariasTxt();
    }

    public static int registrarNoMonetaria(NoMonetarias nomonetarias) throws Exception {

        NomonetariasController.NomonetariasController();

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
                    + "           ('" + nomonetarias.getVarNitEmpresa()
                    + "'           ,'" + nomonetarias.getDateFechaEnvio()
                    + "'           ,'" + nomonetarias.getVarConsecutiEnvio()
                    + "'           ,'" + nomonetarias.getVarTipoIndentiCliente()
                    + "'           ,'" + nomonetarias.getVarNumIdentifCliente()
                    + "'           ,'" + nomonetarias.getVarCodEmpleado()
                    + "'           ,'" + nomonetarias.getVarDptoEmpresa()
                    + "'           ,'" + nomonetarias.getVarPrimerApellido()
                    + "'          ,'" + nomonetarias.getVarSegundoApellido()
                    + "'           ,'" + nomonetarias.getVarPrimerNombre()
                    + "'           ,'" + nomonetarias.getVarSegundoNombre()
                    + " '          ,'" + nomonetarias.getVarPrimerNombre()
                    + " '          ,'" + nomonetarias.getVarNombreCorto()
                    + "'           ,'" + nomonetarias.getVarDirResidencia()
                    + " '          ,'" + nomonetarias.getVarZonaPostalResidencia()
                    + " '          ,'" + nomonetarias.getVarCuidadResidencia()
                    + "'           ,'" + nomonetarias.getVarDirOficina()
                    + "'           ,'" + nomonetarias.getVarZonaPostalOficina()
                    + "'           ,'" + nomonetarias.getVarCuidadOficina()
                    + "'           ,'" + nomonetarias.getVarDirCorrespondencia()
                    + "'           ,'" + nomonetarias.getVarZonaPostalCorresponde()
                    + "'           ,'" + nomonetarias.getVarCuidadCorresponde()
                    + "'           ,'" + nomonetarias.getVarTelResidencia()
                    + "'           ,'" + nomonetarias.getVarTelOficina()
                    + "'           ,'" + nomonetarias.getVarTelCorrespondencia()
                    + "'           ,'" + nomonetarias.getVarOficina()
                    + "'           ,'" + nomonetarias.getVarNumTarjeta()
                    + "'           ,'" + nomonetarias.getNumeroCuenta()
                    + "'           ,'" + nomonetarias.getVarTipoCuenta()
                    + "'           ,'" + nomonetarias.getDateFechNacimi()
                    + "'           ,'" + nomonetarias.getVarNacionalidad()
                    + "'           ,'" + nomonetarias.getVarEstadoCivil()
                    + "'           ,'" + nomonetarias.getVarSexo()
                    + "'           ,'" + nomonetarias.getVarNivelEstudio()
                    + "'           ,'" + nomonetarias.getVarProfesion()
                    + "'           ,'" + nomonetarias.getDateFechaVinculacion()
                    + "'           ,'" + nomonetarias.getVarTipoNovedad()
                    + "'           ,'" + nomonetarias.getVarEspaciosBlancos()
                    + "'           ,'" + nomonetarias.getVarReservado()
                    + "'           ,'" + nomonetarias.getVarCodError() + "');";

            st.execute(sql);

            no++;

        } catch (Exception e) {

            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }

        return no;

    }

    public static void LeerArchivoNoMonetariasTxt() {
        //Creamos un String que va a contener todo el texto del archivo
        String texto = "";

        NoMonetarias nomonetaria = new NoMonetarias();

        double decValTransaccion = 0, decValDispensado = 0, decValCarCobr = 0, decValIva = 0, decTotalCobrar = 0, decImpEmerEcono = 0;

        try {
//Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader("C:\\Users\\ce\\Desktop\\ProyectosCesar\\redeban\\Estructura archivo Movimientos\\TNN0140211 no monetarias.txt");

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
                nomonetaria.setVarNitEmpresa(texto.substring(0, 15));
                if (texto.substring(15,23).equals("00000000")) {
                    nomonetaria.setVarFechaEnvio("00010101");
                } else {
                    nomonetaria.setVarFechaEnvio(texto.substring(15, 23));
                }
                nomonetaria.setVarConsecutiEnvio(texto.substring(23, 28));
                nomonetaria.setVarTipoIndentiCliente(texto.substring(28, 30));
                nomonetaria.setVarNumIdentifCliente(texto.substring(30, 45));
                nomonetaria.setVarCodEmpleado(texto.substring(45, 55));
                nomonetaria.setVarDptoEmpresa(texto.substring(55, 60));
                nomonetaria.setVarPrimerApellido(texto.substring(60, 75));
                nomonetaria.setVarSegundoApellido(texto.substring(75, 90));
                nomonetaria.setVarPrimerNombre(texto.substring(90, 105));
                nomonetaria.setVarSegundoNombre(texto.substring(105, 120));
                nomonetaria.setVarNombreCorto(texto.substring(120, 142));
                nomonetaria.setVarDirResidencia(texto.substring(142, 182));
                nomonetaria.setVarZonaPostalResidencia(texto.substring(182, 187));
                nomonetaria.setVarCuidadResidencia(texto.substring(187, 195));
                nomonetaria.setVarDirOficina(texto.substring(195, 235));
                nomonetaria.setVarZonaPostalOficina(texto.substring(235, 240));
                nomonetaria.setVarCuidadOficina(texto.substring(240, 248));
                nomonetaria.setVarDirCorrespondencia(texto.substring(248, 288));
                nomonetaria.setVarZonaPostalCorresponde(texto.substring(288, 293));
                nomonetaria.setVarCuidadCorresponde(texto.substring(293, 301 ));
                nomonetaria.setVarTelResidencia(texto.substring(301, 311));
                nomonetaria.setVarTelOficina(texto.substring(311, 321));
                nomonetaria.setVarTelCorrespondencia(texto.substring(321, 331));
                nomonetaria.setVarOficina(texto.substring(331, 336));
                nomonetaria.setVarNumTarjeta(texto.substring(336,355 ));
                nomonetaria.setNumeroCuenta(texto.substring(355,374 ));
                nomonetaria.setVarTipoCuenta(texto.substring(374, 377));
                nomonetaria.setVarFechNacimi(texto.substring(377, 385));
                nomonetaria.setVarNacionalidad(texto.substring(385, 400));
                nomonetaria.setVarEstadoCivil(texto.substring(400, 401));
                nomonetaria.setVarSexo(texto.substring(401, 402));
                nomonetaria.setVarNivelEstudio(texto.substring(402, 403));
                nomonetaria.setVarProfesion(texto.substring(403, 428));
                nomonetaria.setVarFechaVinculacion(texto.substring(428,436 ));
                nomonetaria.setVarTipoNovedad(texto.substring(436, 439));
                nomonetaria.setVarEspaciosBlancos(texto.substring(439, 515));
                nomonetaria.setVarReservado(texto.substring(515, 525));
                nomonetaria.setVarCodError(texto.substring(525, 528));
                 
                System.out.println(texto);

                int resultado = registrarNoMonetaria(nomonetaria);

            }
        } //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println("Error al leer");
        }
    }

}
