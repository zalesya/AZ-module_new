<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Student</title>
    <link href="<c:url value="http://cdnjs.cloudflare.com/ajax/libs/select2/4.0.0/css/select2.min.css"/>" rel="stylesheet"/>
    <link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/bootstrap-theme.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/style.css"/>" type="text/css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<%@include file="../jspElements/navigationBar.jsp"%>
<jsp:useBean id="student" class="by.nc.school.dev.beans.Student"/>
<div id="wrapper">
    <script src="http://cdnjs.cloudflare.com/ajax/libs/select2/4.0.0/js/select2.min.js"></script>
    <c:if test="${error != null}">
        <div style="margin: 10px" class="alert alert-danger" >
                ${error}
        </div>
    </c:if>
    <div class="content" style="margin-left: 10px">
        <p>Surname: ${student.surname}</p>
        <p>Name: ${student.name}</p>
        <p>Email: ${student.email}</p>
        <p>Telephone number: ${student.telephoneNumber}</p>
        <p>Number record book: ${student.numberRecordBook}</p>
        <p>Course number: ${student.courseNumber}</p>
        <p>Average score: ${student.averageScore}</p>
        <p>Student's list of subjects study: ${student.listStudentSubjectsStudy}</p>

        <%@include file="../jspElements/editStudentForm.jsp"%>
    </div>
</div>

</body>

</html>