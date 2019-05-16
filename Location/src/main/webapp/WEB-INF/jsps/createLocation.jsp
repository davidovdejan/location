<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create title</title>
</head>
<body>
	<form action="saveLoc" method="post">
		<pre>
		ID:<input type="text" name="id"> 
		CODE:<input type="text" name="code">
		NAME:<input type="text" name="name"> 
		TYPE: URBAN<input type="radio" name="type" value="Urban">
			RURAL<input type="radio" name="type" value="Rural">
			
		<input type="submit" value="SAVE">
		</pre>
	</form>

	${msg}

	<a href="displayLocations">Display all</a>
</body>
</html>