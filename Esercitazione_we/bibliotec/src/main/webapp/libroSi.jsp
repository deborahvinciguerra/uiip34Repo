<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-size:25%" align="center" background="a.jpg">
<div style= "position: absolute;top: 80px; left: 400px;margin: 50px; border: 3px solid #156; padding:30px; 
width: 400px;background-color: #cce; ">
<%		HttpSession sess = request.getSession(true);
	String nome= (String) sess.getAttribute("nome");
	String cognome= (String) sess.getAttribute("cognome");
	String titolo= (String) sess.getAttribute("titolo");

 %>
<font color="green"><h2><%out.print(nome+" "+cognome); %> ha preso in prestito <%out.print(titolo); %>  </h2></font>
<a href ="index.html">Menu</a>
</body>
</html>