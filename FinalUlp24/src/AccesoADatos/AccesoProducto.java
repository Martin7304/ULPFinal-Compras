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
import java.time.LocalDate;
import java.time.ZoneId;
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
            ps.setInt(5, producto.getId());
            
            int exito = ps.executeUpdate();
            
            if(exito==1){
                  JOptionPane.showMessageDialog(null,"¡Se guardo el producto!");
              }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla PRODUCTO");
        }
    }
    
    public Producto buscarProducto(int id) {
        
        Producto p = new Producto();
        ///VALIDAR QUE EL ID RECIBIDO POR PARAMETRO SEA MAYOR A CERO
        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "ID de producto no válido.");
            return p;
        }
    
        try {
            String busqueda = "SELECT `idProducto`, `nombre`, `descripcion`, `precioActual`, `stock`, `estado`"
                    + " FROM `producto` WHERE idProducto= ? AND estado = 1";
            
            PreparedStatement ps = con.prepareStatement(busqueda);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                p.setId(rs.getInt("idProducto"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecioActual(rs.getDouble("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Producto.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto. " + ex.getMessage());
        }
        return p;
    }
    
    
    public void eliminarProducto(int id) {
        
        String sql="UPDATE producto SET estado=0 WHERE idProducto=? ";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
                  JOptionPane.showMessageDialog(null,"Producto dado baja");
              }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla PRODUCTO");
        }
    }
    
    public List<Producto> productosPorFecha(Date fechaPedido) {
        /*
        
         */ 
        
        String sql = "SELECT P.idProducto, P.nombre, P.descripcion, DC.cantidad FROM producto AS P"
                + "INNER JOIN detallecompra AS DC ON P.idProducto = DC.idProducto"
                + "INNER JOIN compra AS C ON DC.idCompra = C.idCompra WHERE C.fecha = ?";

        ArrayList<Producto> listaProductos = new ArrayList();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);

                listaProductos.add(producto);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla XXXX");
        }

        return listaProductos;
    }

    public List<Producto> stockMinimo(int seleccion) {
        ArrayList<Producto> listaProductos = new ArrayList();
        
        if (seleccion == 0) {

             String sql = "SELECT `nombre`, `stock` FROM `producto` WHERE `stock` = 5;";
            PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Producto producto = new Producto();
                    
                    producto.setNombre(rs.getString("nombre"));
                    producto.setStock(rs.getInt("stock"));
                    listaProductos.add(producto);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla PRODUCTO" + ex.getMessage());
            }
                return listaProductos;

        } else if (seleccion == 1) {

            String sql2 = "SELECT `nombre`, `stock` FROM `producto` WHERE `stock` < 3;";
            PreparedStatement ps2;
            try {
                ps2 = con.prepareStatement(sql2);
                ResultSet rs = ps2.executeQuery();
                while (rs.next()) {
                    Producto producto = new Producto();
                    
                    producto.setNombre(rs.getString("nombre"));
                    producto.setStock(rs.getInt("stock"));
                    listaProductos.add(producto);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla PRODUCTO" + ex.getMessage());
            }
                return listaProductos;

        }
        
        if (seleccion == 2) {
            String sql3 = "SELECT `nombre`, `stock` FROM `producto` WHERE `stock` > 3 AND `stock` < 7";
            PreparedStatement ps3;
            try {
                ps3 = con.prepareStatement(sql3);
                ResultSet rs = ps3.executeQuery();
                while (rs.next()) {
                    Producto producto = new Producto();
                    
                    producto.setNombre(rs.getString("nombre"));
                    producto.setStock(rs.getInt("stock"));
                    listaProductos.add(producto);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla PRODUCTO" + ex.getMessage());
            }
                return listaProductos;
            
        }
        //RETORNO FINAL
        return listaProductos;
        }

         /*
        SELECT P.nombre, SUM(DC.cantidad)
        FROM producto AS P
        JOIN detallecompra AS DC ON P.idProducto = DC.idProducto
        JOIN compra AS C ON DC.idCompra = C.idCompra
        WHERE C.fecha BETWEEN '2023-08-20' AND '2023-10-05'
        GROUP BY P.nombre DESC;
        
        RETORNO > no devuelve la info solicitada según los nombres de los atributos de la tabla,
        sino las nuevos atributos instanciados en la consulta realizada para representar dicha informacón
        
        producto.setNombre(rs.getString("NombreProducto"));
        producto.setStock(rs.getInt("CantidadComprada"));
        
        */// TABLA DEVUELVE >> nombre y cantidad de productos en orden decendente 
        
    public List<Producto> masComprados (LocalDate fecha1, LocalDate fecha2) {
        
        ArrayList<Producto> listaProductos = new ArrayList();
        String sql = "SELECT P.nombre AS nombre, SUM(DC.cantidad) AS cantidad " +
"        FROM producto AS P " +
"        JOIN detallecompra AS DC ON P.idProducto = DC.idProducto " +
"        JOIN compra AS C ON DC.idCompra = C.idCompra " +
"        WHERE C.fecha BETWEEN ? AND ? " +
"        GROUP BY P.nombre DESC; ";
        
      
        
        try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(fecha1));
        ps.setDate(2, Date.valueOf(fecha2));
        ResultSet rs = ps.executeQuery();
        
            while (rs.next()) {
                
               Producto producto = new Producto();
               producto.setNombre(rs.getString("nombre"));
               producto.setStock(rs.getInt("cantidad"));
               listaProductos.add(producto);
               
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla PRODUCTO" + ex.getMessage());
        }
           
        return listaProductos;
        
    }
    public List<Producto> listarProductos(){
        
        ArrayList<Producto> listaPr = new ArrayList<>();
        String sql="SELECT idProducto, nombre FROM producto WHERE estado = 1";
    
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt("idProducto"));
                p.setNombre(rs.getString("nombre"));
                listaPr.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla PRODUCTO");
        }
        
        
        return listaPr;
    }
}
// armar el objeto y añadirlo a la lista
                // el SELC devuelve nombre y cantidad solamente
                // a la info solicitada en el SELECT, la agrupamos en una nueva celda/atributo declarada
