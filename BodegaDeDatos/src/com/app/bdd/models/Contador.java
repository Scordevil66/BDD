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
public class Contador {
    
    private static int totalLineas;

    public static int getTotalLineas() {
        return totalLineas;
    }

    public static void setTotalLineas(int totalLineas) {
        Contador.totalLineas = totalLineas;
    }
    
    
    
}
