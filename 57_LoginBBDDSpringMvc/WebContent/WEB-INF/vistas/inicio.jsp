<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
<style>
/* unvisited link */
a:link {
	color: #027647;
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
	background="${pageContext.request.contextPath}/recursos/sandia.jpg">
	<div style="Text-align: center">
		<h1
			style="color: #027647; font-family: Bodoni MT Condensed; font-size: 80px">Bienvenide
		</h1>
		<h1
			style="color: #027647; font-family: Bodoni MT Condensed; font-size: 70px">${param.nombre}</h1>
		<h1
			style="color: #027647; font-family: Bodoni MT Condensed; font-size: 80px">Ya
			estas registrado</h1>

		<h1
			style="color: #027647; font-family: Bodoni MT Condensed; font-size: 80px">¿Que
			quieres hacer ahora?</h1>

		<a href="doAlta">Dar de alta un libro</a> <a href="listado">Ver el
			listado de libros</a>
	</div>
</body>
</html>