/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Producto;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     
     
     public void modificarProveedor (Proveedor proveedor) {
        
        String sql="UPDATE proveedor SET razonSocial=?, domicilio=?, telefono=? WHERE idProveedor=?";

        try {   
            PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1, proveedor.getRazonSocial());
           ps.setString(2, proveedor.getDireccion());
           ps.setInt(3, proveedor.getTelefono());
           ps.setInt(4, proveedor.getId());
            
            int exito = ps.executeUpdate();
            
            if(exito==1){
                  JOptionPane.showMessageDialog(null,"¡Se actualizo el Proveedor!");
              }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla PROVEEDOR");
        }
    }
     
     
      public Proveedor buscarProveedor(int id) {
        Proveedor p = new Proveedor();
        try {
            String busqueda = "SELECT `idProveedor`, `razonSocial`, `domicilio`, `telefono`"
                    + " FROM `proveedor` WHERE idProveedor = ?";
            
            PreparedStatement ps = con.prepareStatement(busqueda);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                p.setId(rs.getInt("idProveedor"));
                p.setRazonSocial(rs.getString("razonSocial"));
                p.setDireccion(rs.getString("domicilio"));
                p.setTelefono(rs.getInt("telefono"));

                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Proveedor.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proveedor. " + ex.getMessage());
        }
        return p;
    }
     
     
      
       public void eliminarProveedor(int id) {
        
        String sql="DELETE FROM `proveedor` WHERE idProveedor = ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
                  JOptionPane.showMessageDialog(null,"Proveedor eliminado");
              }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla PROVEEDOR");
        }
    }
     
    public List<Proveedor> porProducto(int idProducto){
        
        ArrayList<Proveedor> listaProveedores = new ArrayList();
        String sql = "SELECT P.razonSocial AS nombre, P.domicilio AS lugar, P.telefono AS tel "
                 + "FROM proveedor "
                 + "P JOIN compra C ON P.idProveedor = C.idProveedor "
                 + "JOIN detallecompra D ON C.idCompra = D.idCompra "
                 + "JOIN producto PR ON D.idProducto = PR.idProducto "
                 + "WHERE PR.idProducto = ?; ";
         
           try {
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setInt(1, idProducto);
               ResultSet rs = ps.executeQuery();
             
                   while(rs.next()){
                   Proveedor pr = new Proveedor();
                   pr.setRazonSocial(rs.getString("nombre"));
                   pr.setDireccion(rs.getString("lugar"));
                   pr.setTelefono(rs.getInt("tel"));
                   listaProveedores.add(pr);
               }
                   
               
               ps.close();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "El producto no cuenta con proveedor asociado!");
           }
         
         return listaProveedores;
    }
      
}
