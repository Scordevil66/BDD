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
    
    
    //To_String 
    
    @Override
    public String toString() {
        return "NoMonetarias{" + "intIdNoMonetarias=" + intIdNoMonetarias + ", varTipoNovedad=" + varTipoNovedad + ", dateFechaNovedad=" + dateFechaNovedad + ", vardateFechaNovedad=" + vardateFechaNovedad + ", varCodFranquicia=" + varCodFranquicia + ", varCodBin=" + varCodBin + ", varNumTarjeta=" + varNumTarjeta + ", varNombreTarjetahabiente=" + varNombreTarjetahabiente + ", varSubTipo=" + varSubTipo + ", varTipoCuenta=" + varTipoCuenta + ", varNumeroCuenta=" + varNumeroCuenta + ", varOficina=" + varOficina + ", varTipoDocumTatjetaHabiente=" + varTipoDocumTatjetaHabiente + ", varNumDocumento=" + varNumDocumento + ", varNitEmpresa=" + varNitEmpresa + ", varNombreEmpresa=" + varNombreEmpresa + ", varNumTarjetaAnterior=" + varNumTarjetaAnterior + '}';
    }
    
    
    
    
    
    
    }
