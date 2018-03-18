<%@page import="model.Prestito"%>
<%@page import="java.util.List"%>
<%@page import="persistence.jdbc.AutoreJdbcDAO"%>
<%@page import="persistence.jdbc.LibroJdbcDAO"%>
<%@page import="persistence.dao.LibroDAO"%>
<%@page import="persistence.dao.AutoreDAO"%>
<%@page import="persistence.jdbc.PrestitoJdbcDAO"%>
<%@page import="persistence.dao.PrestitoDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prestiti</title>
</head>
<body>

<h1>Elenco libri prestati</h1>
<%
LibroDAO libDao = new LibroJdbcDAO();
AutoreDAO autDao = new AutoreJdbcDAO();
PrestitoDAO pDao = new PrestitoJdbcDAO();
List<Prestito> prestiti = pDao.doRetrieveAll();
%>

<TABLE border=2>
	<TR><TH>Libro</TH><TH>Utente</TH></TR>
<%
if (!prestiti.isEmpty() && prestiti != null) {
	for(Prestito p:prestiti) {
%> 
<TR><TD><%=p.getLibro().getTitolo()%></TD><TD><%=p.getTessera().getNome()+" "+p.getTessera().getCognome()%></TD></TR>
<%}} %>
</TABLE>

<a href="index.html">Home</a>

</body>
</html>