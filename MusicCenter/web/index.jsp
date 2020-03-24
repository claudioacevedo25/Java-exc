<%-- 
    Document   : index
    Created on : 29-nov-2019, 18:10:13
    Author     : claud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.producto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controlador.Conexion"%>
<%    Conexion c = new Conexion();
    ArrayList productos = c.listarProductos();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table class = "table table-striped">
            <tr>
                <th scope="col">ID</td>
                <th scope="col">NOMBRE</td>
                <th scope="col">PRECIO</td>
                <th scope="col">STOCK</td>
            </tr>
           
        </table>
        <a href="ServLet?accion=listar">Listar Productos</a>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>
