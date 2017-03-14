package com.app.bdd.models;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ce
 */
public class NoMonetarias {
    
    private int intIdNoMonetarias;
    
    private String varTipoNovedad;
    
    private double dateFechaNovedad;
        
    private String vardateFechaNovedad;
    
    private String varCodFranquicia;
    
    private String varCodBin;
    
    private String varNumTarjeta;
    
    private String varNombreTarjetahabiente;
    
    private String varSubTipo;
    
    private String varTipoCuenta;
    
    private String varNumeroCuenta;
    
    private String varOficina;
    
    private String varTipoDocumTatjetaHabiente;
    
    private String varNumDocumento;
    
    private String varNitEmpresa;
    
    private String varNombreEmpresa;
    
    private String varNumTarjetaAnterior;
    
    //// tabla monetarias
  private int intidMovimientos;
    private String varBin;
    private String varTarjeta;
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
    ///
    private String varDescripcionTipoNovedad;
    // Campos externos
    //Campos traidos de la tabla saldos
    private String decSaldoDispo;
    private String varEstadoTarjeta;
    private String varDescripEsta;
    
    ///
       public NoMonetarias(String varBin, String varTarjeta, String varNitEmpresa, double decValCarCobr, String varSubtipo, String varEstadoTarjeta, String varDescripEsta, String varTipoDocumTatjetaHabiente, String varNumDocumento, String vardateFechaNovedad, String varTipoNovedad, String varDescripcionTipoNovedad, String varOficina, String varNumTarjetaAnterior) {
        this.varBin = varBin;
        this.varTarjeta = varTarjeta;
        this.varNitEmpresa = varNitEmpresa;
        this.decValCarCobr = decValCarCobr;
        this.varSubtipo = varSubtipo;
        this.varEstadoTarjeta = varEstadoTarjeta;
        this.varDescripEsta = varDescripEsta;
        this.varTipoDocumTatjetaHabiente = varTipoDocumTatjetaHabiente;
        this.varNumDocumento = varNumDocumento;
        this.vardateFechaNovedad = vardateFechaNovedad;
        this.varTipoNovedad = varTipoNovedad;
        this.varDescripcionTipoNovedad = varDescripcionTipoNovedad;
        this.varOficina = varOficina;
        this.varNumTarjetaAnterior = varNumTarjetaAnterior;
    }
    
    
    /////
    
    
    //Constructers 

    public NoMonetarias() {
    }

    public NoMonetarias(int intIdNoMonetarias) {
        this.intIdNoMonetarias = intIdNoMonetarias;
    }

    public NoMonetarias(int intIdNoMonetarias, String varTipoNovedad, double dateFechaNovedad, String vardateFechaNovedad, String varCodFranquicia, String varCodBin, String varNumTarjeta, String varNombreTarjetahabiente, String varSubTipo, String varTipoCuenta, String varNumeroCuenta, String varOficina, String varTipoDocumTatjetaHabiente, String varNumDocumento, String varNitEmpresa, String varNombreEmpresa, String varNumTarjetaAnterior) {
        this.intIdNoMonetarias = intIdNoMonetarias;
        this.varTipoNovedad = varTipoNovedad;
        this.dateFechaNovedad = dateFechaNovedad;
        this.vardateFechaNovedad = vardateFechaNovedad;
        this.varCodFranquicia = varCodFranquicia;
        this.varCodBin = varCodBin;
        this.varNumTarjeta = varNumTarjeta;
        this.varNombreTarjetahabiente = varNombreTarjetahabiente;
        this.varSubTipo = varSubTipo;
        this.varTipoCuenta = varTipoCuenta;
        this.varNumeroCuenta = varNumeroCuenta;
        this.varOficina = varOficina;
        this.varTipoDocumTatjetaHabiente = varTipoDocumTatjetaHabiente;
        this.varNumDocumento = varNumDocumento;
        this.varNitEmpresa = varNitEmpresa;
        this.varNombreEmpresa = varNombreEmpresa;
        this.varNumTarjetaAnterior = varNumTarjetaAnterior;
    }
    
    
    ////
        //Getters And Setters
    public int getIntIdNoMonetarias() {
        return intIdNoMonetarias;
    }

    public void setIntIdNoMonetarias(int intIdNoMonetarias) {
        this.intIdNoMonetarias = intIdNoMonetarias;
    }

    public String getVarTipoNovedad() {
        return varTipoNovedad;
    }

    public void setVarTipoNovedad(String varTipoNovedad) {
        this.varTipoNovedad = varTipoNovedad;
    }

    public double getDateFechaNovedad() {
        return dateFechaNovedad;
    }

    public void setDateFechaNovedad(double dateFechaNovedad) {
        this.dateFechaNovedad = dateFechaNovedad;
    }

    public String getVardateFechaNovedad() {
        return vardateFechaNovedad;
    }

    public void setVardateFechaNovedad(String vardateFechaNovedad) {
        this.vardateFechaNovedad = vardateFechaNovedad;
    }

    public String getVarCodFranquicia() {
        return varCodFranquicia;
    }

    public void setVarCodFranquicia(String varCodFranquicia) {
        this.varCodFranquicia = varCodFranquicia;
    }

    public String getVarCodBin() {
        return varCodBin;
    }

    public void setVarCodBin(String varCodBin) {
        this.varCodBin = varCodBin;
    }

    public String getVarNumTarjeta() {
        return varNumTarjeta;
    }

