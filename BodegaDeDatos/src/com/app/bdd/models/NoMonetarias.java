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
    private String varDescripcionTipoDocumento;
    
    /// consulta no monetarias por tarjeta

    public NoMonetarias(String varTipoNovedad, double dateFechaNovedad, String varCodBin, String varNumTarjeta, String varNombreTarjetahabiente, String varOficina, String varTipoDocumTatjetaHabiente, String varDescripcionTipoDocumento, String varNumDocumento, String varNitEmpresa, String varNombreEmpresa, String varNumTarjetaAnterior, double decValCarCobr, String varSubtipo, String varDescriSubtipo, String varDescripcionTipoNovedad, String varEstadoTarjeta, String varDescripEsta) {
        this.varTipoNovedad = varTipoNovedad;
        this.dateFechaNovedad = dateFechaNovedad;
        this.varCodBin = varCodBin;
        this.varNumTarjeta = varNumTarjeta;
        this.varNombreTarjetahabiente = varNombreTarjetahabiente;
        this.varOficina = varOficina;
        this.varTipoDocumTatjetaHabiente = varTipoDocumTatjetaHabiente;
        this.varDescripcionTipoDocumento = varDescripcionTipoDocumento;
        this.varNumDocumento = varNumDocumento;
        this.varNitEmpresa = varNitEmpresa;
        this.varNombreEmpresa = varNombreEmpresa;
        this.varNumTarjetaAnterior = varNumTarjetaAnterior;
        this.decValCarCobr = decValCarCobr;
        this.varSubtipo = varSubtipo;
        this.varDescriSubtipo = varDescriSubtipo;
        this.varDescripcionTipoNovedad = varDescripcionTipoNovedad;
        this.varEstadoTarjeta = varEstadoTarjeta;
        this.varDescripEsta = varDescripEsta;
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

    public String getVarDescripcionTipoNovedad() {
        return varDescripcionTipoNovedad;
    }

    public void setVarDescripcionTipoNovedad(String varDescripcionTipoNovedad) {
        this.varDescripcionTipoNovedad = varDescripcionTipoNovedad;
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

    public String getVarDescripcionTipoDocumento() {
        return varDescripcionTipoDocumento;
    }

    public void setVarDescripcionTipoDocumento(String varDescripcionTipoDocumento) {
        this.varDescripcionTipoDocumento = varDescripcionTipoDocumento;
    }

    @Override
    public String toString() {
        return "NoMonetarias{" + "intIdNoMonetarias=" + intIdNoMonetarias + ", varTipoNovedad=" + varTipoNovedad + ", dateFechaNovedad=" + dateFechaNovedad + ", vardateFechaNovedad=" + vardateFechaNovedad + ", varCodFranquicia=" + varCodFranquicia + ", varCodBin=" + varCodBin + ", varNumTarjeta=" + varNumTarjeta + ", varNombreTarjetahabiente=" + varNombreTarjetahabiente + ", varSubTipo=" + varSubTipo + ", varTipoCuenta=" + varTipoCuenta + ", varNumeroCuenta=" + varNumeroCuenta + ", varOficina=" + varOficina + ", varTipoDocumTatjetaHabiente=" + varTipoDocumTatjetaHabiente + ", varNumDocumento=" + varNumDocumento + ", varNitEmpresa=" + varNitEmpresa + ", varNombreEmpresa=" + varNombreEmpresa + ", varNumTarjetaAnterior=" + varNumTarjetaAnterior + ", intidMovimientos=" + intidMovimientos + ", varBin=" + varBin + ", varTarjeta=" + varTarjeta + ", varNumCuenta=" + varNumCuenta + ", varDispOrigen=" + varDispOrigen + ", varDesEstCoCargos=" + varDesEstCoCargos + ", varDescTransac=" + varDescTransac + ", decValTransaccion=" + decValTransaccion + ", decValDispensado=" + decValDispensado + ", dateFechaTransac=" + dateFechaTransac + ", varDateFechaTransac=" + varDateFechaTransac + ", decValCarCobr=" + decValCarCobr + ", decValIva=" + decValIva + ", decTotalCobrar=" + decTotalCobrar + ", decImpEmerEcono=" + decImpEmerEcono + ", varIndicadorRever=" + varIndicadorRever + ", varRespuAutoriz=" + varRespuAutoriz + ", varDescrpResp=" + varDescrpResp + ", varCodAutoriza=" + varCodAutoriza + ", varFiller=" + varFiller + ", dateFechAutoriza=" + dateFechAutoriza + ", varFechAutoriza=" + varFechAutoriza + ", varHoraAutoriza=" + varHoraAutoriza + ", varHortaDisposi=" + varHortaDisposi + ", varNumReferencia=" + varNumReferencia + ", varRedAdquiriente=" + varRedAdquiriente + ", varNumDispos=" + varNumDispos + ", varCodEstablecimiento=" + varCodEstablecimiento + ", varSubtipo=" + varSubtipo + ", varDescriSubtipo=" + varDescriSubtipo + ", varNumTarjSecundari=" + varNumTarjSecundari + ", varValorPropina=" + varValorPropina + ", varValorIva=" + varValorIva + ", varValorBaseDevIva=" + varValorBaseDevIva + ", varNumCuotas=" + varNumCuotas + ", varFiller2=" + varFiller2 + ", varDescripcionTipoNovedad=" + varDescripcionTipoNovedad + ", decSaldoDispo=" + decSaldoDispo + ", varEstadoTarjeta=" + varEstadoTarjeta + ", varDescripEsta=" + varDescripEsta + ", varDescripcionTipoDocumento=" + varDescripcionTipoDocumento + '}';
    }
     
    
   
    
}
  
