/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bd;
import Modelo.Producto;
import Modelo.Venta;
import java.sql.*;
import java.util.ArrayList;


public class Controlador {
    
    private Connection con;
    
    public void abrir()
    {
        try {
             con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLSERVER;databaseName=Ventas","sa","1347awhy");
        } catch (SQLException ex) {
        }
    }
    
    public void cerrar()
    {
        try {
            if(con != null && !con.isClosed()){
                con.close();
            }
        } catch (SQLException ex) {
        }
    }
    
    public ArrayList<Producto> obtenerProducto()
    {
        ArrayList<Producto> lista = new ArrayList<Producto>();
        try
        {
            abrir();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from Productos");
            while(rs.next())
            {
                Producto p = new Producto ();
                p.setId(rs.getInt("idProducto"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getFloat("precio"));
                lista.add(p);
            }
            rs.close();
        }
        catch(SQLException ex){}
        finally{cerrar();}
        return lista;
    }
    
    public ArrayList<Venta>obtenerVenta()
    {
        ArrayList<Venta> lista = new ArrayList<Venta>();
        try
        {
            abrir();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select v.*,p.nombre from ventas v join productos p on v.idProducto=p.idProducto");
            while(rs.next())
            {
                Producto p = new Producto();
                Venta v = new Venta();
                v.setId(rs.getInt("idVenta"));
                v.setFecha(rs.getString("fecha"));
                v.setDescuento(rs.getFloat("descuento"));
                v.setCantidad(rs.getInt("cantidad"));
                p.setNombre(rs.getString("nombre"));
                v.setProducto(p);
                lista.add(v);
            }
            rs.close();
        }
        catch(SQLException ex){}
        finally{cerrar();}
        return lista;
    }
    
    public boolean insertarVenta(Venta v)
    {
        boolean inserto = false;
        try
        {
            abrir();
            String sql = "Insert into ventas (fecha,descuento,cantidad,idProducto) values (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, v.getFecha());
            st.setFloat(2, v.getDescuento());
            st.setInt(3, v.getCantidad());
            st.setInt(4, v.getProducto().getId());
            
            st.executeQuery();
            inserto = true;
            
        }
        catch(SQLException ex){}
        finally{cerrar();}
        return inserto;
    }
    
    public boolean actualizarVenta(Venta v)
    {
        boolean actualizo = false;
        try
        {
            abrir();
            String sql = "update ventas set fecha=?,descuento=?,cantidad=?,idProducto=? where idVenta=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, v.getFecha());
            st.setFloat(2, v.getDescuento());
            st.setInt(3, v.getCantidad());
            st.setInt(4, v.getProducto().getId());
            st.setInt(5,v.getId());
            st.executeQuery();
            actualizo = true;
            
        }
        catch(SQLException ex){}
        finally{cerrar();}
        return actualizo;
    }
    
    public boolean eliminarVenta(int id)
    {
        boolean elimino = false ;
        try
        {
            abrir();
            String sql = "delete ventas where idVenta=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.execute();
            elimino = true;
        }
        catch(SQLException ex){}
        finally{cerrar();}
        return elimino;
    }
}
