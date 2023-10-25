/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.DetalleCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mi PC
 */
public class AccesoDetalle {
    
    private Connection con=null;
    
    public AccesoDetalle(){
    
    con=Conexion.getConexion();
    }
    
    public void guardarDetalle(DetalleCompra detalle) {
        
        String sql = "INSERT INTO `detallecompra` (`cantidad`, `precio`, `idCompra`, `idProducto`)"
                + " VALUES (?, ?, ?, ?); ";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getPrecioUnitario());
            ps.setInt(3, detalle.getCompra().getId());
            ps.setInt(4, detalle.getProducto().getId());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                detalle.setId(rs.getInt(1));
               JOptionPane.showMessageDialog(null,"Detalle de compra guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla DETALLE DE COMPRA"+ex.getMessage());
        }
    }
    
    
}
