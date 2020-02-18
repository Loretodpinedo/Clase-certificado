<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta productos</title>
<style type="text/css">
table {
	border: 1;
	text-align: center;
}

th {
	text-align: center;
}

td {
	text-align: center;
}
h2 {
text-align: center;

}
</style>
</head>
<body>


	<h2>Da de alta tu producto</h2>

	<form action="doAlta">
	
		<font>Categoria:</font><input type="text" name="categoria"
			placeholder="categoria producto"> ${param.errorCategoria}<br />
		<font>Nombre:</font><input type="text" name="nombre"
			placeholder="nombre producto">${param.errorNombre} <br /> <font>Precio:</font><input
			type="number" name="precio" placeholder="precio producto">
		${param.errorPrecio}<br /> <input type="submit" value="Dar de alta">
	</form>
	${param.mensaje}
	<br />
	

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Categoria</th>
			<th>Nombre</th>
			<th>Precio</th>
		</tr>

		<c:forEach items="${lista}" var="p">
			<tr>
				<td><c:out value="${p.id}"></c:out></td>
				<td><c:out value="${p.categoria}"></c:out></td>
				<td><c:out value="${p.nombre}"></c:out></td>
				<td><c:out value="${p.precio}"></c:out></td>

			</tr>
		</c:forEach>


	</table>

</body>
</html>