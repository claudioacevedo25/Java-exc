/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import Modelo.producto;
import Modelo.vendedor;

/**
 *
 * @author claud
 */
public class Conexion {
    private static Connection conexion;
    
    public static Connection getConexion(){
        try {
            if(conexion != null || conexion.isClosed()){
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conexion=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-HUPD7H9\\SQLSERVER:53013;databaseName=vendedores","sa","1347awhy");
            }
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;  
    }
    
    
    public ArrayList<vendedor> listarVendedores(){
        Connection c;
        ArrayList<vendedor> lista = new ArrayList<vendedor>();
        try {
            c = Conexion.getConexion();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from vendedores");
            
            while(rs.next()){
                vendedor v = new vendedor();
                v.setId(rs.getInt(1));
                v.setNombre(rs.getString(2));
            }
            c.close();
            st.close();
            rs.close();
            
        } catch (Exception e) {
        }
        return lista;
    }
    
    public ArrayList<producto> listarProductos(){
        Connection c;
        ArrayList<producto> lista = new ArrayList<producto>();
        try {
            c = Conexion.getConexion();
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from productos");
            
            while(rs.next()){
                producto p = new producto();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getFloat(3));
                p.setStock(rs.getInt(4));
            }
            
           c.close();
           st.close();
           rs.close();
        } catch (Exception e) {
        }
        return lista;
    }
     
    
    public void insertarProducto(producto p){
        Connection c;
        try {
            c = Conexion.getConexion();
            PreparedStatement ps = c.prepareStatement("insert into productos values ?,?,?");
            
            ps.setString(1, p.getNombre());
            ps.setFloat(2, p.getPrecio());
            ps.setInt(3, p.getStock());
            
            ps.executeUpdate();
            c.close();
            ps.close();
        } catch (Exception e) {
        }
        
    }
    
    public void insertarVendedor(vendedor v){
        Connection c;
        try {
            c = Conexion.getConexion();
            PreparedStatement ps = c.prepareStatement("insert into vendedores values ?");
            
            ps.setString(1, v.getNombre());
            
            ps.executeUpdate();
            c.close();
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public void eliminarVendedor(int id){
        Connection c;
        try {
            c = Conexion.getConexion();
            PreparedStatement ps = c.prepareStatement("delete vendedores where id = ?");
           
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            c.close();
        } catch (Exception e) {
        }
        
    }
    
    public void eliminarProducto (int id){
        Connection c;
        try {
            c = Conexion.getConexion();
            PreparedStatement ps = c.prepareStatement("delete productos where id = ?");
            
            ps.setInt(1, id);
            ps.executeUpdate();
            
            ps.close();
            c.close();
        } catch (Exception e) {
        }
    }
    
    
}
