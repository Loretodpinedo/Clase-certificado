<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Datos</title>

</head>
<body background="sandia.jpg">

<h1 style="color:   #51030d; font-family: Calibri (Cuerpo); font-size: 60px; text-align: center;">Detalle de ${us.nombre}</h1>

	<table style="color:   #51030d; font-family: Calibri (Cuerpo); font-size: 30px; text-align: center;">
		<tr>
			<td>Nombre:</td>
			<td>${param.nombre}</td>
		</tr>
		<tr>
			<td>Edad:</td>
			<td>${param.edad}</td>
		</tr>
		<tr>
			<td>Direccion:</td>
			<td>${param.direccion}</td>
		</tr>
		<tr>
			<td>Hobbies:</td>
			<td>${param.hobbies}</td>
		</tr>
	</table>
	
	<a href="loguin.jsp?nombre=${us.nombre}">Volver a inicio</a>

</body>
</html>