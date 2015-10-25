/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.modelo;

import java.io.Serializable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javier
 */
public class toSend implements Serializable{
    
    private DefaultTableModel modelo;

    public toSend(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }
    
    
    
}
