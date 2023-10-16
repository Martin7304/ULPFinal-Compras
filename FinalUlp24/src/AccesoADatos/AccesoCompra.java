
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Compra;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
          /* ps.setProveedor(1, compra.getProveedor());
           ps.setDate(4, Date.valueOf(compra.getFechaPedido()));*/
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
    

   
    
}