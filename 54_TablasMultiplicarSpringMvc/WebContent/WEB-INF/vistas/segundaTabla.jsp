<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Segunda tabla</title>
</head>
<body
	background="http://localhost:8080/54_TablasMultiplicarSpringMvc/numbers.jpg">

	<table style="font-size: 30px">

		<%
			for (int i = 1; i <= 10; i++) {
		%>

		<tr>

			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>1 *
			<td>
			<td><%=i%>
			<td>
			<td>= <%=i * 8%>
			<td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>2 *
			<td>
			<td><%=i%>
			<td>
			<td>= <%=i * 8%>
			<td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>3 *
			<td>
			<td><%=i%>
			<td>
			<td>= <%=i * 8%>
			<td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>4 *
			<td>
			<td><%=i%>
			<td>
			<td>= <%=i * 8%>
			<td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>5 *
			<td>
			<td><%=i%>
			<td>
			<td>= <%=i * 8%>
			<td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>6 *
			<td>
			<td><%=i%>
			<td>
			<td>= <%=i * 8%>
			<td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>5 *
			<td>
			<td><%=i%>
			<td>
			<td>= <%=i * 8%>
			<td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>5 *
			<td>
			<td><%=i%>
			<td>
			<td>= <%=i * 8%>
			<td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>