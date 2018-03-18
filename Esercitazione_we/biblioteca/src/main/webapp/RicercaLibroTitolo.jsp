<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import ="java.util.*,it.sopra.uiip.biblioteca.model.Libri, it.sopra.uiip.biblioteca.dao.impl.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ricerca libro per titolo</title>
</head>
<body bgcolor = "lightblue">
	<%
	String titolo = request.getParameter("titolo");
	DaoLibriImpl libri = new DaoLibriImpl();
	Libri l = libri.ricercaLibroPerTitolo(titolo);
	if(l.getIdLibro() !=  -1){
	%>
	<table  align = "center" border = "2" bgcolor = "white">
		<tr>
			<th>codice libro </th>
			<th>titoli</th>
			<th>autori</th>
			<th>numero copie</th>
		</tr>
		<tr>
			<td><%=l.getIdLibro() %> </td>
			<td><%=l.getTitolo()  %></td>
			<td><%=l.getAutori()  %></td>
			<td><%=l.getNumeroCopie() %></td>
					
		</tr>
		<br>
		<tr><td align="center"><button onclick="window.location.href='index.html'"> torna al menù </button></td></tr>
	</table>
	<%}else{
		%> <h1><p align = "center"><% out.println("Libro non trovato!!!!");%></p></h1>
		<p align = "center"><button onclick="window.location.href='index.html'"> torna al menù </button></p>
	<% }%>
</body>
</html>