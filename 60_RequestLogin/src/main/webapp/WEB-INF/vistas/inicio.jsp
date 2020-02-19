<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>inicio</title>
<style type="text/css">
table {
	text-align: center;
	font-family: Bookman Old Style;
	color: #1cb1dc;
}
</style>
</head>
<body>

	<form action="doPedido">
		<h3
			style="color: #1cb1dc; font-family: Bookman Old Style; font-size: 30px">Selecciona
			los productos</h3>


		<c:forEach items="${lista}" var="producto">

			<input type="radio" name="producto" value="${producto.id}">${producto.nombre} - ${producto.precio}

		</c:forEach>
<br/>
		<input type="submit" value="Hacer pedido">
	</form>

	<h3
		style="color: #1cb1dc; font-family: Bookman Old Style; font-size: 30px; text-align: center;">Tu
		pedido</h3>
		
	<table border="1">
		<tr>
			<th> Producto </th>
			<th> Precio </th>
			<th> Unidades </th>
		</tr>
		<c:forEach items="${listaPedido}" var="p">
			<tr>
				<td><c:out value="${p.nombre}"></c:out></td>
				<td><c:out value="${p.precio}"></c:out></td>
				<td>1</td>
			</tr>
		</c:forEach>


	</table>
</body>
</html>