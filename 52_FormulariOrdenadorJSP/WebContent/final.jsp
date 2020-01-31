<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pedido</title>
<style>
th {
	font-size: 60px;
	font-family: Baskerville Old Face;
	color: #270213;
	text-align: center;
}

td {
	font-size: 50px;
	font-family: Baskerville Old Face;
	color: #7a053c;
	text-align: center;
}
</style>
</head>
<body background="fondo.jpg">

	<table style="width: 100%;">
		<tr>
			<th>Datos del cliente</th>
			<th>Datos del ordenador</th>
		</tr>
		<tr>
			<td>Nombre: ${cliente.nombre}</td>
			<td>Procesador: ${pc.procesador} </td>
		</tr>
		<tr>
			<td>Direccion: ${cliente.direccion}</td>
			<td>Ram: ${pc.ram}</td>
		</tr>
		<tr>
			<td>Email: ${cliente.email}</td>
			<td>${pc.listaComponentes}</td>
		</tr>
		<tr>
			<td>${pc.comentarios}</td>
		</tr>
	</table>

Cliente: ${cliente}
</br>
Pc: ${pc}

</body>
</html>