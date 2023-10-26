/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.AccesoProveedor;
import Entidades.Proveedor;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class RegistroProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroProveedor
     */
    public RegistroProveedor() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textDomicilio = new javax.swing.JTextField();
        GUARDAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registrar Proveedores");

        jLabel2.setText("ID");

        jLabel3.setText("Razon Social");

        jLabel4.setText("Domicilio");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        GUARDAR.setText("GUARDAR");
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });

        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero de contacto");

        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(26, 26, 26)
                .addComponent(MODIFICAR)
                .addGap(48, 48, 48)
                .addComponent(GUARDAR)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textNombre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(BUSCAR))
                    .addComponent(textDomicilio)
                    .addComponent(textNumero))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCAR)
                    .addComponent(jButton1))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GUARDAR)
                    .addComponent(MODIFICAR)
                    .addComponent(jButton2))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        // TODO add your handling code here:
         AccesoProveedor prod = new AccesoProveedor();
        Proveedor p = prod.buscarProveedor(Integer.parseInt(textId.getText()));
        textNombre.setText(p.getRazonSocial());
        textDomicilio.setText(p.getDireccion());
        textNumero.setText(""+p.getTelefono());

    }//GEN-LAST:event_BUSCARActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        // TODO add your handling code here:
        AccesoProveedor acc = new AccesoProveedor();
        Proveedor pr = new Proveedor();
        String nombre = textNombre.getText();
        String domicilio = textDomicilio.getText();
        String num = textNumero.getText();
        
        if (!contieneNumeros(nombre)&& !contieneLetras(num)){
        
        pr.setRazonSocial(textNombre.getText());
        pr.setDireccion(textDomicilio.getText());
        pr.setTelefono(Integer.parseInt(textNumero.getText()));
        
        acc.guardarProveedor(pr);
        Limpiar();
        
        }else{
        
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos en los campos.");
        if (contieneNumeros(nombre)){
            textNombre.setText("");
        }

        if (contieneLetras(num)){
            textNumero.setText("");
        }
        
        }
        
        
        
    }//GEN-LAST:event_GUARDARActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        // TODO add your handling code here:
        AccesoProveedor c = new AccesoProveedor();
        Proveedor pr = new Proveedor();
        
        String nombre = textNombre.getText();
        String domicilio = textDomicilio.getText();
        String num = textNumero.getText();
        
        
        if (!contieneNumeros(nombre)&& !contieneLetras(num)){
        pr.setRazonSocial(textNombre.getText());
        pr.setDireccion(textDomicilio.getText());
        pr.setTelefono(Integer.parseInt(textNumero.getText()));
        pr.setId(Integer.parseInt(textId.getText()));

        c.modificarProveedor(pr);
        }else{
        
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores válidos en los campos.");
        if (contieneNumeros(nombre)){
            textNombre.setText("");
        }

        if (contieneLetras(num)){
            textNumero.setText("");
        }
        
        }
        
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AccesoProveedor acc = new AccesoProveedor();
        acc.eliminarProveedor(Integer.parseInt(textId.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textDomicilio;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textNumero;
    // End of variables declaration//GEN-END:variables

    
    public void Limpiar(){
        
        textId.setText("");
        textNombre.setText("");
        textDomicilio.setText("");
        textNumero.setText("");


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
