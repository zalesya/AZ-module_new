<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="by.nc.school.dev.web.util.Pages" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/static/css/bootstrap-theme.css"/>" rel="stylesheet">
<link href="<c:url value="/static/css/style.css"/>" type="text/css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<%@include file="jspElements/navigationBar.jsp"%>
<div class="container sidenav-outer">
    <div class="sidenav">
        <ul class="nav flex-column" id="professorNav">
            <li class="nav-item">
                <a class="nav-link" href="<%=Pages.STUDENT.ALL_STUDENTS.PATH_ABSOLUTE%>">
                    <i class="fa fa-bed" aria-hidden="true"></i> Students</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=Pages.PROFESSOR.ALL_PROFESSORS.PATH_ABSOLUTE%>">
                    <i class="fa fa-list-alt" aria-hidden="true"></i> Professors</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=Pages.SUBJECT.ALL_SUBJECTS_STUDY.PATH_ABSOLUTE%>">
                    <i class="fa fa-newspaper-o" aria-hidden="true"></i> Subjects</a>
            </li>
        </ul>
    </div>
</div>