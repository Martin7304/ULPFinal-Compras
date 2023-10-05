/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class AccesoProducto {
    
    private Connection con=null;
    
    public AccesoProducto(){
    
    con=Conexion.getConexion();
    }
    
    public void guardarProducto(Producto producto){
        
         String sql = "INSERT INTO Productos (nombre, descripcion, precio, stock, estado)"
                 + " VALUES (?, ?, ?, ?, ?)";
        
       try {
           PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, producto.getNombre());
           ps.setString(2, producto.getDescripcion());
           ps.setDouble(3, producto.getPrecioActual());
           ps.setInt(4, producto.getStock());
           ps.setBoolean(5, producto.isEstado());
           ps.executeUpdate();
           
           ResultSet rs=ps.getGeneratedKeys();
           if(rs.next()) {
               
               producto.setId(rs.getInt(1));
               JOptionPane.showMessageDialog(null,"Producto guardado");
           }
           ps.close();
           
       } catch (SQLException ex){
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
       }
    }
    
    
}
