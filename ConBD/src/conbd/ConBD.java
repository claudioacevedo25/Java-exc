/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conbd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author claud
 */
public class ConBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ClassNotFoundException,SQLException {
       
     Connection con=DriverManager.getConnection("jdbc:sqlserver://172.16.140.13;databaseName=FinalProg3primer","alumno1w1","alumno1w1");
     Statement st=con.createStatement();// equivalente al command
     ResultSet rs=st.executeQuery("select * from productos");// es como el data reader en .net
     while(rs.next()){
         int id=rs.getInt("id");
         String nombre=rs.getString("nombre");
         float precio=rs.getFloat("precio");
         System.out.println(id+""+nombre+""+precio);
     }
     
        
     con.close();
    }
    
}
