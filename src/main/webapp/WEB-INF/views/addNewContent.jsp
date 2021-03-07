<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj nowy Wpis</title>
</head>
<body>
<h1>Dodaj nowy wpis ${addNewContent}</h1>
<form:form method="post" modelAttribute="content">
    Tytul: <form:input path="title" /><br/>
    <form:errors path="title" cssClass="error" /><br/>
    Tresc: <form:input path="contentText" /><br/>
    <form:errors path="contentText" cssClass="error" /><br/>
    Autor: <form:select itemValue="id" itemLabel="email"
                        path="user.id" items="${userList}"/>


    <input type="submit" value="Save">


</form:form>
</body>
</html>