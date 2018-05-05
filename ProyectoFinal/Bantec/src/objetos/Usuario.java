/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author FELICIANO
 */
public class Usuario {
    //Datos del usuario
    private int id_usuario;
    private String nombre_usuario;
    private String clave_usuario;
    private int pin_usuario;
    
    //Variables de conexion
    private Connection con;
    private Statement sentencia;
    private String query;
    private String DB_PATH,DB_USER,DB_PASS;
    private int intentosConexion;
    
    public Usuario(){}
    
    public Usuario(String nombreusuario) {
        //Se configura el servidor de BD
        ajustesConexion();
        //Asigna el nombre de usuario al usuario actual
        this.nombre_usuario=nombreusuario;
        this.clave_usuario=null;
        //Descarga los datos del usuario buscado
        obtenerDatosBD();
    }

    public Usuario(int id_usuario, String nombre_usuario, String clave_usuario, int pin_usuario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.clave_usuario = clave_usuario;
        this.pin_usuario = pin_usuario;
    }
    
    
    private void obtenerDatosBD(){
        try {
            query = "SELECT * FROM users WHERE user_name='" + nombre_usuario + "'";

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_PATH, DB_USER, DB_PASS);
            sentencia = con.createStatement();
            ResultSet resultado = sentencia.executeQuery(query);

            while (resultado.next()) {
                this.id_usuario=resultado.getInt("id_user");
                this.clave_usuario = resultado.getString("user_password");
                this.pin_usuario = resultado.getInt("user_pin");

            }
            //showMessageDialog(null, "= "+nombre_usuario+" "+clave_usuario+""+id_usuario+" "+pin_usuario+"\n\n"+DB_PATH+"\n"+DB_USER+"\n"+DB_PASS);
            /*
            while(resultado.next()){
            choice1.add(resultado.getString("nombre_usuario"));
            }
             */

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch(CommunicationsException e){
            this.DB_PATH = "jdbc:mysql://localhost/sic_final";
            this.DB_USER="root";
            this.DB_PASS="";
            
            intentosConexion++;
            if(intentosConexion<2)
                //getDataFromDB(nombre_usuario,clave_usuario);
                obtenerDatosBD();
            else{
                showMessageDialog(null, "Error: El sistema no se encuentra disponible debido a un error en la conexion con el servidor.\n\n Codigo de error: 01LSVE ");
                System.exit(0);
            }
        }catch(SQLException e){
            e.printStackTrace();
            showMessageDialog(null, "Error SQL.");
        }
    }

    
    
    
    
    
    //Setters
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setClave_usuario(String clave_usuario) {
        this.clave_usuario = clave_usuario;
    }

    public void setPin_usuario(int pin_usuario) {
        this.pin_usuario = pin_usuario;
    }
    
    //Getters
    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getClave_usuario() {
        return clave_usuario;
    }

    public int getPin_usuario() {
        return pin_usuario;
    }
    
    
    private void ajustesConexion(){
        //Obtiene las credenciales del servidor
        this.intentosConexion = 0;
        this.DB_PATH = global.Globales.path;
        this.DB_USER= global.Globales.user;
        this.DB_PASS= global.Globales.pass;
    }
    
}
