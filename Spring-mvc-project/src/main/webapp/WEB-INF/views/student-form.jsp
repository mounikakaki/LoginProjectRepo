<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
 <form:form action="processForm" modelAttribute="student">
 First Name: <form:input path="firstName"/>
 <br><br>
  Last Name : <form:input path="lastName"/>
 <br><br>
 <form:select path="country">
<form:options items="${student.countryOptions}"/>
<%-- <form:option value="India" label="India"/>
 <form:option value="Australia" label="Australia"/>
 <form:option value="France" label="France"/>
 <form:option value="Germany" label="Germany"/>--%>
 </form:select> 
 <br><br>
 Favourite Language:
 Java<form:radiobutton path="language" value="java"/>
 CPP<form:radiobutton path="language" value="CPP"/>
 <br><br>
 
 Operating systems:
 Linux<form:checkbox path="operatingSystems" value="Linux"/>
 Windows<form:checkbox path="operatingSystems" value="windows"/>
 MAC<form:checkbox path="operatingSystems" 	value="Mac"/>
 <br><br>
 <input type="submit" value="submit"/>
 </form:form>

</body>
</html>