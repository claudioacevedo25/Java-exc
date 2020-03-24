<%-- 
    Document   : listar
    Created on : 30-nov-2019, 14:57:02
    Author     : claud
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.producto"%>
<%@page import="Controlador.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Productos</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>PRECIO</th>
                        <th>STOCK </th>
                    </tr>
                </thead>
               
                <tbody>
                    <g:forEach items="${vecProductos}" var="prod">
                        
                        <tr>
                            <td>${prod.id}</td>
                            <td>${prod.nombre}</td>                       
                            <td><a href="servletProductos?dat=${prod.id}" class="btn btn-outline-success" name="editar">EDITAR</a></td>
                            <td>
                                <form method="POST" action="listar">    
                                    <input type="hidden" value="${prod.id}" name="txt_idEliminar" id="txt_idEliminar">
                                    <input type="submit" value="ELIMINAR" class="btn btn-outline-danger">
                                </form>                      
                            </td>
                        </tr>


                    </g:forEach>
                </tbody>
            </table>

        </div>
    </body>
</html>
