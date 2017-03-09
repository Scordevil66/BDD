/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.models;

import java.util.Date;

/**
 *
 * @author ce
 */
public class Movimientos {

    private int intidMovimientos;

    private String varBin;

    private String varTarjeta;

    private String varNitEmpresa;

    private String varNumCuenta;

    private String varDispOrigen;

    private String varDesEstCoCargos;

    private String varDescTransac;

    private double decValTransaccion;

    private double decValDispensado;

    private Date dateFechaTransac;

    private String varDateFechaTransac;

    private double decValCarCobr;

    private double decValIva;

    private double decTotalCobrar;

    private double decImpEmerEcono;

    private String varIndicadorRever;

    private String varRespuAutoriz;

    private String varDescrpResp;

    private String varCodAutoriza;

    private String varFiller;

    private Date dateFechAutoriza;

    private String varFechAutoriza;

    private String varHoraAutoriza;

    private String varHortaDisposi;

    private String varNumReferencia;

    private String varRedAdquiriente;

    private String varNumDispos;

    private String varCodEstablecimiento;

    private String varSubtipo;

    private String varDescriSubtipo;

    private String varNumTarjSecundari;

    private String varValorPropina;

    private String varValorIva;

    private String varValorBaseDevIva;

    private String varNumCuotas;

    private String varFiller2;

    // Campos externos
    //Campos traidos de la tabla saldos
    private String decSaldoDispo;
    private String varEstadoTarjeta;
    private String varDescripEsta;

    // campos raidos de la tabla No Monetarias
    private String varNombreTarjetahabiente;
    private String varTipoDocumTatjetaHabiente;
    private String varNumDocumento;
    
    // campos traidos de la tabla tipodocumento
    
    private String varDescripcionTipoDocumento;

    ///Constructers
    public Movimientos() {
    }

    public Movimientos(int intidMovimientos) {
        this.intidMovimientos = intidMovimientos;
    }

      //consulta consultaSaldoPorTarjeta   private String varDateFechaTransac

    public Movimientos( String varDateFechaTransac, String varTarjeta, String varNitEmpresa,  String varSubtipo, String varDescriSubtipo, String decSaldoDispo, String varEstadoTarjeta, String varDescripEsta, String varNombreTarjetahabiente, String varTipoDocumTatjetaHabiente, String varNumDocumento, String varDescripcionTipoDocumento) {
        this.varDateFechaTransac = varDateFechaTransac;
        this.varTarjeta = varTarjeta;
        this.varNombreTarjetahabiente = varNombreTarjetahabiente;
        this.varTipoDocumTatjetaHabiente = varTipoDocumTatjetaHabiente;
        this.varDescripcionTipoDocumento = varDescripcionTipoDocumento;
        this.varNumDocumento = varNumDocumento;
        this.varNitEmpresa = varNitEmpresa;
        this.varSubtipo = varSubtipo;
        this.varDescriSubtipo = varDescriSubtipo;
        this.decSaldoDispo = decSaldoDispo;
        this.varEstadoTarjeta = varEstadoTarjeta;
        this.varDescripEsta = varDescripEsta;
    }

  
    
    
    


