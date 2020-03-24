/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.*;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;


public class ControladorBD {
    
    private Connection con;
    
    private void abrirConexion()
    {
        try
        {
            con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-HUPD7H9\\SQLSERVER;databaseName=Produccion","sa","1347awhy");
        }                                  //jdbc:sqlserver://172.16.140.13;databaseName=Produccion","alumno1w1","alumno1w1
        catch (SQLException ex){}
                
    }
    
    private void cerrarConexion()
    {
        try
        {
            if( con != null && !con.isClosed()) {con.close();}
        }
        catch(SQLException ex){}
    }
    
    public ArrayList<Componente> obtenerComponentes()
    {
        ArrayList <Componente> lista = new ArrayList<Componente>();
        
        try
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from Componentes");
            
            while(rs.next())
            {
                Componente c = new Componente();
                
                c.setCodComponente(rs.getInt("codigo"));
                c.setDescComponente(rs.getString("descripcion"));
                
                lista.add(c);
            }
            rs.close();
        }
        catch(SQLException ex){}
        finally {cerrarConexion();}
        return lista;
    }
    
    public ArrayList<Responsable> obtenerResponsables()
    {
        ArrayList <Responsable> lista = new ArrayList <Responsable>();
        
        try 
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from Responsables");
            
            while (rs.next())
            {
                Responsable r = new Responsable ();
                
                r.setCódigo(rs.getInt("codigo"));
                r.setNombreResponsable(rs.getString("nombre"));
                
                lista.add(r);
            }
            rs.close();
        }
        
        catch(SQLException ex){}
        finally {cerrarConexion();}
        return lista;
                
    }
    
    public ArrayList <Produccion> obtenerProduccion()
    {
        String cadena =
             "Select p.*,c.descripcion,r.nombre\n" +
             "from produccion p join componentes c  on c.codigo = p.codigoComponente join responsables r\n" +
             "on r.codigo = p.codigoResponsable";
        ArrayList <Produccion> lista = new ArrayList <Produccion>();
        try
        {
            abrirConexion();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(cadena);
            
            while (rs.next())
            {
              
              int id = rs.getInt("codigoProduccion");
              int codResp = rs.getInt("codigoResponsable");
              String fecha = rs.getString("fecha");
              int codComp = rs.getInt("codigoComponente");
              int cant = rs.getInt("cantidadProduccion");
              String desc = rs.getString("descripcion");
              String nombre = rs.getString("nombre");
              
               Componente c = new Componente (codComp,desc);
               Responsable r = new Responsable(codResp,nombre);
               
              
              Produccion p = new Produccion (id,r,fecha,c,cant);
              
              lista.add(p);
            }
            rs.close();
        }
        catch(SQLException ex){}
        finally {cerrarConexion();}
        return lista;
    }
    
    public boolean insertarProduccion(Produccion p)
    {
        boolean inserto = false;
        
        try
        {
            abrirConexion();
            String sql = "insert into Produccion (codigoResponsable,fecha,codigoComponente,cantidadProduccion) values (?,?,?,?)";
            
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setInt(1,p.getResponsable().getCódigo());
            st.setString(2,p.getFecha());
            st.setInt(3,p.getComponente().getCodComponente());
            st.setInt(4, p.getCantidadProduccion());
            
            st.executeUpdate();
            
            inserto = true;
        }
        catch(SQLException ex){}
        finally {cerrarConexion();}
        return inserto;
    }
    
    public boolean actualizarProduccion (Produccion p)
    {
        boolean actualizo= false;
        
        try
        {
            abrirConexion();
            String sql = "update produccion \n" +
                         "set  codigoResponsable = ?,\n" +
                         "fecha=?,\n" +
                         "codigoComponente=?,\n" +
                         "cantidadProduccion=?\n" +
                         "where codigoProduccion = ?";
            
            PreparedStatement st = con.prepareStatement(sql);
            
            st.setInt(1,p.getResponsable().getCódigo());
            st.setString(2,p.getFecha());
            st.setInt(3,p.getComponente().getCodComponente());
            st.setInt(4, p.getCantidadProduccion());
            st.setInt(5, p.getCodigoProduccion());
            
            st.execute();
            actualizo = true;
        }
        catch(SQLException ex){}
        finally {cerrarConexion();}
        return actualizo;
    }
    
    public boolean eliminarProduccion(int id)
    {
        boolean elimino = false;
        try
        {
            abrirConexion();
            String sql = "delete Produccion where codigoProduccion = ?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.execute();
            elimino = true;
        }
        catch(SQLException ex){}
        finally{cerrarConexion();}
        return elimino;
    }
}
