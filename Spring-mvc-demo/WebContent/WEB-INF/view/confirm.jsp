<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>Student-confirmation</head>

<body>

the Student COnfirmed : ${student.firstname} ${student.lastname}
country :${student.country}

<br>
fav lang: ${student.favlan}

<br><br>
<ul>
<c:forEach var="temp" items="${student.operatingsystems}">
<li> ${temp}</li>
</c:forEach>
</ul>
<br><br>

</body>
</html>