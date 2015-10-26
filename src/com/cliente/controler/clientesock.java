/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente.controler;

import com.cliente.vistas.ClientePrincipal;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.axis.encoding.Base64;

/**
 *
 * @author mariana
 */
public class clientesock {
    private PrintWriter salidaText;
    private Socket socket;
    private ObjectOutputStream out;
    private FileInputStream file;//Aqui va la ruta
    private PrintStream envio;
    private BufferedReader entradaText;
    private InputStreamReader entradaSocket;
    private static final int PUERTO = 5000;
    
    public clientesock(String ip) {
       
            try
            {
                this.socket= new Socket(ip,PUERTO);
                out = new  ObjectOutputStream(socket.getOutputStream());
//                this.salidaText = new PrintWriter(socket.getOutputStream(),true);
                this.envio=new PrintStream(socket.getOutputStream()); 
                this.entradaSocket = new InputStreamReader(socket.getInputStream());
                this.entradaText = new BufferedReader(entradaSocket); 

                //ClientePrincipal.jbConnect.setText("Cerrar Sesión");
//                System.out.println("Todo funcionando !!!!");
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No se ha podido establecer conexion \nVerifique la ip", "Error de conexion", 
                            JOptionPane.ERROR_MESSAGE);
            }
    }
    public void run()
    {
        String mensaje="";
        int i =1;
//       Hilo de espera en mensaje 
       try {
            while(true)
            {
                mensaje = entradaText.readLine();
              
                i++;
            }
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido establecer conexion ciere el programa", "Error de conexion", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(clientesock.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    }
    
   
    public void desconectar()
    {
        try {
            this.socket.close();
            this.salidaText.close();
        } catch (IOException ex) {
            Logger.getLogger(clientesock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
