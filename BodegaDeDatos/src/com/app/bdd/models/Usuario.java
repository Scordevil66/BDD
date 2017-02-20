/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bdd.models;

/**
 *
 * @author user
 */
public class Usuario {

    private int intIdUsuario;

    private String varNombreUser;

    private String varApellidosUser;

    private String varCargoUser;

    private String varUsuario;

    private String varPassword;

//Constructers
    public Usuario() {
    }

    public Usuario(int intIdUsuario) {
        this.intIdUsuario = intIdUsuario;
    }

    public Usuario(int intIdUsuario, String varNombreUser, String varApellidosUser, String varCargoUser, String varUsuario, String varPassword) {
        this.intIdUsuario = intIdUsuario;
        this.varNombreUser = varNombreUser;
        this.varApellidosUser = varApellidosUser;
        this.varCargoUser = varCargoUser;
        this.varUsuario = varUsuario;
        this.varPassword = varPassword;
    }

    //getters and Setters
    public int getIntIdUsuario() {
        return intIdUsuario;
    }

    public void setIntIdUsuario(int intIdUsuario) {
        this.intIdUsuario = intIdUsuario;
    }

    public String getVarNombreUser() {
        return varNombreUser;
    }

    public void setVarNombreUser(String varNombreUser) {
        this.varNombreUser = varNombreUser;
    }

    public String getVarApellidosUser() {
        return varApellidosUser;
    }

    public void setVarApellidosUser(String varApellidosUser) {
        this.varApellidosUser = varApellidosUser;
    }

    public String getVarCargoUser() {
        return varCargoUser;
    }

    public void setVarCargoUser(String varCargoUser) {
        this.varCargoUser = varCargoUser;
    }

    public String getVarUsuario() {
        return varUsuario;
    }

    public void setVarUsuario(String varUsuario) {
        this.varUsuario = varUsuario;
    }

    public String getVarPassword() {
        return varPassword;
    }

    public void setVarPassword(String varPassword) {
        this.varPassword = varPassword;
    }

    @Override
    public String toString() {
        return "Usuario{" + "intIdUsuario=" + intIdUsuario + ", varNombreUser=" + varNombreUser + ", varApellidosUser=" + varApellidosUser + ", varCargoUser=" + varCargoUser + ", varUsuario=" + varUsuario + ", varPassword=" + varPassword + '}';
    }

}
