<%-- 
    Document   : list-of-inventario
    Created on : 07-15-2015, 07:03:05 PM
    Author     : Jose Eduardo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Informaci&oacute;n de Inventario</h1>
<table border="1px" cellpadding="0" cellspacing="0">
<thead>
<tr>
<th width="10%">id</th><th width="15%">name</th><th width="10%">activo</th>
</tr>
</thead>
<tbody>
    
<c:forEach var="inv" items="${inventario}">
<tr align="center">
        <td>${inv.idInventario}</td>
	<td>${inv.marca}</td>
	<td>${inv.modelo}</td>
	
</tr>
</c:forEach>
</tbody>
</table>
    </body>
</html>