    public Movimientos(int intidMovimientos, String varBin, String varTarjeta, String varNitEmpresa, String varNumCuenta, String varDispOrigen, String varDesEstCoCargos, String varDescTransac, double decValTransaccion, double decValDispensado, Date dateFechaTransac, String varDateFechaTransac, double decValCarCobr, double decValIva, double decTotalCobrar, double decImpEmerEcono, String varIndicadorRever, String varRespuAutoriz, String varDescrpResp, String varCodAutoriza, String varFiller, Date dateFechAutoriza, String varFechAutoriza, String varHoraAutoriza, String varHortaDisposi, String varNumReferencia, String varRedAdquiriente, String varNumDispos, String varCodEstablecimiento, String varSubtipo, String varDescriSubtipo, String varNumTarjSecundari, String varValorPropina, String varValorIva, String varValorBaseDevIva, String varNumCuotas, String varFiller2, String decSaldoDispo, String varEstadoTarjeta, String varDescripEsta, String varNombreTarjetahabiente, String varTipoDocumTatjetaHabiente, String varNumDocumento, String varDescripcionTipoDocumento) {
        this.intidMovimientos = intidMovimientos;
        this.varBin = varBin;
        this.varTarjeta = varTarjeta;
        this.varNitEmpresa = varNitEmpresa;
        this.varNumCuenta = varNumCuenta;
        this.varDispOrigen = varDispOrigen;
        this.varDesEstCoCargos = varDesEstCoCargos;
        this.varDescTransac = varDescTransac;
        this.decValTransaccion = decValTransaccion;
        this.decValDispensado = decValDispensado;
        this.dateFechaTransac = dateFechaTransac;
        this.varDateFechaTransac = varDateFechaTransac;
        this.decValCarCobr = decValCarCobr;
        this.decValIva = decValIva;
        this.decTotalCobrar = decTotalCobrar;
        this.decImpEmerEcono = decImpEmerEcono;
        this.varIndicadorRever = varIndicadorRever;
        this.varRespuAutoriz = varRespuAutoriz;
        this.varDescrpResp = varDescrpResp;
        this.varCodAutoriza = varCodAutoriza;
        this.varFiller = varFiller;
        this.dateFechAutoriza = dateFechAutoriza;
        this.varFechAutoriza = varFechAutoriza;
        this.varHoraAutoriza = varHoraAutoriza;
        this.varHortaDisposi = varHortaDisposi;
        this.varNumReferencia = varNumReferencia;
        this.varRedAdquiriente = varRedAdquiriente;
        this.varNumDispos = varNumDispos;
        this.varCodEstablecimiento = varCodEstablecimiento;
        this.varSubtipo = varSubtipo;
        this.varDescriSubtipo = varDescriSubtipo;
        this.varNumTarjSecundari = varNumTarjSecundari;
        this.varValorPropina = varValorPropina;
        this.varValorIva = varValorIva;
        this.varValorBaseDevIva = varValorBaseDevIva;
        this.varNumCuotas = varNumCuotas;
        this.varFiller2 = varFiller2;
        this.decSaldoDispo = decSaldoDispo;
        this.varEstadoTarjeta = varEstadoTarjeta;
        this.varDescripEsta = varDescripEsta;
        this.varNombreTarjetahabiente = varNombreTarjetahabiente;
        this.varTipoDocumTatjetaHabiente = varTipoDocumTatjetaHabiente;
        this.varNumDocumento = varNumDocumento;
        this.varDescripcionTipoDocumento = varDescripcionTipoDocumento;
    }
    // Getter and Setter

    public int getIntidMovimientos() {
        return intidMovimientos;
    }

    public void setIntidMovimientos(int intidMovimientos) {
        this.intidMovimientos = intidMovimientos;
    }

    public String getVarBin() {
        return varBin;
    }

    public void setVarBin(String varBin) {
        this.varBin = varBin;
    }

    public String getVarTarjeta() {
        return varTarjeta;
    }

    public void setVarTarjeta(String varTarjeta) {
        this.varTarjeta = varTarjeta;
    }

    public String getVarNitEmpresa() {
        return varNitEmpresa;
    }

    public void setVarNitEmpresa(String varNitEmpresa) {
        this.varNitEmpresa = varNitEmpresa;
    }

    public String getVarNumCuenta() {
        return varNumCuenta;
    }

    public void setVarNumCuenta(String varNumCuenta) {
        this.varNumCuenta = varNumCuenta;
    }

    public String getVarDispOrigen() {
        return varDispOrigen;
    }

    public void setVarDispOrigen(String varDispOrigen) {
        this.varDispOrigen = varDispOrigen;
    }

    public String getVarDesEstCoCargos() {
        return varDesEstCoCargos;
    }

    public void setVarDesEstCoCargos(String varDesEstCoCargos) {
        this.varDesEstCoCargos = varDesEstCoCargos;
    }

    public String getVarDescTransac() {
        return varDescTransac;
    }

    public void setVarDescTransac(String varDescTransac) {
        this.varDescTransac = varDescTransac;
    }

    public double getDecValTransaccion() {
        return decValTransaccion;
    }

    public void setDecValTransaccion(double decValTransaccion) {
        this.decValTransaccion = decValTransaccion;
    }

    public double getDecValDispensado() {
        return decValDispensado;
    }

    public void setDecValDispensado(double decValDispensado) {
        this.decValDispensado = decValDispensado;
    }

    public Date getDateFechaTransac() {
        return dateFechaTransac;
    }

    public void setDateFechaTransac(Date dateFechaTransac) {
        this.dateFechaTransac = dateFechaTransac;
    }

    public String getVarDateFechaTransac() {
        return varDateFechaTransac;
    }

    public void setVarDateFechaTransac(String varDateFechaTransac) {
        this.varDateFechaTransac = varDateFechaTransac;
    }

    public double getDecValCarCobr() {
        return decValCarCobr;
    }

