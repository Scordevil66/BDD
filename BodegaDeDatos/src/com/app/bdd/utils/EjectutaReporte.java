/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.utils;


import com.app.bdd.form.FiltrosMonetarios;
import static java.lang.Class.forName;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
//import net.sf.jasperreports.engine.exportJRPdfExporter;
//import net.sf.jasperreports.engine.exportJRHtmlExporter;
//import net.sf.jasperreports.engine.exportJRCsvExporter;
//import net.sf.jasperreports.engine.exportJRRtfExporter;
//import net.sf.jasperreports.engine.exportJRXlsExporter;
//import net.sf.jasperreports.engine.exportJRXmlExporter;
//import net.sf.jasperreports.engine.exportJRTextExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRPptxExporter;
//import javax.swing.JFrame.AccessibleJFrame;



/**
 *
 * @author ce
 */
public class EjectutaReporte {
    
  private String entidad;
  private String numtarjeta;
  private String fechini;
  private String fechfin;

    public EjectutaReporte(String entidad, String numtarjeta, String fechini, String fechfin) {
        this.entidad = entidad;
        this.numtarjeta = numtarjeta;
        this.fechini = fechini;
        this.fechfin = fechfin;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getNumtarjeta() {
        return numtarjeta;
    }

    public void setNumtarjeta(String numtarjeta) {
        this.numtarjeta = numtarjeta;
    }

    public String getFechini() {
        return fechini;
    }

    public void setFechini(String fechini) {
        this.fechini = fechini;
    }

    public String getFechfin() {
        return fechfin;
    }

    public void setFechfin(String fechfin) {
        this.fechfin = fechfin;
    }

    @Override
    public String toString() {
        return "EjectutaReporte{" + "entidad=" + entidad + ", numtarjeta=" + numtarjeta + ", fechini=" + fechini + ", fechfin=" + fechfin + '}';
    }


    
  
        
    
    
}
