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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class NuevaCompra extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevaCompra
     */
    public NuevaCompra() {
        initComponents();
        comboProductos();
        comboProveedor();
    }

    public void comboProductos(){
        AccesoProducto acc = new AccesoProducto();
        Producto pr = new Producto();
        List<Producto> productos=new ArrayList<>();
        productos = acc.listarProductos();
        for(Producto prod: productos){
            comboProducto.addItem(prod);
        }
    }
    public void comboProveedor(){
        AccesoProveedor acc = new AccesoProveedor();
        Proveedor p = new Proveedor();
        List<Proveedor> proveedores=new ArrayList<>();
        proveedores = acc.listarProveedores();
        for (Proveedor prov: proveedores){
            comboProveedor.addItem(prov);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCalendario = new com.toedter.calendar.JCalendar();
        comboProducto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setClosable(true);
        setMaximizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("¡NUEVA COMPRA!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Elije un proveedor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        getContentPane().add(comboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 189, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Elije un producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        textCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(textCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 189, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Precio unitario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));
        getContentPane().add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 189, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Fecha:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        getContentPane().add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 170, 130));

        comboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(comboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 189, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton1.setText("Realizar compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 170, 40));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // CLICK REALIZAR COMPRA
        AccesoCompra acc = new AccesoCompra();
        AccesoDetalle acc2 = new AccesoDetalle();
        Compra compra = new Compra();
        DetalleCompra detalle = new DetalleCompra();
        
        Producto producto = (Producto) comboProducto.getSelectedItem();
        Proveedor proveedor = (Proveedor) comboProveedor.getSelectedItem();
        String cantidad = textCantidad.getText();
        String precio = textPrecio.getText();
        LocalDate fecha = jCalendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        //RESTRICCIONES
        if(!contieneLetras(cantidad)&&!contieneLetras(precio)){
        

        //creamos compra 
        compra.setProveedor(proveedor);
        compra.setFechaPedido(fecha);
        //mandamos esta compra a la base de datos
        acc.guardarCompra(compra);
        
        //creamos detalle
        detalle.setCompra(compra);
        detalle.setProducto(producto);
        detalle.setCantidad(Integer.parseInt(cantidad));
        detalle.setPrecioUnitario(Double.parseDouble(precio));
        acc2.guardarDetalle(detalle);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos en los campos.");
            if(contieneLetras(cantidad)){
                textCantidad.setText("");
            }
            if(contieneLetras(precio)){
                textPrecio.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductoActionPerformed
        // CLICK SOBRE COMBO BOX <PRODUCTO>
    }//GEN-LAST:event_comboProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Producto> comboProducto;
    private javax.swing.JComboBox<Proveedor> comboProveedor;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendario;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables

     private boolean contieneLetras(String x) {
        try {
            Double.parseDouble(x);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
