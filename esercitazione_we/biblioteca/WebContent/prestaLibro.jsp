<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="libriView.jsp" method="post">
<table>
<tr><td><input type="submit" value="Visualizza Tutti i libri"></td></tr> 
</table>
</form>

<form action="ricercaLibroTitolo.jsp" method="post">
<table>
<tr><th>Ricerca libro per titolo</th></tr>
<tr><td><input type="text" name="titolo"></td></tr>
<tr><td><center><input type="submit" value="Cerca"></center></td></tr> 
</table>
</form>

<form action="ricercaLibroTitoloAutore.jsp" method="post">
<table>
<tr><th>Ricerca libro per autore</th></tr>
<tr><td><input type="text" name="autore"></td></tr>
<tr><td><center><input type="submit" value="Cerca"> </center></td></tr>
</table>
</form>
<form action="prestito.jsp" method="post">
<table>
<tr><th>utente</th><th>autore</th></tr>
<tr><td><input type="text" name="utente"></td>
<td><input type="text" name="autore"></td></tr>
<tr><td colspan="2"><center><input type="submit" value="Presta Libro"></center></td></tr> 
</table>
</form>

<%
	DbAccess db = new DbAccess();
	Connection conn = db.connect();
	LibroDaoImpl lista=new LibroDaoImpl();
	lista.addLibro(conn);
	String titolo=(String)request.getParameter("titolo");
	try
	{
		Vector<Libro> lista_libro=lista.ricercaLibro(conn,titolo);
		%><table>
		<tr>
		<th>idLibro</th>
		<th>Titolo</th>
		<th>Ncopie</th>
		<th>Autori</th>
		</tr>
		<%	for(Libro l:lista_libro)
			{
			%>
		<tr>
		<td><%=l.getIdLibri() %></td>
		<td><%=l.getTitolo() %></td>
		<td><%=l.getnCopie() %></td>
		<td><%=l.getAutore() %></td>
		<% } 
	}
	catch(Exception e)
	{
		%><script> alert("lista vuota")</script><%
	}
	%>
	
</body>
</html>