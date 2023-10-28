/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
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
        String sqlStock = "UPDATE `producto` SET `stock` = ? WHERE `idProducto` = ?; ";
        try {
            //GUARDAMOS UN NUEVO DETALLE DE COMPRA
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
        
        //GUARDAMOS CAMBIOS EN STOCK PRODUCTO
        int nuevoStock = (obtenerStockActualProducto(detalle.getProducto().getId()))+(detalle.getCantidad());
        PreparedStatement psStock=con.prepareStatement(sqlStock,Statement.RETURN_GENERATED_KEYS);
        psStock.setInt(1, nuevoStock);
        psStock.setInt(2, detalle.getProducto().getId());
        psStock.executeUpdate();;
        psStock.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla DETALLE DE COMPRA"+ex.getMessage());
        }
    }
    
    public DetalleCompra detallePorId(int id) {
    DetalleCompra dc = new DetalleCompra();
    String sql = "SELECT `idDetalle`, `cantidad`, `precio`, `idCompra`, `idProducto` "
            + " FROM `detallecompra` WHERE idCompra = ? ;";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, id);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                Compra compra = new Compra();
                Producto producto = new Producto();
                dc.setId(rs.getInt("idDetalle"));
                dc.setCantidad(rs.getInt("cantidad"));
                dc.setPrecioUnitario(rs.getDouble("precio"));
                compra.setId(rs.getInt("idCompra"));
                dc.setCompra(compra);
                producto.setId(rs.getInt("idProducto"));
                dc.setProducto(producto);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el detalle de compra.");
                // Devolver un objeto DetalleCompra vacío
                return new DetalleCompra();
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder al detalle de compra: " + ex.getMessage());
    }

    return dc;
}
    
  private int obtenerStockActualProducto(int idProducto) {
    String sql = "SELECT `stock` FROM `producto` WHERE `idProducto` = ?";
    int stock=0;
    PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            stock = 0;
            if (rs.next()) {
                stock = rs.getInt("stock");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Problema con el drive ");
        }
 

    return stock;
}  
    
}
