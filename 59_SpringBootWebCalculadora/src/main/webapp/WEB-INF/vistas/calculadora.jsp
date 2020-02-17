<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>calculadora</title>
</head>
<body>
<h2>Bienvenides a la mejor calculadora del mundo</h2>

<form action="doOperacion">
<font>Primer operando: </font><input type="number" value="${param.numero1 }" name="num1" placeholder="primer operando">
<br/>
<font>Segundo operando: </font><input type="number" value="${param.numero2 }" name="num2" placeholder="primer operando">
<br/>
<h3>¿Que operacion quieres hacer?</h3>
<br/>
<select name="operador">
<option value=""></option>
<option value="suma">Sumar</option>
<option value="resta">Restar</option>
<option value="multiplicacion">Multiplicar</option>
<option value="division">Dividir</option>
</select>
<br/>
	<input type="submit" value="Calcular">
</form>

<c:if test = "${not empty param.resultado }">
	<h3>El resultado de ${param.operador} los numeros ${param.numero1} y ${param.numero2} es ${param.resultado}</h3>
</c:if>

<a href="doTabla">Ver todas las operaciones</a>
<!--<c:if href="doTabla"> 
<hr>
<h3>${}</h3>
</c:if>
-->
</body>
</html>