 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
 <html>
 <head>customer registration page
 </head>
 
 <style>
 .error
 {
 color:red;
 }
 </style>
 <body>
 
 	<form:form action="processForm" modelAttribute="customer">
 	
 	first name: <form:input path="firstname"/>
 	<br>
 	last name(*): <form:input path="lastname"/>
 	<form:errors path="lastname" cssClass="error"/>
 	
 	POSTAL CODE(*): <form:input path="postalCode"/>
 	<form:errors path="postalCode" cssClass="error"/>
 	
 	Course CODE: <form:input path="courseCode"/>
 	<form:errors path="courseCode" cssClass="error"/>
 	
 	<input type="submit" value="submit"/>
 	</form:form>
 
 </body>
 </html>