/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente.vistas;

import com.cliente.controler.clientesock;
import com.server.vistas.AddCatalogos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mariana
 */
public class ClientePrincipal extends javax.swing.JFrame {
    public static Object jbConnect;
    private clientesock service = null;
    private boolean flag = true;
    /**
     * Creates new form ClientePrincipal
     */
    public ClientePrincipal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Cliente Principal");
        jTextip.setText("localhost");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbaddCatalogo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbViewCaarrito = new javax.swing.JButton();
        jbtiket = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextip = new javax.swing.JTextField();
        jbuconectar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/F0B.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setEnabled(false);
        jPanel1.setOpaque(false);

        jbaddCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        jbaddCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra.png"))); // NOI18N
        jbaddCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbaddCatalogo.setEnabled(false);
        jbaddCatalogo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jbaddCatalogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbaddCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaddCatalogoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ver Catalogo");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ver Carrito");

        jbViewCaarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito.redimensionado.png"))); // NOI18N
        jbViewCaarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbViewCaarrito.setEnabled(false);
        jbViewCaarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbViewCaarritoActionPerformed(evt);
            }
        });

        jbtiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ticket.redimensionado.png"))); // NOI18N
        jbtiket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtiket.setEnabled(false);
        jbtiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtiketActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ticket");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbaddCatalogo)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbViewCaarrito)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtiket, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbaddCatalogo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtiket, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbViewCaarrito))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Conectar a:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));
        getContentPane().add(jTextip, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 160, -1));

        jbuconectar.setText("Conectar");
        jbuconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuconectarActionPerformed(evt);
            }
        });
        getContentPane().add(jbuconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/F0B.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 330));

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbaddCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaddCatalogoActionPerformed
        try {       
            new Compracliente().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClientePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jbaddCatalogoActionPerformed

    private void jbViewCaarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbViewCaarritoActionPerformed
        try {
            new VerCarrito().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            //Logger.getLogger(PrincipalServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbViewCaarritoActionPerformed

    private void jbtiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtiketActionPerformed
        new VerTicket().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jbtiketActionPerformed

    private void jbuconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuconectarActionPerformed
       String mensaje = jTextip.getText();
        String type = jbuconectar.getText();
        
        if(flag)
        {    
            if(!mensaje.isEmpty())
            {
                try
                {
//                    SOlo establecemos la conexion con el servidor
                    this.service = new clientesock(mensaje);
                    //service.start();
                    jTextip.setEditable(false);
//                    jbConnect.setText("Cerrar Sesión");
                    jbViewCaarrito.setEnabled(true);
                    jbaddCatalogo.setEnabled(true);
                    jbtiket.setEnabled(true);
                    this.flag = false; 
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado servicio ", "Error de conexion", JOptionPane.ERROR_MESSAGE);
                }
                
            }    
            else
                JOptionPane.showMessageDialog(this, "Usted no ha ingresado una Ip  ", "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
//            Esto nucna jalo 
            this.service.desconectar();
            jTextip.setEditable(true);
//            jbConnect.setText("Conectar");
            jbViewCaarrito.setEnabled(false);
            jbaddCatalogo.setEnabled(false);
            jbtiket.setEnabled(false);
            this.flag = true;
        }
    }//GEN-LAST:event_jbuconectarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextip;
    private javax.swing.JButton jbViewCaarrito;
    private javax.swing.JButton jbaddCatalogo;
    private javax.swing.JButton jbtiket;
    private javax.swing.JButton jbuconectar;
    // End of variables declaration//GEN-END:variables
}
