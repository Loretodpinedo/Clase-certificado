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
	color:  #024b2e ;
	font-size: 30px;
}

/* visited link */
a:visited {
	color:  #024b2e ;
	font-size: 30px;
}

/* mouse over link */
a:hover {
	color:  #024b2e ;
	font-size: 30px;
}

/* selected link */
a:active {
	color:  #024b2e ;
	font-size: 30px;
}
</style>

</head>
<body
	background="${pageContext.request.contextPath}/recursos/libro2.jpg">
	<div style="Text-align: center">
		<h1
			style="color:  #024b2e ; font-family: Bodoni MT Condensed; font-size: 80px">Bienvenide
		</h1>
		<h1
			style="color:  #024b2e ; font-family: Bodoni MT Condensed; font-size: 70px">${param.nombre}</h1>
		<h1
			style="color:  #024b2e ; font-family: Bodoni MT Condensed; font-size: 80px">Ya
			estas registrado</h1>

		<h1
			style="color:  #024b2e ; font-family: Bodoni MT Condensed; font-size: 80px">¿Que
			quieres hacer ahora?</h1>

		<a href="alta">Dar de alta un libro</a> <a href="listado">Ver el
			listado de libros</a>
	</div>
</body>
</html>