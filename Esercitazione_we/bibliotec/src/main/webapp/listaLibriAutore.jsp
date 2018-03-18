<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-size:25%" align="center" background="a.jpg">
<%@ page import="model.*"
		import="dao.*"
		import="daoimpl.*"
		import="java.util.Vector" %>
		

		<div style= "position: absolute;top: 130px; left: 255px;margin: 50px; 
border: 3px solid #156; padding:70px; 
width: 600px;background-color: #cce; ">
		<TABLE align=center border=5>
		<TR><TH width ="300px"><H3>NUMERO DI COPIE</H3></TH>
			<TH width ="300px"><H3>TITOLO</H3></TH>
			<TH width ="300px"><H3>AUTORE</H3></TH></TR>

			<%	HttpSession sess= request.getSession(true);
			Vector <Libro> l= (Vector<Libro>) sess.getAttribute("listaPerAutore");

				int i=0;
				while (i<l.size())
				{
				out.println("<TR><TD>"+l.get(i).getNCopie()+"</TD>"+
							"<TD>"+l.get(i).getTitolo()+"</TD>"+
							"<TD>"+l.get(i).getAutore()+"</TD></TR>");
					i++;
				}
				%>
			
		</TABLE><BR><bR>
		<a href ="index.html">Menu</a></div>

</body>
</html>