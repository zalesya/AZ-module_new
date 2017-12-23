<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %>

<html>
<head>
    <title>Users</title>
    <link href="/css/style.css" rel="stylesheet">
    <link href="/css/bootstrap.css" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
<jsp:include page="/jsp/navigationBar.jsp"/>
<div class="container">
    <jsp:useBean id="users" scope="request" type="java.util.List" class="java.util.ArrayList"/>
    <div class="page-header">
        <h1>List of users</h1>
    </div>
    ${sessionScope.vaeee}
    <br/>
    <p class="ps">Click in the left column to perform actions on the user.</p>
    <table id="#matchtable" border="2" width="700px" cellspacing="2" cellpadding="2" class="table table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Login</th>
                <th>Surname and Name</th>
                <th>Role</th>
                <th>Email</th>
                <th>Telephone Number</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td class="col-md-2 ">
                        <form action="${pageContext.request.contextPath}/controller" method="POST">
                            <input type="hidden" name="user_id" value="<c:out value="${user.id}"/>"/>
                            <button type="submit" class="btn btn-sm btn-primary" name="command"
                                    value="redirect_to_edit_user"><c:out value="${user.id}"/></button>
                            <button type="submit" class="btn btn-sm btn-danger" name="command" value="delete_user">X</button>
                        </form>
                    </td>
                    <td class="col-md-7">
                        <c:out value="${user.login}"/>
                    </td>
                    <td class="col-md-3">
                        <c:out value="${user.surname}"/> &nbsp <c:out value="${user.name}"/>
                    </td>
                    <td class="col-md-3">
                        <c:out value="${user.role}"/>
                    </td>
                    <td class="col-md-3">
                        <c:out value="${user.email}"/>
                    </td>
                    <td class="col-md-3">
                        <c:out value="${user.telephoneNumber}"/>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <form action="${pageContext.request.contextPath}/controller" method="POST">
        <input type="hidden" name="command" value="users"/>
        <input type="submit" class="btn navbar-btn" value="Back"/>
    </form>
</div>

</body>
</html>