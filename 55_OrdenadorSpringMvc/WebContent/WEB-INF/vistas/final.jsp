<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
			<td>Nombre: ${pedido.nombreCliente}</td>
			<td>Pedido:  </td>
		</tr>
		<tr>
			<td>Direccion: ${pedido.dirCliente}</td>
			<td> Procesador: ${pedido.pc.procesador}</td>
		</tr>
		<tr>
			<td>Email: ${pedido.emailCliente}</td>
			<td> Ram: ${pedido.pc.ram}</td>
			
		</tr>
		<tr>
			<td>${pedido.comentarios}</td>
			<td> Componentes: ${pedido.pc.listaComponentes}</td>
		</tr>
	</table>



</body>
</html>