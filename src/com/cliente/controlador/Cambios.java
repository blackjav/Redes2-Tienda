/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente.controlador;

/**
 *
 * @author javier
 */
public class Cambios {
    private int id;
    private long existencias;

    public Cambios(int id, long existencias) {
        this.id = id;
        this.existencias = existencias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getExistencias() {
        return existencias;
    }

    public void setExistencias(long existencias) {
        this.existencias = existencias;
    }
    
    
    
}
