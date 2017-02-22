/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.models;

/**
 *
 * @author ce
 */
public class TslSaldos {

    private int intIdSaldos;

    private String varBin;

    private String varNitEMpresa;

    private String varTarjeta;

    private String varMiembro;

    private String varNombTajHabiente;

    private String decSaldoDispo;

    private String varEstadoTarjeta;

    private String varDescripEsta;

    private String varSubtipo;

    //Constructers....
    public TslSaldos() {
    }

    public TslSaldos(int intIdSaldos) {
        this.intIdSaldos = intIdSaldos;
    }

    public TslSaldos(int intIdSaldos, String varBin, String varNitEMpresa, String varTarjeta, String varMiembro, String varNombTajHabiente, String decSaldoDispo, String varEstadoTarjeta, String varDescripEsta, String varSubtipo) {
        this.intIdSaldos = intIdSaldos;
        this.varBin = varBin;
        this.varNitEMpresa = varNitEMpresa;
        this.varTarjeta = varTarjeta;
        this.varMiembro = varMiembro;
        this.varNombTajHabiente = varNombTajHabiente;
        this.decSaldoDispo = decSaldoDispo;
        this.varEstadoTarjeta = varEstadoTarjeta;
        this.varDescripEsta = varDescripEsta;
        this.varSubtipo = varSubtipo;
    }

    //Getters and Setters
    public int getIntIdSaldos() {
        return intIdSaldos;
    }

    public void setIntIdSaldos(int intIdSaldos) {
        this.intIdSaldos = intIdSaldos;
    }

    public String getVarBin() {
        return varBin;
    }

    public void setVarBin(String varBin) {
        this.varBin = varBin;
    }

    public String getVarNitEMpresa() {
        return varNitEMpresa;
    }

    public void setVarNitEMpresa(String varNitEMpresa) {
        this.varNitEMpresa = varNitEMpresa;
    }

    public String getVarTarjeta() {
        return varTarjeta;
    }

    public void setVarTarjeta(String varTarjeta) {
        this.varTarjeta = varTarjeta;
    }

    public String getVarMiembro() {
        return varMiembro;
    }

    public void setVarMiembro(String varMiembro) {
        this.varMiembro = varMiembro;
    }

    public String getVarNombTajHabiente() {
        return varNombTajHabiente;
    }

    public void setVarNombTajHabiente(String varNombTajHabiente) {
        this.varNombTajHabiente = varNombTajHabiente;
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

    public String getVarSubtipo() {
        return varSubtipo;
    }

    public void setVarSubtipo(String varSubtipo) {
        this.varSubtipo = varSubtipo;
    }

    //To_String
    @Override
    public String toString() {
        return "Saldos{" + "intIdSaldos=" + intIdSaldos + ", varBin=" + varBin + ", varNitEMpresa=" + varNitEMpresa + ", varTarjeta=" + varTarjeta + ", varMiembro=" + varMiembro + ", varNombTajHabiente=" + varNombTajHabiente + ", decSaldoDispo=" + decSaldoDispo + ", varEstadoTarjeta=" + varEstadoTarjeta + ", varDescripEsta=" + varDescripEsta + ", varSubtipo=" + varSubtipo + '}';
    }

}
