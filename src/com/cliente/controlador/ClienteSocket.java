/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente.controlador;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
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
    
    public ClienteSocket(int port,String ip)
    {
        super("Cliente");
        this.PUERTO = port;
            try
            {
                this.socket= new Socket(ip,PUERTO);
                out = new  ObjectOutputStream(socket.getOutputStream());
//                this.salidaText = new PrintWriter(socket.getOutputStream(),true);
                this.envio=new PrintStream(socket.getOutputStream()); 
                this.entradaSocket = new InputStreamReader(socket.getInputStream());
                this.entradaText = new BufferedReader(entradaSocket); 

//                VentanaCliente.jbConnect.setText("Cerrar Sesión");
//                System.out.println("Todo funcionando !!!!");
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No se ha podido establecer conexion \nVerifique la ip", "Error de conexion",JOptionPane.ERROR_MESSAGE);
            }
//            run();
    }
    
    @Override
    public void run()
    {
        String mensaje="";
        int i =1;
       try {
            while(true)
            {
                entradaObjeto = new ObjectInputStream(socket.getInputStream());
                lista =entradaObjeto.readObject();
                System.out.println("Entro "+lista);
                entradaObjeto.close();
               
            }
        } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido establecer conexion ciere el programa", "Error de conexion", JOptionPane.ERROR_MESSAGE);
           }
        
    }

    public Object getLista() {
        return lista;
    }

    public void setLista(Object lista) {
        this.lista = lista;
    }
    
    
    
}
