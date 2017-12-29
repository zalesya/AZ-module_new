<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="by.nc.school.dev.web.util.Pages" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Add student</title>
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
        <div id="wrapper">
            <c:set var="path" value="<%=Pages.STUDENT.ADD_STUDENT.PATH_ABSOLUTE%>"/>
            <c:set var="button" value="Add student"/>
            <%@include file="../jspElements/addStudentForm.jsp"%>
        </div>
    </body>
</html>
