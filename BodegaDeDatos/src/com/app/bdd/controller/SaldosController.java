/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.controller;


import com.app.bdd.conexion.ConexionSQL;
import static com.app.bdd.controller.NomonetariasController.LeerArchivoNoMonetariasTxt;
import static com.app.bdd.controller.NomonetariasController.registrarNoMonetaria;
import com.app.bdd.models.NoMonetarias;
import com.app.bdd.models.TslSaldos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author Gustavo
 */
public class SaldosController {

    static Statement st;

    public static void SaldosController() throws SQLException {
        SaldosController.st = ConexionSQL.conexion();
    }
    
//     public static void main(String[] args) {
//        LeerArchivoSaldosTxt();
//    }

    public static int registrarSaldo(TslSaldos saldo) throws Exception {
        
        SaldosController.SaldosController();

        int sa = 0;

        try {
            
            String sql = "INSERT INTO  [saldos] "
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
    
      public static int LeerArchivoSaldosTxt(String ruta) {
        //Creamos un String que va a contener todo el texto del archivo
        String texto = "";

         int resultado = 0;
        TslSaldos saldo = new TslSaldos();

     //   double decValTransaccion = 0, decValDispensado = 0, decValCarCobr = 0, decValIva = 0, decTotalCobrar = 0, decImpEmerEcono = 0;

        try {
//Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader(ruta);

//El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);

//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while ((texto = contenido.readLine()) != null) {

                saldo = new TslSaldos();
                
                 double DecSaldoDispo = 0 ;
                   
                   
//              saldo.setVarBin(texto.substring(0, 9));
                String primer= substring(0,4);
                primer =primer+"XXXX";
                String restobin = texto.substring(4, 9);
                saldo.setVarBin(primer+restobin);
                

              saldo.setVarNitEMpresa(texto.substring(9, 24));
              
              if((texto.substring(24, 43)).length() > 16){
                String corte = substring(24,28);
                corte=corte+"XXXX";
                String codigobin = texto.substring(28, 33);
                String varTarjeta = substring(33, 36); 
                varTarjeta = varTarjeta + "XXX";
                varTarjeta = corte + codigobin + varTarjeta  + texto.substring(36, 43); 
                saldo.setVarTarjeta(varTarjeta);
                  
              }else{
                  
                String ntarjeta = (texto.substring(24, 43));
                String corte= ntarjeta.substring(0,3);
                corte=corte+"XXX";
                String codigobin = texto.substring(3, 8);
                String varTarjeta = substring(8, 11); 
                varTarjeta = varTarjeta + "XXX";
                varTarjeta = corte + codigobin + varTarjeta  + texto.substring(11, 16); 
                saldo.setVarTarjeta(varTarjeta);
              
              } 
              
              
//              String codigobin = (texto.substring(24, 33));
//              String varnumtarjeta =(substring(24, 38));
//              
//                varnumtarjeta= varnumtarjeta + "XXXX";
//               varnumtarjeta= codigobin + varnumtarjeta + (texto.substring(38, 43));
//                saldo.setVarTarjeta(varnumtarjeta);
              
             // saldo.setVarTarjeta(texto.substring(24, 43));
              
              saldo.setVarMiembro(texto.substring(43, 46));
              saldo.setVarNombTajHabiente(texto.substring(46, 73));
              
              
                String enteroSaldoDispo = texto.substring(73, 88);
                String decimalSaldoDispo = texto.substring(88, 90);
                String cadenaSaldoDispo = enteroSaldoDispo + "." + decimalSaldoDispo;
                DecSaldoDispo = Double.parseDouble(cadenaSaldoDispo);
               saldo.setDecSaldoDispo(DecSaldoDispo);
               saldo.setVarEstadoTarjeta(texto.substring(90, 93));
               saldo.setVarDescripEsta(texto.substring(93, 123));
               saldo.setVarSubtipo(texto.substring(123, 126));
              
              
                System.out.println(texto);

                resultado = registrarSaldo(saldo);

            }
        } //Si se causa un error al leer cae aqui //Si se causa un error al leer cae aqui //Si se causa un error al leer cae aqui //Si se causa un error al leer cae aqui
        catch (Exception e) {
            System.out.println("Error al leer");
        }
        return resultado;
    }

}
