<%@ page import="by.nc.school.dev.web.util.Pages" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page trimDirectiveWhitespaces="true" %>
<jsp:useBean id ="user" scope="session" class="by.nc.school.dev.beans.User" />
<html>
    <head>
        <title>Changing student</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

<body>
    <%@include file="jspElements/_header.jsp" %>
    <div class="container">
        <div class="page-header">
            <h1>Account information</h1>
        </div>

        <div class="row">
            <div class="col-lg-4">
                <p>Login: <c:out value="${user.username}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Role: <c:out value="${user.role}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Surname: <c:out value="${user.surname}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Name: <c:out value="${user.name}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Email: <c:out value="${user.email}"/></p>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4">
                <p>Telephone Number: <c:out value="${user.telephoneNumber}"/></p>
            </div>
        </div>



        <form action="<%=Pages.VIEWS.ACCOUNT.PATH_ABSOLUTE%>" method="POST">
            <input type="hidden" name="command" value="users"/>
            <input type="submit" class="btn navbar-btn" value="Back"/>
        </form>
    </div>
</body>
</html>