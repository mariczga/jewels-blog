<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Jewellery</title>
</head>
<a href="logUser.jsp" >Zaloguj /</a>
<a href="/user/add"> Zarejestruj się</a>

<h1 style="text-align: center">SIGN JEWELERY</h1><br>
<a href="/content/add">Dodaj wpis</a>
<a>          </a>
<a href="/about" >ABOUT</a>

<h1>Lista wpisów</h1>


    <c:forEach items="${contents}" var="contents">
        <tr>
            <td><b><c:out value="${contents.title}"></c:out></b></td>
            <td>${contents.contentText}</td>
        </tr>
    </c:forEach>



<body>
</body>
</html>
