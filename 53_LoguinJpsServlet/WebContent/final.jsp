<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

div {
text-align: center;
}

tr {
style="color:   #51030d; font-family: Calibri (Cuerpo); font-size: 30px; text-align: center;"
}
</style>
</head>
<body background="sandia.jpg">

<h1 style="color:   #51030d; font-family: Calibri (Cuerpo); font-size: 60px; text-align: center;">Detalle de ${c.nombre}</h1>

	<table>
		<tr>
			<td>Nombre:</td>
			<td>${c.nombre}</td>
		</tr>
		<tr>
			<td>Edad:</td>
			<td>${c.edad}</td>
		</tr>
		<tr>
			<td>Peso:</td>
			<td>${c.peso}</td>
		</tr>
	</table>
	
	<a href="loguin.jsp?nombre=${c.nombre}">Volver a inicio</a>

</body>
</html>