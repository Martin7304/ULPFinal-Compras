/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import AccesoADatos.AccesoProducto;
import Entidades.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author Mi PC
 */
public class RegistroProducto extends javax.swing.JInternalFrame {

    /** Creates new form RegistroProducto */
    public RegistroProducto() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        textPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RadioEstado = new javax.swing.JRadioButton();
        botonModificar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, 32));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        textId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdActionPerformed(evt);
            }
        });
        getContentPane().add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 160, -1));

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Descripción:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));
        getContentPane().add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 224, -1));

        textDescripcion.setColumns(20);
        textDescripcion.setRows(5);
        jScrollPane2.setViewportView(textDescripcion);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 224, 67));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Precio actual:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        textPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 224, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Stock:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        textStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStockActionPerformed(evt);
            }
        });
        getContentPane().add(textStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 224, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Estado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, 25));
        getContentPane().add(RadioEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        botonModificar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        botonGuardar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, -1));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 790, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
         AccesoProducto prod = new AccesoProducto();
        Producto p = prod.buscarProducto(Integer.parseInt(textId.getText()));
        textNombre.setText(p.getNombre());
        textDescripcion.setText(p.getDescripcion());
        textPrecio.setText(""+p.getPrecioActual());
        textStock.setText(""+p.getStock());
        RadioEstado.setSelected(p.isEstado());
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void textPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecioActionPerformed

    private void textStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStockActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // Guardar producto
        AccesoProducto acc = new AccesoProducto();
        Producto pr = new Producto();
        String nombre = textNombre.getText();
        String descripcion = textDescripcion.getText();
        String stock = textStock.getText();
        String precio = textPrecio.getText();
        
        //CONDICION PARA QUE NO SE PUEDAN INGRESAR NUMEROS NI LETRAS
        if (!contieneNumeros(nombre) && !contieneNumeros(descripcion) && !contieneLetras(precio) && !contieneLetras(stock)){


        pr.setNombre(textNombre.getText());
        pr.setDescripcion(textDescripcion.getText());
        pr.setPrecioActual(Double.parseDouble(textPrecio.getText()));
        pr.setStock(Integer.parseInt(textStock.getText()));
        pr.setEstado(true);
        
        acc.guardarProducto(pr);
        Limpiar();
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos en los campos.");
        if (contieneNumeros(nombre)){
            textNombre.setText("");
        }
        if (contieneNumeros(descripcion)){
            textDescripcion.setText("");
        }
        if (contieneLetras(precio)){
            textPrecio.setText("");
        }
        if (contieneLetras(stock)){
            textStock.setText("");
        }

    }
        

    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
        AccesoProducto acc = new AccesoProducto();
        Producto pr = new Producto();
        
        String nombre = textNombre.getText();
        String descripcion = textDescripcion.getText();
        String stock = textStock.getText();
        String precio = textPrecio.getText();
        
        
         if (!contieneNumeros(nombre) && !contieneNumeros(descripcion) && !contieneLetras(precio) && !contieneLetras(stock)){
        pr.setNombre(textNombre.getText());
        pr.setDescripcion(textDescripcion.getText());
        pr.setPrecioActual(Double.parseDouble(textPrecio.getText()));
        pr.setStock(Integer.parseInt(textStock.getText()));
        pr.setId(Integer.parseInt(textId.getText()));
        //pr.setEstado(RadioEstado.isSelected());
        
        acc.modificarProduto(pr);
        
         } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos en los campos.");
        if (contieneNumeros(nombre)){
            textNombre.setText("");
        }
        if (contieneNumeros(descripcion)){
            textDescripcion.setText("");
        }
        if (contieneLetras(precio)){
            textPrecio.setText("");
        }
        if (contieneLetras(stock)){
            textStock.setText("");
        }}
    }//GEN-LAST:event_botonModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AccesoProducto acc = new AccesoProducto();
        acc.eliminarProducto(Integer.parseInt(textId.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioEstado;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea textDescripcion;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JTextField textStock;
    // End of variables declaration//GEN-END:variables

    
    public void Limpiar(){
        
        textId.setText("");
        textNombre.setText("");
        textDescripcion.setText("");
        textPrecio.setText("");
        textStock.setText("");
        RadioEstado.setSelected(false);

    }
    
    private boolean contieneNumeros(String texto) {
    for (char c : texto.toCharArray()) {
        if (Character.isDigit(c)) {
            return true;
        }
    }
    return false;
}

    private boolean contieneLetras(String texto) {
    for (char c : texto.toCharArray()) {
        if (Character.isLetter(c)) {
            return true;
        }
    }
    return false;
}
    
}


