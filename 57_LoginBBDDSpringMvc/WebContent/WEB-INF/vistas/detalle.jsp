<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalle de la pelicula</title>
<style type="text/css">
h1 {
	color: #024b2e;
	font-family: Bodoni MT Condensed;
	font-size: 40px;
	text-align: center;
}

h3 {
	color: #024b2e;
	font-family: Bodoni MT Condensed;
	font-size: 30px;
	text-align: center;
}
</style>
</head>
<body
	background="${pageContext.request.contextPath}/recursos/libro2.jpg">

	<h1>Detalles de la pelicula ${libro.titulo }</h1>
	<br />
	<h3>Id: ${libro.id}</h3>
	<h3>Titulo: ${libro.titulo}</h3>
	<h3>Autor: ${libro.autor}</h3>
	<h3>Editorial: ${libro.editorial}</h3>
	<h3>Año de publicacion: ${libro.añioPublicacion}</h3>

	<br />
	<form action="alta" style="text-align: center;">
	<input type="submit" value="volver a dar de alta una pelicula"
		style="color: #024b2e; text-align: center">
		</form>
		<form action="listado" style="text-align: center;">
	<input type="submit" value="volver al listado"
		style="color: #024b2e; text-align: center">
		</form>

</body>
</html>