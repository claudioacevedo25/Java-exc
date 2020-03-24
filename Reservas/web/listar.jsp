<%-- 
    Document   : listar
    Created on : 01-dic-2019, 11:21:37
    Author     : claud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listar reservas</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>ORIGEN</th>
                    <th>DESTINO</th>
                    <th>COD_RESERVA</th>
                    <th>MAYORES</th>
                    <th>MENORES</th>
                    <th>TOTAL</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaReserva}" var="r">
                    <tr>
                        <td>${r.idReserva}</td>
                        <td>${r.ciudadOrigen}</td>
                        <td>${r.ciudadDestino}</td>
                        <td>${r.codDescuento}</td>
                        <td>${r.adultos}</td>
                        <td>${r.menores}</td>
                        <td>${r.total}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
