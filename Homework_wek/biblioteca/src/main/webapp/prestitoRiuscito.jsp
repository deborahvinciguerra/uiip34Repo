<%@page import="model.Tessera"%>
<%@page import="model.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prestito</title>
</head>
<body>
<%Libro libro = (Libro) session.getAttribute("libro");
Tessera tessera = (Tessera)session.getAttribute("tessera");%>
<h1>Il libro <%=libro.getTitolo() %> è stato prestato all'utente <%=tessera.getNome()+ " " + tessera.getCognome() %></h1>
<a href="index.html">Home</a>
</body>
</html>