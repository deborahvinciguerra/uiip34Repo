<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.util.*,it.sopra.uiip.biblioteca.dao.impl.* ,java.sql.ResultSet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elenco Libri Disponibili</title>
</head>
<body bgcolor = "lightblue">
	<% 
		DaoPrestitiImpl prest = new DaoPrestitiImpl();
		ResultSet rs = prest.ElencoLibriDisponibili();
		
			%>
			<table  align = "center" border = "2" bgcolor = "white">
			<tr>
				<th>titoli</th>
				<th>autori</th>
				<th>numero copie</th>
			</tr>
			<%
			if(rs.next()){
				rs.beforeFirst();
				while(rs.next()){
					int numLibriPrestati = prest.NumeroLibriPrestati(rs.getString(1));
					%>
					<tr>
					 	<td><%=rs.getString(1)  %></td>
					 	<td><%=rs.getString(2)  %></td>
					 	<td><%=rs.getInt(3)-numLibriPrestati %></td>
						
					</tr>
				<%}
			}else{%>
				<h1><p align = "center"><%out.println("Nessun libro disponibile per il prestito!!!"); %></p></h1>
			<%}
		%>
			
		 <tr><td align="center"><button onclick="window.location.href='index.html'"> torna al menù </button></td></tr>
		</table>
			
</body>
</html>