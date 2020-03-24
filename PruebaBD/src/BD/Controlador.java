/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import Modelo.Producto;
import Modelo.Venta;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Controlador {
    private Connection con;
    
    public void abrirConexion()
    {
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLSERVER;databaseName=Ventas","sa","1347awhy");
        } catch (SQLException ex) {
        }
    }
    public void cerrarConexion()
    {
        try {
            if(con != null && !con.isClosed())
                con.close();
        } catch (SQLException e) {
        }
    }
    
    public ArrayList<Producto> obtenerProducto()
    {
        ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            abrirConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from productos");
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getInt("idProducto"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getFloat("precio"));
                lista.add(p);
            }
            rs.close();
        } catch (SQLException e) {
        }
        finally {
            cerrarConexion();
        }
        return lista;
    }
    
    public ArrayList<Venta>obtenerVentas()
    {
        ArrayList<Venta>lista = new ArrayList<Venta>();
        try {
            abrirConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select v.*,p.nombre from ventas v inner join productos p on v.idProducto = p.idProducto");
            while(rs.next())
            {
                Producto p = new Producto();
                Venta v = new Venta();
                p.setNombre(rs.getString("nombre"));
                v.setId(rs.getInt("idVenta"));
                v.setFecha(rs.getString("fecha"));
                v.setDescuento(rs.getInt("descuento"));
                v.setCantidad(rs.getInt("cantidad"));
                v.setProducto(p);
                
                lista.add(v);
            }
            rs.close();
        } catch (SQLException e) {
        }
        finally {
            cerrarConexion();
        }
        return lista;
    }
    
    public boolean insertarVenta(Venta v)
    {
        boolean insert = false ;
        try {
            abrirConexion();
            String sql = "insert into ventas (fecha,descuento,cantidad,idProducto)values (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, v.getFecha());
            st.setInt(2, v.getDescuento());
            st.setInt(3,v.getCantidad());
            st.setInt(4,v.getProducto().getId());
            st.executeQuery();
            insert = true;
        } catch (SQLException e) {
        }
        finally {
            cerrarConexion();
        }
        return insert;
    }
    public boolean actualizarVenta(Venta v)
    {
        boolean actualizo = false ;
        try {
            abrirConexion();
            String sql = "update ventas set fecha =?,descuento=?,cantidad=?,idProducto=? where idVenta=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, v.getFecha());
            st.setInt(2, v.getDescuento());
            st.setInt(3,v.getCantidad());
            st.setInt(4,v.getProducto().getId());
            st.setInt(5,v.getId());
            st.executeQuery();
            actualizo = true;
        } catch (SQLException e) {
        }
        finally {
            cerrarConexion();
        }
        return actualizo;
    }
    
    public boolean eliminarVenta(int id)
    {
        boolean elimino = false;
        try {
            abrirConexion();
            String sql = "delete ventas where idVenta = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.execute();
            elimino = true;
        } catch (Exception e) {
        }
        finally {
            cerrarConexion();
        }
        return elimino;
    }
}
