/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.AccesoCompra;
import AccesoADatos.AccesoDetalle;
import AccesoADatos.AccesoProducto;
import AccesoADatos.AccesoProveedor;
import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Entidades.Proveedor;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 *
 * @author marti
 */
public class PorFecha extends javax.swing.JInternalFrame {

    /**
     * Creates new form PorFecha
     */
    public PorFecha() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        textProveedor = new javax.swing.JTextField();
        textCompra = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textRSocial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textProducto = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        textCantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 217, 158, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 200, 113, 47));

        textProveedor.setEditable(false);
        getContentPane().add(textProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 162, -1));

        textCompra.setEditable(false);
        getContentPane().add(textCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 162, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 220, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Id Proveedor:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Id Compra:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese fecha a buscar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        jLabel4.setText("DETALLE DE COMPRA POR FECHA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Razón social:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        textRSocial.setEditable(false);
        textRSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRSocialActionPerformed(evt);
            }
        });
        getContentPane().add(textRSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 162, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Producto:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Precio Unitario:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cantidad:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, 14));

        textProducto.setEditable(false);
        textProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProductoActionPerformed(evt);
            }
        });
        getContentPane().add(textProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 150, -1));

        textPrecio.setEditable(false);
        textPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 150, -1));

        textCantidad.setEditable(false);
        getContentPane().add(textCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 150, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 760, 13));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        textProveedor.setText("");
        textCompra.setText("");
        textRSocial.setText("");
        textCantidad.setText("");
        textProducto.setText("");
        textPrecio.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        AccesoCompra acc = new AccesoCompra();
        AccesoDetalle acc2 = new AccesoDetalle();
        AccesoProducto acc3 = new AccesoProducto();
        Producto p = new Producto();
        DetalleCompra d = new DetalleCompra();
        Compra c = new Compra();
        
        LocalDate F1 = Fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        c = acc.porFecha(F1); //
        textProveedor.setText(""+c.getProveedor().getId());
        textRSocial.setText(""+c.getProveedor().getRazonSocial());
        textCompra.setText(""+c.getId());
        
        d = acc2.detallePorId(c.getId());
        p = acc3.buscarProducto(d.getProducto().getId());
              
    if (d != null){       
       textCantidad.setText(""+d.getCantidad());
       textPrecio.setText(""+d.getPrecioUnitario());
       textProducto.setText(""+p.getNombre());
    } else {
       textCantidad.setText("");
       textPrecio.setText("");
       textProducto.setText("");
    }
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textRSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRSocialActionPerformed

    private void textProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProductoActionPerformed

    private void textPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textCompra;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JTextField textProducto;
    private javax.swing.JTextField textProveedor;
    private javax.swing.JTextField textRSocial;
    // End of variables declaration//GEN-END:variables
}
