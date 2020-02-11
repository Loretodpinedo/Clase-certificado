<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta</title>
</head>
<body
	background="${pageContext.request.contextPath}/recursos/sandia.jpg">

	<h1
		style="color: #027647; font-family: Bodoni MT Condensed; font-size: 80px">
		<i>Da de alta tu libro</i>
	</h1>

	<form action="doAlta">

		<font color="#027647" size="5">Titulo:</font><input type="text"
			name="titulo" placeholder="Inserte el titulo" /> <br /> <font
			color="#027647" size="5"> Año de publicacion:</font><input
			type="text" name="anio" placeholder="Inserte el año de publicacion" />
		<br /> <font color="#027647" size="5"> Autor:</font><input
			type="text" name="autor" placeholder="Inserte el nombre del autor" />
		<br /> <font color="#027647" size="5"> Editorial:</font><input
			type="text" name="editorial" placeholder="Inserte la editorial" />
			<br />
			
			<font color="#027649" size="5">${param.mensaje}</font>
			<br/>
			
			 <input	type="submit" value="Enviar">
	</form>
	<form action="inicio">
		<input type="submit" value="Volver">
	</form>
	
	<a href="listado" style="color: #027650; font-family:  Bodoni MT Condensed; font-size: 40px ">Ver todos los libros</a>


</body>
</html>