package com.app.bdd.utils;

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
import com.app.bdd.conexion.ConexionSQL;
import com.app.bdd.controller.MovimientoController;
import com.app.bdd.form.Cargando;
import com.app.bdd.models.Movimientos;
import com.app.bdd.form.FiltrosMonetarios;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 */
public class Exportar {

    static Statement st;
    static Cargando c = new Cargando();
    static String rutas = "";
    static int retorno = 0;
    static int error = 0;
    static int fin = 0;

    public static void conectar(Statement MovimientoControllert) throws SQLException {
        // MovimientoController.st = ConexionSQL.conexion();
        try {
            MovimientoControllert = ConexionSQL.conexion();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    private static class capturadatos {

        List<Movimientos> movimientos = new ArrayList<>();
        Movimientos movimiento = new Movimientos();

        public void setMovimientos(List<Movimientos> movimientos) {
            this.movimientos = movimientos;

            movimiento.getCodBanco();
            movimiento.getCodBin();
            movimiento.getDateFechAutoriza();
            movimiento.getDateFechaTransac();
            movimiento.getDateFechaTransac();
            movimiento.getDecImpEmerEcono();
            movimiento.getDecSaldoDispo();
            movimiento.getDecTotalCobrar();
            movimiento.getDecValCarCobr();
            movimiento.getDecValDispensado();
            movimiento.getDecValIva();
            movimiento.getDecValTransaccion();
            movimiento.getIdBonbanco();
            movimiento.getIntidMovimientos();
            movimiento.getIdBonbanco();
            movimiento.getNombreBanco();
            movimiento.getVarBin();
            movimiento.getVarCodAutoriza();
            movimiento.getVarCodEstablecimiento();
            movimiento.getVarCodigoComercio();
            movimiento.getVarDateFechaTransac();
            movimiento.getVarDesEstCoCargos();
            movimiento.getVarDescTransac();
            movimiento.getVarDescriSubtipo();
            movimiento.getVarDescripEsta();
            movimiento.getVarDescripcionTipoDocumento();
            movimiento.getVarDescripcionTipoNovedad();
            movimiento.getVarDescrpResp();
            movimiento.getVarDispOrigen();
            movimiento.getVarEstadoTarjeta();
            movimiento.getVarFechAutoriza();
            movimiento.getVarFiller();
            movimiento.getVarFiller2();
            movimiento.getVarHoraAutoriza();
            movimiento.getVarHortaDisposi();
            movimiento.getVarIndicadorRever();
            movimiento.getVarNitEmpresa();
            movimiento.getVarNombTajHabiente();
            movimiento.getVarNombreComercio();
            movimiento.getVarNombreTarjetahabiente();
            movimiento.getVarNumCuenta();
            movimiento.getVarNumCuotas();
            movimiento.getVarNumDispos();
            movimiento.getVarNumDocumento();
            movimiento.getVarNumReferencia();
            movimiento.getVarNumTarjSecundari();
            movimiento.getVarNumTarjetaAnterior();
            movimiento.getVarOficina();
            movimiento.getVarRedAdquiriente();
            movimiento.getVarRespuAutoriz();
            movimiento.getVarSubtipo();
            movimiento.getVarTarjeta();
            movimiento.getVarTipoDocumTatjetaHabiente();
            movimiento.getVarTipoNovedad();
            movimiento.getVarValorBaseDevIva();
            movimiento.getVarValorIva();
            movimiento.getVarValorPropina();
            movimiento.getVardateFechaNovedad();

            String encabezados = movimientos.toString();

        }
    
        public static void main(String[] args) throws Exception {
            List<Movimientos> movimientos = new ArrayList<>();
            Movimientos movimiento = new Movimientos();

            MovimientoController.MovimientoController();
            String celdas = "";

            String rutaArchivo = System.getProperty("user.home") + "/ReporteTransaccional.xls";
            File archivoXLS = new File(rutaArchivo);
            if (archivoXLS.exists()) {
                archivoXLS.delete();
            }
            archivoXLS.createNewFile();

            Workbook libro = new HSSFWorkbook();
            try (
                    FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                Sheet hoja = libro.createSheet("Reporte");
                for (int f = 0; f < 27; f++) {
                    Row fila = hoja.createRow(f);

                    for (int c = 0; c < 25; c++) {
                        Cell celda = fila.createCell(c);

                        if (f == 0) {
                            String titulo1 = "Campo" + c;
                            celda.setCellValue(titulo1);
                        } else {
                            // String k = movimiento.getVarEstadoTarjeta();
                            celda.setCellValue(movimiento.getCodBanco()
                                    + movimiento.getDateFechaTransac()
                                    + movimiento.getDecValCarCobr()
                                    + movimiento.getIdBonbanco()
                                    + movimiento.getVarCodAutoriza()
                                    + movimiento.getVarDesEstCoCargos()
                                    + movimiento.getVarDescripcionTipoDocumento()
                                    + movimiento.getVarEstadoTarjeta()
                                    + movimiento.getVarHortaDisposi()
                                    + movimiento.getVarNombreComercio()
                                    + movimiento.getVarNumDispos()
                                    + movimiento.getVarNumTarjetaAnterior()
                                    + movimiento.getVarSubtipo()
                                    + movimiento.getVarValorBaseDevIva()
                                    + movimiento.getCodBin()
                                    + movimiento.getDecImpEmerEcono()
                                    + movimiento.getDecValDispensado()
                                    + movimiento.getIntidMovimientos()
                                    + movimiento.getVarCodEstablecimiento()
                                    + movimiento.getVarDescTransac()
                                    + movimiento.getVarDescripcionTipoNovedad()
                                    + movimiento.getVarFechAutoriza()
                                    + movimiento.getVarIndicadorRever()
                                    + movimiento.getVarNombreTarjetahabiente()
                                    + movimiento.getVarNumDocumento()
                                    + movimiento.getVarOficina()
                                    + movimiento.getVarTarjeta()
                                    + movimiento.getVarValorIva()
                                    + movimiento.getDateFechAutoriza()
                                    + movimiento.getDecSaldoDispo()
                                    + movimiento.getDecValIva()
                                    + movimiento.getIdBonbanco()
                                    + movimiento.getVarCodigoComercio()
                                    + movimiento.getVarDescriSubtipo()
                                    + movimiento.getVarDescrpResp()
                                    + movimiento.getVarFiller()
                                    + movimiento.getVarNitEmpresa()
                                    + movimiento.getVarNumCuenta()
                                    + movimiento.getVarNumReferencia()
                                    + movimiento.getVarRedAdquiriente()
                                    + movimiento.getVarTipoDocumTatjetaHabiente()
                                    + movimiento.getVarValorPropina()
                                    + movimiento.getDateFechaTransac()
                                    + movimiento.getDecTotalCobrar()
                                    + movimiento.getDecValTransaccion()
                                    + movimiento.getNombreBanco()
                                    + movimiento.getVarDateFechaTransac()
                                    + movimiento.getVarDescripEsta()
                                    + movimiento.getVarDispOrigen()
                                    + movimiento.getVarFiller2()
                                    + movimiento.getVarNombTajHabiente()
                                    + movimiento.getVarNumCuotas()
                                    + movimiento.getVarNumTarjSecundari()
                                    + movimiento.getVarRespuAutoriz()
                                    + movimiento.getVarTipoNovedad()
                                    + movimiento.getVardateFechaNovedad()
                                    + movimiento.getVarBin()
                                    + movimiento.getVarHoraAutoriza()
                            );
                        }
                    }

                }
                libro.write(archivo);
               
            }
            Desktop.getDesktop().open(archivoXLS);
           }

    }
}
