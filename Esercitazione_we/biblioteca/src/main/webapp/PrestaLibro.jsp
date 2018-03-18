<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import ="java.util.*,it.sopra.uiip.biblioteca.dao.impl.* ,java.sql.ResultSet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Presta un Libro</title>
</head>
<body bgcolor = "lightblue">
	<%
		String codiceFiscale = request.getParameter("codiceFisc");
		String titolo = request.getParameter("titolo");
		DaoPrestitiImpl prest = new DaoPrestitiImpl();
		DaoLettoriImpl lett = new DaoLettoriImpl();
		
		if(lett.ControllaLettore(codiceFiscale)){
			int idLibro = prest.ControllaDisponibilita(titolo);
			if(idLibro != -1){
				if(prest.PrestaLibro(codiceFiscale, idLibro)){
					%>
					<h1><p align = "center">Libro Prestato</p></h1>
					<p align = "center"><button onclick="window.location.href='index.html'"> torna al menù </button></p>
					<%
				}else{
					%>
					<h1><p align = "center">Libro già prestato a questo lettore</p></h1>
					<p align = "center"><button onclick="window.location.href='index.html'"> torna al menù </button></p>
					<%
				}
			}else{
			%>
			<h1><p align = "center">Libro non disponibile al prestito</p></h1>
			<p align = "center"><button onclick="window.location.href='index.html'"> torna al menù </button></p>
			<%
			}
		}else{
			%>
			<h1><p align = "center">Lettore non presente in archivio</p></h1>
			<p align = "center"><button onclick="window.location.href='index.html'"> torna al menù </button></p>
			<%
		}
	%>
</body>
</html>