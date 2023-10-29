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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mi PC
 */
public class PorProveedor extends javax.swing.JInternalFrame {
    Proveedor p = new Proveedor();
    /**
     * Creates new form PorProveedor
     */
    public PorProveedor() {
        initComponents();
        cargarProveedor();
        cargarCompra();
    }

    public void cargarProveedor(){
        AccesoProveedor acc = new AccesoProveedor();
        
        List<Proveedor> proveedores=new ArrayList<>();
        proveedores = acc.listarProveedores();
        for (Proveedor prov: proveedores){
            comboProveedor.addItem(prov);
        }
    }
    public void cargarCompra(){
        
        comboCompra.removeAllItems();
        
        AccesoCompra acc = new AccesoCompra();
        Compra c = new Compra();
        List<Compra> compras= new ArrayList<>();
        p=(Proveedor)comboProveedor.getSelectedItem();
        compras = acc.porProveedor(p.getId());
        for(Compra com: compras){
            comboCompra.addItem(com);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        comboCompra = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textFecha = new javax.swing.JTextField();
        textProducto = new javax.swing.JTextField();
        textCantidad = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        limpiar = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        jLabel1.setText("DETALLE DE COMPRA POR PROVEEDOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Elije un proveedor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        comboProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboProveedorMouseClicked(evt);
            }
        });
        comboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(comboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 147, -1));

        buscar.setBackground(new java.awt.Color(102, 102, 102));
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 140, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Elije una compra (ID):");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        getContentPane().add(comboCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 147, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 790, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de compra:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 27));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Producto:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Precio Unitario:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));
        getContentPane().add(textFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 171, -1));
        getContentPane().add(textProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 171, -1));
        getContentPane().add(textCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 171, -1));
        getContentPane().add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 171, -1));

        limpiar.setBackground(new java.awt.Color(102, 102, 102));
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 240, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // CLICK BOTON BUSCAR
        Compra c = (Compra) comboCompra.getSelectedItem();
        Producto p = new Producto();
        DetalleCompra d = new DetalleCompra();
        AccesoDetalle acc = new AccesoDetalle();
        AccesoProducto acc2 = new AccesoProducto();
        d = acc.detallePorId(c.getId());
        p = acc2.buscarProducto(d.getProducto().getId());
        
        textFecha.setText(""+c.getFechaPedido().toString());
        textProducto.setText(""+p.getNombre());
        textCantidad.setText(""+d.getCantidad());
        textPrecio.setText(""+d.getPrecioUnitario());
        
       
    }//GEN-LAST:event_buscarActionPerformed

    private void comboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedorActionPerformed
        //CLICK SOBRE COMBOPROVEEDOR
        comboCompra.removeAllItems();
        cargarCompra();
    }//GEN-LAST:event_comboProveedorActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
          
        textFecha.setText("");
        textProducto.setText("");
        textCantidad.setText("");
        textPrecio.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void comboProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboProveedorMouseClicked
        comboCompra.removeAll();
        cargarCompra();
    }//GEN-LAST:event_comboProveedorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buscar;
    private javax.swing.JComboBox<Compra> comboCompra;
    private javax.swing.JComboBox<Proveedor> comboProveedor;
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
    private javax.swing.JToggleButton limpiar;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textFecha;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JTextField textProducto;
    // End of variables declaration//GEN-END:variables
}
