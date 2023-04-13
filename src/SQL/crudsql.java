package SQL;
import com.Vista.Inicio;
import com.Vista.Login;
import com.clases.Prueba;
import com.clases.Usuarios;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class crudsql extends ConexionSQL{
    java.sql.Statement st;
    ResultSet rs;
    Prueba pru = new Prueba();
    Usuarios usua = new Usuarios();
            
    public void insertar(String puesto, String piso, String marca, String modelo, String placa,String propietario, String color){
        try {
            Connection conexion=conectar();
            st =conexion.createStatement();
            String sql= "insert into "+piso+"(propietario,marca,modelo,color,placa,puesto,piso,hora_llegada) values('"+propietario+"','"+marca+"','"+modelo+"','"+color+"','"+placa+"','"+puesto+"','"+piso+"',CURRENT_TIMESTAMP);"
                    + "insert into todo(propietario,marca,modelo,color,placa,puesto,piso,hora_llegada) values('"+propietario+"','"+marca+"','"+modelo+"','"+color+"','"+placa+"','"+puesto+"','"+piso+"',CURRENT_TIMESTAMP);";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar "+e, "mensaje", JOptionPane.ERROR_MESSAGE);           
        }
    }
    
    public void Borrar(String placa, String piso){
        try {
            Connection conexion=conectar();
            st=conexion.createStatement();
            String sql= "DELETE FROM "+piso+" where placa = '"+placa+"';"
                    + "DELETE FROM todo where placa = '"+placa+"';";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha Borrado correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar "+e, "mensaje", JOptionPane.ERROR_MESSAGE);           
        }
    }
    
    public void buscar(String placa){
        try {
            Connection conexion=conectar();
            st=conexion.createStatement();
            String sql= "SELECT * FROM todo WHERE placa = '"+placa+"';";
            rs=st.executeQuery(sql);
            if (rs.next()){
                pru.setPropietario(rs.getString("propietario"));
                pru.setColor(rs.getString("color"));
                pru.setPuesto(rs.getString("puesto"));
                pru.setPiso(rs.getString("piso"));
                pru.setMarca(rs.getString("marca"));  
                pru.setModelo(rs.getString("modelo"));
                pru.setPlaca(rs.getString("placa"));
                pru.setHora_llegada(rs.getString("hora_llegada"));
                
            }else{
                pru.setPropietario("");
                pru.setColor("");
                pru.setPuesto("");
                pru.setPiso("");
                pru.setMarca("");  
                pru.setModelo("");
                pru.setPlaca("");
                pru.setHora_llegada("");
                JOptionPane.showMessageDialog(null, "No se encontro registro ", "Sin registro", JOptionPane.ERROR_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL SISTEMA DE BUSQUEDA"+e, "mensaje", JOptionPane.ERROR_MESSAGE);           
        }      
    } 
    
    public void buscarUsua(){
        try {
            Usuarios usua = new Usuarios();
            Connection conexion=conectar();
            st=conexion.createStatement();
            String sql= "SELECT * FROM login;";
            rs=st.executeQuery(sql);
            if (rs.next()){
                usua.setNombre(rs.getString("nombre"));
                usua.setCorreo(rs.getString("correo"));
                usua.setUsuario(rs.getString("usuario"));
                usua.setContraseña(rs.getString("contraseña"));
                usua.setRoll(rs.getString("roll"));  
                
            }else{
                usua.setNombre("");
                usua.setCorreo("");
                usua.setUsuario("");
                usua.setContraseña("");
                usua.setRoll("");  
                JOptionPane.showMessageDialog(null, "No se encontro registro ", "Sin registro", JOptionPane.ERROR_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL SISTEMA DE BUSQUEDA"+e, "mensaje", JOptionPane.ERROR_MESSAGE);           
        }      
    } 
    
    public void buscarCarro(String Npuesto, String Piso){
        try {
            Connection conexion=conectar();
            st=conexion.createStatement();
            String sql= "SELECT * FROM "+Piso+" WHERE puesto = '"+Npuesto+"';";
            rs=st.executeQuery(sql);
            if (rs.next()){
                pru.setPropietario(rs.getString("propietario"));
                pru.setColor(rs.getString("color"));
                pru.setPuesto(rs.getString("puesto"));
                pru.setPiso(rs.getString("piso"));
                pru.setMarca(rs.getString("marca"));  
                pru.setModelo(rs.getString("modelo"));
                pru.setPlaca(rs.getString("placa"));
                pru.setHora_llegada(rs.getString("hora_llegada"));
                
            }else{
                pru.setPropietario("");
                pru.setColor("");
                pru.setPuesto("");
                pru.setPiso("");
                pru.setMarca("");  
                pru.setModelo("");
                pru.setPlaca("");
                pru.setHora_llegada("");
                JOptionPane.showMessageDialog(null, "No se encontro registro ", "Sin registro", JOptionPane.ERROR_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL SISTEMA DE BUSQUEDA"+e, "mensaje", JOptionPane.ERROR_MESSAGE);           
        }
    }     
    
    public void buscarLogin(String usuario, String contraseña){
        try {
            Connection conexion=conectar();
            st=conexion.createStatement();
            String sql= "SELECT * FROM login WHERE usuario = '"+usuario+"' and contraseña = '"+contraseña+"';";
            rs=st.executeQuery(sql);
            if (rs.next()){
                usua.setUsuario(rs.getString("usuario"));
                usua.setContraseña(rs.getString("contraseña"));
                usua.setRoll(rs.getString("roll"));
                Inicio ini = new Inicio();
                ini.setVisible(true);
                
            }else{
                usua.setUsuario("");
                usua.setContraseña("");
                usua.setRoll("");
                JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO", "Sin registro", JOptionPane.ERROR_MESSAGE);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN EL SISTEMA DE BUSQUEDA"+e, "mensaje", JOptionPane.ERROR_MESSAGE);           
        }      
    } 
    
    public void insertarLogin(String usuario, String contraseña, String roll,String nombre, String correo){
        try {
            Connection conexion=conectar();
            st =conexion.createStatement();
            String sql= "insert into login(usuario,contraseña,roll,nombre,correo) values('"+usuario+"','"+contraseña+"','"+roll+"','"+nombre+"','"+correo+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha guardado el usuario correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar "+e, "mensaje", JOptionPane.ERROR_MESSAGE);           
        }
    }
    
    public void BorrarUsuario(String id){
        try {
            Connection conexion=conectar();
            st=conexion.createStatement();
            String sql= "DELETE FROM login where id = '"+id+"';";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha Borrado correctamente", "mensaje", JOptionPane.INFORMATION_MESSAGE);           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar "+e, "mensaje", JOptionPane.ERROR_MESSAGE);           
        }
    }
}

