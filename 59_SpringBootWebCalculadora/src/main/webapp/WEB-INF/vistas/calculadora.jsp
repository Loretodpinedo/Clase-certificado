<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>calculadora</title>
</head>
<body>
<h2>Bienvenides a la mejor calculadora del mundo</h2>

<form action="ControladorOperacion">
<font>Primer operando: </font><input type="number" value="num1" placeholder="primer operando">
<br/>
<font>Segundo operando: </font><input type="number" value="num2" placeholder="primer operando">
<br/>
<h3>¿Que operacion quieres hacer?</h3>
<br/>
<select name="operador">
<option value=""></option>
<option value="suma">Suma</option>
<option value="resta">Resta</option>
<option value="multiplicacion">Multiplicacion</option>
<option value="division">Division</option>
</select>
<br/>
	<input type="submit" value="Calcular">
</form>

<!-- 
<h3>El resultado es ${}</h3>
 -->
</body>
</html>