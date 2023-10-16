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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
         String sql = "INSERT INTO Producto (nombre, descripcion, precioActual, stock, estado)"
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
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto");
       }
    }
    
    public void modificarProduto (Producto producto) {
        
        String sql="UPDATE producto SET nombre=?, descripcion=?, precioActual=?, stock=? WHERE idProducto=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            
            int exito = ps.executeUpdate();
            
            if(exito==1){
                  JOptionPane.showMessageDialog(null,"¡Se guardo el producto!");
              }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla PRODUCTO");
        }
    }
    
    public void eliminarProducto(int id) {
        
        String sql="UPDATE producto SET estado=0 WHERE idProducto=? ";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
                  JOptionPane.showMessageDialog(null,"Alumno dado baja");
              }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla PRODUCTO");
        }
    }
    
    public List<Producto> productosPorFecha(Date fechaPedido){
        /*
        
        */
        String sql="SELECT P.idProducto, P.nombre, P.descripcion, DC.cantidad FROM producto AS P"+ 
                "INNER JOIN detallecompra AS DC ON P.idProducto = DC.idProducto"+ 
                "INNER JOIN compra AS C ON DC.idCompra = C.idCompra WHERE C.fecha = ?";
        
        ArrayList<Producto> listaProductos= new ArrayList();
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
                Producto producto= new Producto();
                producto.setId(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);
                
                listaProductos.add(producto);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla XXXX");
        }
       
       return listaProductos; 
    }
    
    public List<Producto> Stock0(){
        
        String sql = "SELECT `stock` FROM `producto` WHERE `stock` = 0;";
        ArrayList<Producto> listaProductos= new ArrayList();
        
         PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Producto producto= new Producto();
               
                producto.setNombre(rs.getString("nombre"));  
                producto.setStock(rs.getInt("stock"));
               
                listaProductos.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla XXXX");
        }
         
    
    return listaProductos;
    };
   
        public List<Producto> StockMenor3(){
        
        String sql = "SELECT `stock` FROM `producto` WHERE `stock` < 3;";
        ArrayList<Producto> listaProductos= new ArrayList();
        
         PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Producto producto= new Producto();
               
                producto.setNombre(rs.getString("nombre"));  
                producto.setStock(rs.getInt("stock"));
               
                listaProductos.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla XXXX");
        }
         
    
    return listaProductos;
    };
        
            public List<Producto> StockMayor3(){
        
        String sql = "SELECT `stock` FROM `producto` WHERE `stock` > 3";
        ArrayList<Producto> listaProductos= new ArrayList();
        
         PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Producto producto= new Producto();
               
                producto.setNombre(rs.getString("nombre"));  
                producto.setStock(rs.getInt("stock"));
               
                listaProductos.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla XXXX");
        }
         
    
    return listaProductos;
    };
   
   
}