    public void setDecValCarCobr(double decValCarCobr) {
        this.decValCarCobr = decValCarCobr;
    }

    public double getDecValIva() {
        return decValIva;
    }

    public void setDecValIva(double decValIva) {
        this.decValIva = decValIva;
    }

    public double getDecTotalCobrar() {
        return decTotalCobrar;
    }

    public void setDecTotalCobrar(double decTotalCobrar) {
        this.decTotalCobrar = decTotalCobrar;
    }

    public double getDecImpEmerEcono() {
        return decImpEmerEcono;
    }

    public void setDecImpEmerEcono(double decImpEmerEcono) {
        this.decImpEmerEcono = decImpEmerEcono;
    }

    public String getVarIndicadorRever() {
        return varIndicadorRever;
    }

    public void setVarIndicadorRever(String varIndicadorRever) {
        this.varIndicadorRever = varIndicadorRever;
    }

    public String getVarRespuAutoriz() {
        return varRespuAutoriz;
    }

    public void setVarRespuAutoriz(String varRespuAutoriz) {
        this.varRespuAutoriz = varRespuAutoriz;
    }

    public String getVarDescrpResp() {
        return varDescrpResp;
    }

    public void setVarDescrpResp(String varDescrpResp) {
        this.varDescrpResp = varDescrpResp;
    }

    public String getVarCodAutoriza() {
        return varCodAutoriza;
    }

    public void setVarCodAutoriza(String varCodAutoriza) {
        this.varCodAutoriza = varCodAutoriza;
    }

    public String getVarFiller() {
        return varFiller;
    }

    public void setVarFiller(String varFiller) {
        this.varFiller = varFiller;
    }

    public Date getDateFechAutoriza() {
        return dateFechAutoriza;
    }

    public void setDateFechAutoriza(Date dateFechAutoriza) {
        this.dateFechAutoriza = dateFechAutoriza;
    }

    public String getVarFechAutoriza() {
        return varFechAutoriza;
    }

    public void setVarFechAutoriza(String varFechAutoriza) {
        this.varFechAutoriza = varFechAutoriza;
    }

    public String getVarHoraAutoriza() {
        return varHoraAutoriza;
    }

    public void setVarHoraAutoriza(String varHoraAutoriza) {
        this.varHoraAutoriza = varHoraAutoriza;
    }

    public String getVarHortaDisposi() {
        return varHortaDisposi;
    }

    public void setVarHortaDisposi(String varHortaDisposi) {
        this.varHortaDisposi = varHortaDisposi;
    }

    public String getVarNumReferencia() {
        return varNumReferencia;
    }

    public void setVarNumReferencia(String varNumReferencia) {
        this.varNumReferencia = varNumReferencia;
    }

    public String getVarRedAdquiriente() {
        return varRedAdquiriente;
    }

    public void setVarRedAdquiriente(String varRedAdquiriente) {
        this.varRedAdquiriente = varRedAdquiriente;
    }

    public String getVarNumDispos() {
        return varNumDispos;
    }

    public void setVarNumDispos(String varNumDispos) {
        this.varNumDispos = varNumDispos;
    }

    public String getVarCodEstablecimiento() {
        return varCodEstablecimiento;
    }

    public void setVarCodEstablecimiento(String varCodEstablecimiento) {
        this.varCodEstablecimiento = varCodEstablecimiento;
    }

    public String getVarSubtipo() {
        return varSubtipo;
    }

    public void setVarSubtipo(String varSubtipo) {
        this.varSubtipo = varSubtipo;
    }

    public String getVarDescriSubtipo() {
        return varDescriSubtipo;
    }

    public void setVarDescriSubtipo(String varDescriSubtipo) {
        this.varDescriSubtipo = varDescriSubtipo;
    }

    public String getVarNumTarjSecundari() {
        return varNumTarjSecundari;
    }

    public void setVarNumTarjSecundari(String varNumTarjSecundari) {
        this.varNumTarjSecundari = varNumTarjSecundari;
    }

    public String getVarValorPropina() {
        return varValorPropina;
    }

    public void setVarValorPropina(String varValorPropina) {
        this.varValorPropina = varValorPropina;
    }

    public String getVarValorIva() {
        return varValorIva;
    }

    public void setVarValorIva(String varValorIva) {
        this.varValorIva = varValorIva;
    }

    public String getVarValorBaseDevIva() {
        return varValorBaseDevIva;
    }

    public void setVarValorBaseDevIva(String varValorBaseDevIva) {
        this.varValorBaseDevIva = varValorBaseDevIva;
    }

    public String getVarNumCuotas() {
        return varNumCuotas;
    }

