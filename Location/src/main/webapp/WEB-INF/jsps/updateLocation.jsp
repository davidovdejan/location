<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update location</title>
</head>
<body>
	<form action="updateLoc" method="post">
		<pre>
		ID:<input type="text" name="id" value="${location.id }" readonly/> 
		CODE:<input type="text" name="code" value="${location.code }"/>
		NAME:<input type="text" name="name" value="${location.name }"/> 
		TYPE: URBAN<input type="radio" name="type" value="Urban"value="${location.type=='URBAN'? 'checked':'' }"/>
			RURAL<input type="radio" name="type" value="Rural"value="${location.type=='RURAL'?'checked':'' }"/>
			
		<input type="submit" value="UPDATE">
		</pre>
	</form>

</body>
</html>