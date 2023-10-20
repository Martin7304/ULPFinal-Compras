/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class AccesoProveedor {
    
       private Connection con=null;
    
    public AccesoProveedor(){
    
    con=Conexion.getConexion();
    }
    
     public void guardarProveedor(Proveedor proveedor){
        
         String sql = "INSERT INTO proveedor( razonSocial, domicilio, telefono)"
                 + " VALUES (?,?,?)";
                
        
       try {
           PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, proveedor.getRazonSocial());
           ps.setString(2, proveedor.getDireccion());
           ps.setInt(3, proveedor.getTelefono());
           ps.executeUpdate();
           
           ResultSet rs=ps.getGeneratedKeys();
           if(rs.next()) {
               
               proveedor.setId(rs.getInt(1));
               JOptionPane.showMessageDialog(null,"Proveedor guardado");
           }
           ps.close();
           
       } catch (SQLException ex){
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla proveedor");
       }
    }
}
