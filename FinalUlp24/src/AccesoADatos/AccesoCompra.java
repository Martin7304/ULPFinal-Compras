
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Compra;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class AccesoCompra {
    
    private Connection con=null;
    
    public AccesoCompra(){
    
    con=Conexion.getConexion();
    }
    
    public void guardarCompra(Compra compra){
        
         String sql = "INSERT INTO `compra`(`idProveedor`, `fecha`)"
                 + " VALUES (?, ?)";
        
       try {
           PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, compra.getProveedor().getId());
           ps.setDate(2, Date.valueOf(compra.getFechaPedido()));
           ps.executeUpdate();
           
           ResultSet rs=ps.getGeneratedKeys();
           if(rs.next()) {
               
               compra.setId(rs.getInt(1));
               JOptionPane.showMessageDialog(null,"compra guardado");
           }
           ps.close();
           
       } catch (SQLException ex){
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla compra");
       }
    }
 
    public Compra porCompra(int id){
        Compra c = new Compra();
        String sql = "SELECT `idProveedor`, `fecha` FROM `compra` WHERE idCompra = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
             ResultSet rs=ps.executeQuery();
             
              if (rs.next()) {
                  Proveedor proveedor = new Proveedor();
                  proveedor.setId(rs.getInt("idProveedor"));
                  c.setProveedor(proveedor);
                  c.setFechaPedido(rs.getDate("fecha").toLocalDate());
                  
              } else {
                JOptionPane.showMessageDialog(null, "No existe ela compra.");
            }
             
            ps.close(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compras. " + ex.getMessage());
        }
       return c; 
    }
   
    
       public Compra porFecha(LocalDate fecha){
        Compra c = new Compra();
        String sql = "SELECT `idCompra`, `idProveedor` FROM `compra` WHERE `fecha` = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
             ps.setDate(1, Date.valueOf(fecha));
             ResultSet rs=ps.executeQuery();
             
              if (rs.next()) {
                  Proveedor proveedor = new Proveedor();
                  proveedor.setId(rs.getInt("idProveedor"));
                  c.setProveedor(proveedor);
                  c.setId(rs.getInt("idCompra"));
                  
              } else {
                JOptionPane.showMessageDialog(null, "No existe ela compra.");
            }
             
            ps.close(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Compras. " + ex.getMessage());
        }
       return c; 
    }
   
    
}