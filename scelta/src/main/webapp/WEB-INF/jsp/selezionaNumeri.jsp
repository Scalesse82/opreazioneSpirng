<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

inserire i due numeri 

<form action="eseguiOperazione">

		<input type="number" name="primo" placeholder="Inserisci il primo numero"><br>
	    <input type="number" name="secondo" placeholder="Inserisci il secondo numero"><br>
	    <input type="hidden"  name="operazione" value=<c:out value = "${operazione}"/>>
		

		<input type="submit" value="Invio">

	</form>

</body>
</html>