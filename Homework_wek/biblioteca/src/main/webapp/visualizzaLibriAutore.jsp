<%@page import="model.Autore"%>
<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Libri autore</title>
</head>
<body>
<%
	List<Libro> libri =(List<Libro>) session.getAttribute("libri");
	Autore autore = (Autore)session.getAttribute("autore");
	if (autore != null) {
%>

<h1>Elenco libri scritta da <%=autore.getNome()+" "+autore.getCognome() %></h1>

<ul>
<%
	
if(libri != null){
for(Libro libro:libri){
%>
<li><%=libro.getTitolo() %></li>
<%}
}%> </ul> 

<% } else {
	%> <h1>Autore non presente in archivio</h1>
	<%} %>


<a href="index.html">Home</a>

</body>
</html>