<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="gray">
<center>
<h1>LOGIN</h1>
<form action ="LoginServlet" method="post">
<input type="text" placeholder="Enter Your User Name" name="uname"><br>
<input type="password" placeholder="Enter Your Password" name="upass"><br>
<input type="submit" value="Login">
</form>
</center>
</body>
</html>