<%@ page import="by.nc.school.dev.web.util.Pages" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page trimDirectiveWhitespaces="true" %>

<html>
<head>
    <title>List of professors</title>
    <link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/bootstrap-theme.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/style.css"/>" type="text/css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<div class="container">
    <jsp:useBean id="professors" scope="request" type="java.util.List" class="by.nc.school.dev.beans.Professor"/>
    <jsp:useBean id="subjects" scope="request" type="java.util.List" class="by.nc.school.dev.beans.Subject"/>
    <c:if test="${!empty professors}">
    <div class="page-header">
        <h1>List of professors</h1>
    </div>
    <table width="700px" class="table">
        <tr>
            <td class="col-md-2 ">
                <form role="form" action="<%=Pages.PROFESSOR.ALL_PROFESSORS.PATH_ABSOLUTE%>" method="GET">
                    <button type="submit" class="btn btn-md btn-success">Show all</button>
                </form>
            </td>
        </tr>
    </table>
    <br/>
    <p class="ps">Чтобы произвести действия над студентом - кликните в левом столбце</p>
    <table id="#studenttable" border="2" width="700px" cellspacing="2" cellpadding="2" class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Surname</th>
            <th>Name</th>
            <th>Email</th>
            <th>Telephone number</th>
            <th>Science degree</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="professor" items="${professors}">
            <tr>
                <td class="col-md-2 ">
                    <form action="<%=Pages.PROFESSOR.EDIT_PROFESSOR.PATH_ABSOLUTE%>">
                        <button type="submit" class="btn btn-primary" value="Edit"></button>
                        <c:out value="${professor.id}"/>
                    </form>
                    <form action="<%=Pages.PROFESSOR.DELETE_PROFESSOR.PATH_ABSOLUTE%>">
                        <button type="submit" class="btn btn-sm btn-danger" value="Delete professor">X</button>
                    </form>
                </td>
                <td class="col-md-3">
                    <c:out value="${professor.surname}"/>
                </td>
                <td class="col-md-3">
                    <c:out value="${professor.name}"/>
                </td>
                <td class="col-md-3">
                    <c:out value="${professor.email}"/>
                </td>
                <td class="col-md-3">
                    <c:out value="${professor.telephoneNumber}"/>
                </td>
                <td class="col-md-1">
                    <c:out value="${professor.scienceDegree}"/>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <form action="<%=Pages.PROFESSOR.ADD_PROFESSOR.PATH_ABSOLUTE%>">
        <input type="submit" class="btn btn-primary" value="Add"/>
    </form>

</div>
</c:if>
<c:if test="${empty professors}">
    <div class="page-header">
        <h1>No professors</h1>
    </div>
    <div class="row">
        <div class="col-md-1">
            <form action="<%=Pages.PROFESSOR.ADD_PROFESSOR.PATH_ABSOLUTE%>">
                <input type="submit" class="btn btn-primary" value="Add professor"/>
            </form>
        </div>
    </div>
</c:if>

</body>
</html>