/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import java.sql.Connection;

/**
 *
 * @author Mi PC
 */
public class AccesoDetalle {
    private Connection con=null;
    
    public AccesoDetalle(){
    
    con=Conexion.getConexion();
    }
    
    
    
}
