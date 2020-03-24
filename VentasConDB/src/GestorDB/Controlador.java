/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorDB;

import Modelo.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author claud
 */
public class Controlador {
    
     private Connection con;

     private void abrirConexion()
     {
        try
        {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLSERVER;databaseName=Ventas","sa", "1347awhy");
        }
        catch (SQLException ex){}
     }
     
     private void cerrarConexion()
     {
         try
         {
             if(con !=null && !con.isClosed())
                 con.close();
         }
         catch (SQLException ex){}
     }
     
     public ArrayList<Producto> obtenerProducto()
     {
         ArrayList<Producto> lista = new ArrayList<Producto>();
         
         try
         {
             abrirConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM PRODUCTOS");
             
             while(rs.next()){
                 Producto p = new Producto();
                 p.setIdProducto(rs.getInt("idProducto"));
                 p.setNombre(rs.getString("nombre"));
                 p.setPrecio(rs.getFloat("precio"));
                 
                 lista.add(p);
             }
             rs.close();
         }
         
         catch(SQLException ex){}
         finally {
             cerrarConexion();
         }
         return lista;
     }
     
     
     public ArrayList<Venta> obtenerVentas()
     {
         ArrayList<Venta> lista = new ArrayList<Venta>();
         try
         {
             abrirConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT v.*, p.nombre, p.precio FROM ventas v inner join productos p on v.idProducto = p.idProducto");
             
             while(rs.next()){
                
                 int id = rs.getInt("idVenta");
                 String fecha= rs.getString("fecha");
                 float descuento = rs.getFloat("descuento");
                 int cantidad = rs.getInt("cantidad");
                 int idProducto = rs.getInt("idProducto");
                 String nombre = rs.getString("nombre");
                 float precio = rs.getFloat("precio");
                 
                 Producto p = new Producto(idProducto,nombre,precio);
                 Venta v = new Venta(fecha, descuento,cantidad,p);
                 v.setIdVenta(id);
                 
                 lista.add(v);
             }
             rs.close();
         }
         catch (SQLException ex){}
         finally{
             cerrarConexion();
         }
         return lista;
     }
     
     public boolean insertarVenta(Venta v)
     {
         boolean inserto = false;
         try
         {
             abrirConexion();
             String sql = "INSERT INTO VENTAS (fecha, descuento, cantidad, idProducto) VALUES (?,?,?,?)";
             PreparedStatement st = con.prepareStatement(sql);
             
             st.setString(1, v.getFecha());
             st.setFloat(2,v.getDescuento());
             st.setInt(3, v.getCantidad());
             st.setInt(4,v.getProducto().getIdProducto());
             
             st.execute();
             inserto = true;
         }
         catch (SQLException ex){}
         finally {
             cerrarConexion();
         }
         
         return inserto;  
     }
     
     public boolean actualizarVenta(Venta v)
     {
         boolean actualizar = false;
         try
         {
             abrirConexion();
            String sql = "UPDATE VENTAS SET fecha=?,descuento=?,cantidad=?,idProducto=? WHERE idVenta=?";
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setString(1, v.getFecha());
             st.setFloat(2,v.getDescuento());
             st.setInt(3, v.getCantidad());
             st.setInt(4,v.getProducto().getIdProducto());
             
            st.execute();
            actualizar = true;
         }
         catch (SQLException ex){}
         finally {
             cerrarConexion();
         }
         return actualizar;
     }
     
     
     public boolean eliminarVenta(int id)
     {
         boolean elimino = false;
         try 
         {
             abrirConexion();
             String sql = "DELETE VENTAS WHERE idVenta = ?";
             PreparedStatement st = con.prepareStatement(sql);
             st.setInt(1, id);
             st.execute();
             elimino = true;
         }
         catch (SQLException ex){}
         finally {
             cerrarConexion();
         }
         return elimino;
     }
}
