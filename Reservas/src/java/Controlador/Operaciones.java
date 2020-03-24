/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Ciudad;
import Modelo.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author claud
 */
public class Operaciones {
    Connection c;
    
    public ArrayList<Reserva> listarReservas(){
        
        ArrayList<Reserva> list = new ArrayList<Reserva>();
        
        try {
            c = Conexion.getConexion();
            Statement st = c.createStatement();
            ResultSet rs=st.executeQuery("select * from reservas");
            while(rs.next()){
                Reserva r = new Reserva();
                r.setIdReserva(rs.getInt(1));
                r.getCiudadOrigen().setIdCiudad(rs.getInt(2));
                r.getCiudadDestino().setIdCiudad(rs.getInt(3));
                r.setCodDescuento(rs.getString(4));
                r.setAdultos(rs.getInt(5));
                r.setMenores(rs.getInt(6));
                r.setTotal(rs.getFloat(7));
                
                list.add(r);
                
            }
            rs.close();
            c.close();
            
        } catch (Exception e) {
            System.out.println("Error de conexion"); 
        }
        
        return list;
    }
    
    public void insertarReserva(Reserva r){
        try {
            c= Conexion.getConexion();
            String sql = "insert into reservas (idOrigen,idDestino,codDescuento,adultos,menores,total) values (?,?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setInt(1, r.getCiudadOrigen().getIdCiudad());
            ps.setInt(2, r.getCiudadDestino().getIdCiudad());
            ps.setString(3, r.getCodDescuento());
            ps.setInt(4, r.getAdultos());
            ps.setInt(5, r.getMenores());
            ps.setFloat(6, r.getTotal());
            
            ps.executeUpdate();
            c.close();  
            ps.close();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Ciudad> listarCiudad(){
        
        ArrayList<Ciudad> list = new ArrayList<Ciudad>();
        
        try {
            c = Conexion.getConexion();
            Statement st = c.createStatement();
            ResultSet rs=st.executeQuery("select * from ciudades");
            while(rs.next()){
                Ciudad r = new Ciudad();
                r.setIdCiudad(rs.getInt(1));
                r.setNombre(rs.getString(2));
                
                list.add(r);
                
            }
            rs.close();
            c.close();
            
        } catch (Exception e) {
            System.out.println("Error de conexion"); 
        }
        
        return list;
    }
}
