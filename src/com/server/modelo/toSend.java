/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.modelo;

import java.io.Serializable;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javier
 */
public class toSend implements Serializable{
    
    private List modelo;

    public toSend(List modelo) {
        this.modelo = modelo;
    }

    public List getModelo() {
        return modelo;
    }

    public void setModelo(List modelo) {
        this.modelo = modelo;
    }
    
    
    
}
