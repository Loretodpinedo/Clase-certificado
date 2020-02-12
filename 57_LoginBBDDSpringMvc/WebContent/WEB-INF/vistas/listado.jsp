<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de libros</title>
<style type="text/css">
th {
	color: #024b2e;
	font-family: Bodoni MT Condensed;
	font-size: 40px
}

td {
	color: #024b2e;
	font-family: Bodoni MT Condensed;
	font-size: 30px
}

/* unvisited link */
a:link {
	color: #024b2e;
	font-size: 30px;
}

/* visited link */
a:visited {
	color: #027646;
	font-size: 30px;
}

/* mouse over link */
a:hover {
	color: #027648;
	font-size: 30px;
}

/* selected link */
a:active {
	color: #0276476;
	font-size: 30px;
}
</style>
</head>
<body
	background="${pageContext.request.contextPath}/recursos/libro2.jpg">

	<table style="margin-left: auto; margin-right: auto;" border="1">
		<tr>

			<th>Titulo</th>
			<th>Autor</th>
			<th>Editorial</th>
			<th>Detalles</th>
		</tr>
		<c:forEach items="${listaLibros}" var="libro">
			<tr>
				<td>${libro.titulo}</td>
				<td>${libro.autor}</td>
				<td>${libro.editorial}</td>
				<td><a href="detallePorLibro?titulo=${libro.titulo}">Pincha
						para ver detalles del libro</a></td>
			</tr>
		</c:forEach>

	</table>
	<br/>
<form action="alta" style="text-align: center;">
	<input type="submit" value="volver a dar de alta una pelicula"
		style="color: #024b2e; text-align: center">
		</form>
</body>
</html>