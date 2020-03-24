/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServLet;

import Controlador.Conexion;
import Modelo.producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class listar extends HttpServlet {

    String listar ="vistas/listar.jsp";
    String add="vistas/add.jsp";
    String edit="vistas/edit.jsp";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet listar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet listar at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Conexion con=new Conexion();
        request.setAttribute("vecMaterias", con.listarProductos());
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/listar.jsp");
        rd.forward(request, response);     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Conexion con=new Conexion();
    producto p=new producto();
    p.setId(Integer.parseInt(request.getParameter("txt_idEliminar")));
    con.eliminarProducto(p.getId());
    request.setAttribute("vecProductos", con.listarProductos());
    RequestDispatcher rd=getServletContext().getRequestDispatcher("/listar.jsp");
    rd.forward(request, response);
      
    }
}
