package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSQL {
    Connection conn=null;
    String url="jdbc:postgresql://localhost/empresa";
    String usuario = "postgres";
    String clave = "Marla_1921";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver"); 
            conn=DriverManager.getConnection(url,usuario,clave);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa","Conexion",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion Fallida"+e,"Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
    
    public void Cerrar(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Conexion cerrada","desconexion",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion no ha sido cerrada","desconexion",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
