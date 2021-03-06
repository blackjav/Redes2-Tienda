/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.controlador;

import com.server.modelo.toSend;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javier
 */
public class Servidor extends Thread{
    
    private ServerSocket server;
    private BufferedReader entradaText;
    private InputStreamReader entradaSocket;
    private Socket socket;
    private InputStream llegada;
    private FileOutputStream destino;
    private byte[] buffer;
    private PrintWriter salidaText;
    private ObjectOutputStream salidaObjeto;

    private  int PUERTO;
    
    public Servidor(int port) throws IOException
    {
        this.PUERTO = port;
        

        
        
        
//        this.salidaObjeto = new ObjectOutputStream(socket.getOutputStream());
        
    }
    
    @Override
    public void run() 
    {
        try {
            this.server = new ServerSocket(PUERTO);
            JOptionPane.showMessageDialog(null, "Servidor is ready run !!", "alert", JOptionPane.INFORMATION_MESSAGE);
            this.socket = server.accept();
            this.entradaSocket = new InputStreamReader(socket.getInputStream());
            this.entradaText = new BufferedReader(entradaSocket);
            
            JOptionPane.showMessageDialog(null, "Se detecto cliente", "alert", JOptionPane.INFORMATION_MESSAGE);
            while(true)
            {
                try {
                    this.entradaText = new BufferedReader(entradaSocket);
                    entradaText.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
                   
    }
    
    public void send(toSend obj) throws IOException{
//        salidaObjeto.
        this.salidaObjeto = new ObjectOutputStream(socket.getOutputStream());
        salidaObjeto.flush();
        salidaObjeto.writeObject(obj);
        
//        salidaObjeto.close();
    }
    
    
}
