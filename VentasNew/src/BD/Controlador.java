
package BD;
import Modelo.Producto;
import Modelo.Venta;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class Controlador {
    private Connection con;
    
    private void abrirConexion()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLSERVER;databaseName=Ventas","sa","1347awhy");
        }
        catch(SQLException ex){}
    }
    
    private void cerrarConexion()
    {
        try
        {
            if(con != null && !con.isClosed()){con.close();}
        }
        catch(SQLException ex){}
    }
    
    public ArrayList<Producto> obtenerProducto()
    {
        ArrayList <Producto> lista = new ArrayList<Producto>();
        try
        {
            abrirConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Productos");
            while(rs.next())
            {
                Producto p = new Producto();
                p.setId(rs.getInt("idProducto"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getFloat("precio"));
                lista.add(p);
            }
            rs.close();
        }
        catch(SQLException ex){}
        finally{cerrarConexion();}
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
            while(rs.next())
            {
                Producto p = new Producto ();
                Venta v = new Venta ();
                v.setId(rs.getInt("idVenta"));
                v.setFecha(rs.getString("fecha"));
                v.setDescuento(rs.getFloat("descuento"));
                v.setCantidad(rs.getInt("cantidad"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getFloat("precio"));
                v.setProducto(p);
                lista.add(v);
            }
            rs.close();
        }
        catch(SQLException ex){}
        finally{cerrarConexion();}
        return lista;
    }
    
    public boolean insertarVenta(Venta v)
    {
        boolean inserto = false;
        try
        {
            abrirConexion();
            String sql = "insert into Ventas (fecha,descuento,cantidad,idProducto)values(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,v.getFecha());
            st.setFloat(2,v.getDescuento());
            st.setInt(3, v.getCantidad());
            st.setInt(4,v.getProducto().getId());
            st.executeQuery();
            inserto = true;
        }
        catch(SQLException ex){}
        finally{cerrarConexion();}
        return inserto;
    }
    
    public boolean actualizarVentas(Venta v)
    {
        boolean actualizo = false;
        try
        {
            abrirConexion();
            String sql = "update Ventas set fecha=?,descuento=?,cantidad=?,idProducto=? where idVenta=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,v.getFecha());
            st.setFloat(2,v.getDescuento());
            st.setInt(3, v.getCantidad());
            st.setInt(4,v.getProducto().getId());
            st.setInt(5,v.getId());
            st.executeQuery();
            actualizo = true;
        }
        catch(SQLException ex){}
        finally{cerrarConexion();}
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
           st.executeQuery();
           elimino = true;
           
       } catch (SQLException ex) {
       }
       finally {
           cerrarConexion();
       }
       return elimino;
   }
}
