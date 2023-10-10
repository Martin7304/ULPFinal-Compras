package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="24_provemax";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion() {}
    
    public static Connection getConexion() {
        
        if (connection ==null){
             
            try {
                Class.forName("org.mariadb.jdbc.Driver"); 
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                //JOptionPane.showMessageDialog(null, "Conectado");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "error cargar Driver");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error de conexion");
            }
        }
        return connection;
    }
        /*
    
    FUNCIONALIDADES GENERALES                              // VISTAS menu bar
                                                        PRODUCTOS           COMPRAS
    Registrar productos                             /// registro            ¡nueva compra!
    Realizar las Compras a proveedores              /// detall producto     detalles de compras  > segun fecha
    Detalle de Compra                               ///     > stock mínimo                       > segun proveedor 
    Administrar Proveedor                                   > mas comprados entre...             > segun compra
                                                                  
                                                                    PROVEEDORES
    OTROS                                                     // registro
                                                              // detall proveedor > segun producto
    
    ⮚	Todos los productos de una compra en una fecha específica.
    ⮚	Todas las compras a un Proveedor P  
    ⮚	Todos los productos de una compra en particular. 
    ⮚	Mostrar qué proveedores, proveen el producto X.
    ⮚	Aquellos productos que sean los más comprados entre fechas
    ⮚	Aquellos productos están por debajo del stock mínimo
    
    */
    
}