    public void setVarNumTarjeta(String varNumTarjeta) {
        this.varNumTarjeta = varNumTarjeta;
    }

    public String getVarNombreTarjetahabiente() {
        return varNombreTarjetahabiente;
    }

    public void setVarNombreTarjetahabiente(String varNombreTarjetahabiente) {
        this.varNombreTarjetahabiente = varNombreTarjetahabiente;
    }

    public String getVarSubTipo() {
        return varSubTipo;
    }

    public void setVarSubTipo(String varSubTipo) {
        this.varSubTipo = varSubTipo;
    }

    public String getVarTipoCuenta() {
        return varTipoCuenta;
    }

    public void setVarTipoCuenta(String varTipoCuenta) {
        this.varTipoCuenta = varTipoCuenta;
    }

    public String getVarNumeroCuenta() {
        return varNumeroCuenta;
    }

    public void setVarNumeroCuenta(String varNumeroCuenta) {
        this.varNumeroCuenta = varNumeroCuenta;
    }

    public String getVarOficina() {
        return varOficina;
    }

    public void setVarOficina(String varOficina) {
        this.varOficina = varOficina;
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

    public String getVarNitEmpresa() {
        return varNitEmpresa;
    }

    public void setVarNitEmpresa(String varNitEmpresa) {
        this.varNitEmpresa = varNitEmpresa;
    }

    public String getVarNombreEmpresa() {
        return varNombreEmpresa;
    }

    public void setVarNombreEmpresa(String varNombreEmpresa) {
        this.varNombreEmpresa = varNombreEmpresa;
    }

    public String getVarNumTarjetaAnterior() {
        return varNumTarjetaAnterior;
    }

    public void setVarNumTarjetaAnterior(String varNumTarjetaAnterior) {
        this.varNumTarjetaAnterior = varNumTarjetaAnterior;
    }

    public double getDecValCarCobr() {
        return decValCarCobr;
    }

    public void setDecValCarCobr(double decValCarCobr) {
        this.decValCarCobr = decValCarCobr;
    }

    public String getVarDescripEsta() {
        return varDescripEsta;
    }

    public void setVarDescripEsta(String varDescripEsta) {
        this.varDescripEsta = varDescripEsta;
    }
    
    
    
    
    //To_String 

    @Override
    public String toString() {
        return "NoMonetarias{" + "intIdNoMonetarias=" + intIdNoMonetarias + ", varTipoNovedad=" + varTipoNovedad + ", dateFechaNovedad=" + dateFechaNovedad + ", vardateFechaNovedad=" + vardateFechaNovedad + ", varCodFranquicia=" + varCodFranquicia + ", varCodBin=" + varCodBin + ", varNumTarjeta=" + varNumTarjeta + ", varNombreTarjetahabiente=" + varNombreTarjetahabiente + ", varSubTipo=" + varSubTipo + ", varTipoCuenta=" + varTipoCuenta + ", varNumeroCuenta=" + varNumeroCuenta + ", varOficina=" + varOficina + ", varTipoDocumTatjetaHabiente=" + varTipoDocumTatjetaHabiente + ", varNumDocumento=" + varNumDocumento + ", varNitEmpresa=" + varNitEmpresa + ", varNombreEmpresa=" + varNombreEmpresa + ", varNumTarjetaAnterior=" + varNumTarjetaAnterior + ", intidMovimientos=" + intidMovimientos + ", varBin=" + varBin + ", varTarjeta=" + varTarjeta + ", varNumCuenta=" + varNumCuenta + ", varDispOrigen=" + varDispOrigen + ", varDesEstCoCargos=" + varDesEstCoCargos + ", varDescTransac=" + varDescTransac + ", decValTransaccion=" + decValTransaccion + ", decValDispensado=" + decValDispensado + ", dateFechaTransac=" + dateFechaTransac + ", varDateFechaTransac=" + varDateFechaTransac + ", decValCarCobr=" + decValCarCobr + ", decValIva=" + decValIva + ", decTotalCobrar=" + decTotalCobrar + ", decImpEmerEcono=" + decImpEmerEcono + ", varIndicadorRever=" + varIndicadorRever + ", varRespuAutoriz=" + varRespuAutoriz + ", varDescrpResp=" + varDescrpResp + ", varCodAutoriza=" + varCodAutoriza + ", varFiller=" + varFiller + ", dateFechAutoriza=" + dateFechAutoriza + ", varFechAutoriza=" + varFechAutoriza + ", varHoraAutoriza=" + varHoraAutoriza + ", varHortaDisposi=" + varHortaDisposi + ", varNumReferencia=" + varNumReferencia + ", varRedAdquiriente=" + varRedAdquiriente + ", varNumDispos=" + varNumDispos + ", varCodEstablecimiento=" + varCodEstablecimiento + ", varSubtipo=" + varSubtipo + ", varDescriSubtipo=" + varDescriSubtipo + ", varNumTarjSecundari=" + varNumTarjSecundari + ", varValorPropina=" + varValorPropina + ", varValorIva=" + varValorIva + ", varValorBaseDevIva=" + varValorBaseDevIva + ", varNumCuotas=" + varNumCuotas + ", varFiller2=" + varFiller2 + ", varDescripcionTipoNovedad=" + varDescripcionTipoNovedad + ", decSaldoDispo=" + decSaldoDispo + ", varEstadoTarjeta=" + varEstadoTarjeta + ", varDescripEsta=" + varDescripEsta + '}';
    }
    
    
    
    
    
    
    
    }
