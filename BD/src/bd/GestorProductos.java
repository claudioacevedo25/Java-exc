/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import java.util.ArrayList;

/**
 *
 * @author claud
 */
public class GestorProductos {
    
    public void insertar (Producto nuevo) throws ClassNotFoundException,SQLException{
        Connection con=DriverManager.getConnection("jdbc:sqlserver://172.16.140.13;databaseName=FinalProg3primer","alumno1w1","alumno1w1");
        Statement st=con.createStatement();
        
    }
    
    public ArrayList <Producto> obtenerProducto(){
        ArrayList<Producto> lista= new ArrayList<Producto>();
        try{
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://172.16.140.13;databaseName=FinalProg3primer","alumno1w1","alumno1w1");
            Statement st=conn.createStatement();
            ResultSet 
        }
        
    }
}
