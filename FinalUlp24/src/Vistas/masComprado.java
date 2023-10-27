/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.AccesoProducto;
import Entidades.Producto;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mi PC
 */
public class masComprado extends javax.swing.JInternalFrame {

    private final DefaultTableModel model = new DefaultTableModel();
    
    public masComprado() {
        initComponents();
        armarCabecera();
    }

    public void armarCabecera(){
        model.addColumn("Nombre");
        model.addColumn("Unidades vendidas");
        
        tabla.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PRODUCTOS MÁS COMPRADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("ENTRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Ingrese el rango de fechas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));
        getContentPane().add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 30));
        getContentPane().add(fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 160, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 440, 100));

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 300, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 720, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("|     Listado de productos más comprados entre fechas indicadas     |");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 710, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        Producto p = new Producto();
        AccesoProducto acc = new AccesoProducto();
        
        LocalDate F1 = fecha1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate F2 = fecha2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
             
         
        List<Producto> lista=acc.masComprados(F1, F2);
        for (Producto a: lista){
           model.addRow(new Object[]{a.getNombre(),a.getStock()});
        }
    }//GEN-LAST:event_botonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

private void borrarFilaTabla(){
        int indice = model.getRowCount() -1;
        
        for(int i = indice;i>=0;i--){
            model.removeRow(i); 
        }
    }
    
}
