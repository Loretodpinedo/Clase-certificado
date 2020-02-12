<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta</title>

</head>
<body
	background="${pageContext.request.contextPath}/recursos/libro2.jpg">

	<h1
		style="color: #024b2e; font-family: Bodoni MT Condensed; font-size: 80px;">
		<i>Da de alta tu libro</i>
	</h1>

	<form action="doAlta"
		style="color: #024b2e; font-family: Bodoni MT Condensed; font-size: 60px;">


		Titulo:<input type="text" name="titulo"
			placeholder="Inserte el titulo" /> <br /> Año de publicacion:<input
			type="text" name="anio" placeholder="Inserte el año de publicacion" />
		<br /> Autor:<input type="text" name="autor"
			placeholder="Inserte el nombre del autor" /> <br /> Editorial:<input
			type="text" name="editorial" placeholder="Inserte la editorial" /> <br />

		<font color="#027649" size="5">${param.mensaje}</font> <br /> <input
			type="submit" value="Enviar">
	</form>
	<form action="inicio">
		<input type="submit" value="Volver">
	</form>

	<a href="listado"
		style="color: #024b2e; font-family: Bodoni MT Condensed; font-size: 40px">Ver
		todos los libros</a>


</body>
</html>