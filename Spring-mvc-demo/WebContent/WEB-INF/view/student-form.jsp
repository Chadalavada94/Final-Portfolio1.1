 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstname" />
		
		<br><br>
	
		Last name: <form:input path="lastname" />
		
		<br><br>
		
		country:
		
		<form:select path="country">
			<form:options items="${theCountryOptions}"/>	
			
			<br>
			
			Fav language 
			java<form:radiobutton path="favlan" value="java"/>
			c#<form:radiobutton path="favlan" value="c#"/>
			php<form:radiobutton path="favlan" value="php"/>
			ruby<form:radiobutton path="favlan" value="ruby"/>
			
			<br><br>
			
			
			Operating Systems:
			
			Linux:<form:checkbox path="operatingsystems" value="linux"/>
			Mac Os<form:checkbox path="operatingsystems" value="Mac os"/>
			Windows:<form:checkbox path="operatingsystems" value="Windows"/>
			
			
			
			
		</form:select> 
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>












