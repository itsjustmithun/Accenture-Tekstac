<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- TODO : WRITE YOUR CODE HERE -->
    <h1>Greetings !</h1>
    <form action="GreetingServlet" method="post">
    Enter your name: <input type="text" name="yourName" size="20">
    <input type="submit" name="submit" value="Call Servlet" />
	</form>
</body>
</html>