    public void setVarNumCuotas(String varNumCuotas) {
        this.varNumCuotas = varNumCuotas;
    }

    public String getVarFiller2() {
        return varFiller2;
    }

    public void setVarFiller2(String varFiller2) {
        this.varFiller2 = varFiller2;
    }

    public String getDecSaldoDispo() {
        return decSaldoDispo;
    }

    public void setDecSaldoDispo(String decSaldoDispo) {
        this.decSaldoDispo = decSaldoDispo;
    }

    public String getVarEstadoTarjeta() {
        return varEstadoTarjeta;
    }

    public void setVarEstadoTarjeta(String varEstadoTarjeta) {
        this.varEstadoTarjeta = varEstadoTarjeta;
    }

    public String getVarDescripEsta() {
        return varDescripEsta;
    }

    public void setVarDescripEsta(String varDescripEsta) {
        this.varDescripEsta = varDescripEsta;
    }

    public String getVarNombreTarjetahabiente() {
        return varNombreTarjetahabiente;
    }

    public void setVarNombreTarjetahabiente(String varNombreTarjetahabiente) {
        this.varNombreTarjetahabiente = varNombreTarjetahabiente;
    }

    public String getVarTipoDocumTatjetaHabiente() {
        return varTipoDocumTatjetaHabiente;
    }

    public void setVarTipoDocumTatjetaHabiente(String varTipoDocumTatjetaHabiente) {
        this.varTipoDocumTatjetaHabiente = varTipoDocumTatjetaHabiente;
    }

    public String getVarNumDocumento() {
        return varNumDocumento;
    }

    public void setVarNumDocumento(String varNumDocumento) {
        this.varNumDocumento = varNumDocumento;
    }

    public String getVarDescripcionTipoDocumento() {
        return varDescripcionTipoDocumento;
    }

    public void setVarDescripcionTipoDocumento(String varDescripcionTipoDocumento) {
        this.varDescripcionTipoDocumento = varDescripcionTipoDocumento;
    }
    
    
    
    
  
    //To String 

    @Override
    public String toString() {
        return "Movimientos{" + "intidMovimientos=" + intidMovimientos + ", varBin=" + varBin + ", varTarjeta=" + varTarjeta + ", varNitEmpresa=" + varNitEmpresa + ", varNumCuenta=" + varNumCuenta + ", varDispOrigen=" + varDispOrigen + ", varDesEstCoCargos=" + varDesEstCoCargos + ", varDescTransac=" + varDescTransac + ", decValTransaccion=" + decValTransaccion + ", decValDispensado=" + decValDispensado + ", dateFechaTransac=" + dateFechaTransac + ", varDateFechaTransac=" + varDateFechaTransac + ", decValCarCobr=" + decValCarCobr + ", decValIva=" + decValIva + ", decTotalCobrar=" + decTotalCobrar + ", decImpEmerEcono=" + decImpEmerEcono + ", varIndicadorRever=" + varIndicadorRever + ", varRespuAutoriz=" + varRespuAutoriz + ", varDescrpResp=" + varDescrpResp + ", varCodAutoriza=" + varCodAutoriza + ", varFiller=" + varFiller + ", dateFechAutoriza=" + dateFechAutoriza + ", varFechAutoriza=" + varFechAutoriza + ", varHoraAutoriza=" + varHoraAutoriza + ", varHortaDisposi=" + varHortaDisposi + ", varNumReferencia=" + varNumReferencia + ", varRedAdquiriente=" + varRedAdquiriente + ", varNumDispos=" + varNumDispos + ", varCodEstablecimiento=" + varCodEstablecimiento + ", varSubtipo=" + varSubtipo + ", varDescriSubtipo=" + varDescriSubtipo + ", varNumTarjSecundari=" + varNumTarjSecundari + ", varValorPropina=" + varValorPropina + ", varValorIva=" + varValorIva + ", varValorBaseDevIva=" + varValorBaseDevIva + ", varNumCuotas=" + varNumCuotas + ", varFiller2=" + varFiller2 + ", decSaldoDispo=" + decSaldoDispo + ", varEstadoTarjeta=" + varEstadoTarjeta + ", varDescripEsta=" + varDescripEsta + ", varNombreTarjetahabiente=" + varNombreTarjetahabiente + ", varTipoDocumTatjetaHabiente=" + varTipoDocumTatjetaHabiente + ", varNumDocumento=" + varNumDocumento + ", varDescripcionTipoDocumento=" + varDescripcionTipoDocumento + '}';
    }
    
    
    

    
}
