<%@page import="persistence.jdbc.AutoreJdbcDAO"%>
<%@page import="persistence.dao.AutoreDAO"%>
<%@page import="model.Autore"%>
<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ricerca libro</title>
</head>
<body>

<h1>Risultato della ricerca</h1>
<%
AutoreDAO autDao = new AutoreJdbcDAO();
List<Libro> libri = (List<Libro>)session.getAttribute("libri");
%>

<TABLE border=2>
	<TR><TH>Titolo</TH><TH>Autori</TH></TR>
<%
if (!libri.isEmpty()) {
	for(Libro l:libri) {
		session.setAttribute("libro", l);
		List<Autore> autori = autDao.doRetrieveByLibro(l.getCodice());
%> 
<TR><TD><%=l.getTitolo()%></TD><TD>
<%
for(Autore a:autori) {
%> <%=a.getNome()+" "+a.getCognome()%><BR>	
<%} %></TR>
<%}} %>
</TABLE>

<%if (!libri.isEmpty()){ %>

<h3>Richiesta prestito libro</h3>

<form action="PrestaLibro" method="post">
	<input type="number" name="numeroTessera" placeholder="Numero tessera utente">
	<input type="submit" value="Richiedi">
</form>

<%} %>
<a href="index.html">Home</a>

</body>
</html>