<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page trimDirectiveWhitespaces="true" %>
<html>
    <head>
        <title>Changing student</title>
        <link href="/css/style.css" rel="stylesheet">
        <link href="/css/bootstrap.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

<body>
    <jsp:include page="/jsp/navigationBar.jsp"/>
    <div class="container">
        <div class="page-header">
            <h1>Account information</h1>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Id: <c:out value="${user_id}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Login: <c:out value="${sessionScope.username}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Surname: <c:out value="${sessionScope.surname}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Name: <c:out value="${sessionScope.name}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Email: <c:out value="${email}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Telephone Number: <c:out value="${sessionScope.telephoneNumber}"/></p>
            </div>
        </div>



        <form action="${pageContext.request.contextPath}/controller" method="POST">
            <input type="hidden" name="command" value="users"/>
            <input type="submit" class="btn navbar-btn" value="Назад"/>
        </form>
    </div>
</body>
</html>