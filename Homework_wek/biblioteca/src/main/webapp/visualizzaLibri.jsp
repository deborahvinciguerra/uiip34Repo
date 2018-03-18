<%@page import="model.Autore"%>
<%@page import="persistence.jdbc.AutoreJdbcDAO"%>
<%@page import="persistence.dao.AutoreDAO"%>
<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<%@page import="persistence.dao.LibroDAO"%>
<%@page import="persistence.jdbc.LibroJdbcDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elenco Libri</title>
</head>
<body>

<h1>Elenco libri in biblioteca</h1>
<%
LibroDAO libDao = new LibroJdbcDAO();
AutoreDAO autDao = new AutoreJdbcDAO();
List<Libro> libri = libDao.doRetrieveAll();
%>

<TABLE border=2>
	<TR><TH>Titolo</TH><TH>Autori</TH><TH>Copie</TH></TR>
<%
if (!libri.isEmpty()) {
	for(Libro l:libri) {
		List<Autore> autori = autDao.doRetrieveByLibro(l.getCodice());
%> 
<TR><TD><%=l.getTitolo()%></TD><TD>
<%
for(Autore a:autori) {
%> <%=a.getNome()+" "+a.getCognome()%><BR>	
<%} %><TD><%=l.getnCopie()%></TD></TR>
<%}} %>
</TABLE>

<a href="index.html">Home</a>
</body>
</html>