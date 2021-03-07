<%--
  Created by IntelliJ IDEA.
  User: marika
  Date: 03.07.2020
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Załóż konto</title>
</head>
<body>
<h1>Załóż konto${addNewUser}</h1>
<form:form method="post" modelAttribute="user">
    Adres e-mail: <form:input path="email" /><br/>
    <form:errors path="email" cssClass="error" /><br/>
    Login: <form:input path="login" /><br/>
    <form:errors path="login" cssClass="error" /><br/>
    Hasło: <form:input path="password" /><br/>
    <form:errors path="password" cssClass="error" /><br/>


    <input type="submit" value="Save">


</form:form>
</body>
</html>