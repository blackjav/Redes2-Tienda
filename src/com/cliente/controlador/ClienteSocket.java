/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente.controlador;

import com.cliente.vistas.ClientePrincipal;
import com.server.modelo.toSend;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author javier
 */
public class ClienteSocket  extends Thread{
    
    private PrintWriter salidaText;
    private Socket socket;
    private ObjectOutputStream out;
    private FileInputStream file;//Aqui va la ruta
    private PrintStream envio;
    private BufferedReader entradaText;
    private InputStreamReader entradaSocket;
    private ObjectInputStream entradaObjeto;
    private int PUERTO;
    private Object lista;
    private String ip;
    
    public ClienteSocket(int port,String ip)
    {
        super("Cliente");
        
            this.PUERTO = port;
            this.ip = ip;
            
            
        
           
    }
    
    @Override
    public void run()
    {
       try {
            this.socket= new Socket(this.ip,this.PUERTO);
            out = new  ObjectOutputStream(socket.getOutputStream());
            entradaObjeto = new ObjectInputStream(socket.getInputStream());
            
            while(true)
            {
                lista =entradaObjeto.readObject();
                System.out.println("Entro "+lista);
                
               
            }
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido establecer conexion ciere el programa aaa " + ex, "Error de conexion+ ", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            System.out.println("Fallo");
        }
        
    }

    public Object getLista() {
        return lista;
    }

    public void setLista(Object lista) {
        this.lista = lista;
    }
    
    
    
}
