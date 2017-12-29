<%@ page import="by.nc.school.dev.web.util.Pages" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/static/css/bootstrap-theme.css"/>" rel="stylesheet">
<link href="<c:url value="/static/css/style.css"/>" type="text/css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <nav class="navbar navbar-fixed-top navbar-toggleable-md navbar-inverse bg-inverse">
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>


            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="nav navbar-nav mr-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="<%=Pages.VIEWS.HOME.PATH_ABSOLUTE%>">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <sec:authorize access="hasRole('PROFESSOR')">
                    <li class="nav-item">
                        <a class="nav-link" href="<%=Pages.USER.ALL_USERS.PATH_ABSOLUTE%>">Admin page</a>
                    </li>
                    </sec:authorize>

                    <sec:authorize access="hasAnyRole('PROFESSOR','STUDENT')">
                        <li class="nav-item">
                            <a class="nav-link" href="<%=Pages.VIEWS.ACCOUNT.PATH_ABSOLUTE%>">Profile</a>
                        </li>
                    </sec:authorize>
                    <sec:authorize access="hasAnyRole('PROFESSOR','STUDENT')">
                        <li class="nav-item">
                            <a class="nav-link" href="<%=Pages.STUDENT.ALL_STUDENTS.PATH_ABSOLUTE%>">View all students</a>
                        </li>
                    </sec:authorize>
                    <sec:authorize access="hasAnyRole('PROFESSOR','STUDENT')">
                        <li class="nav-item">
                            <a class="nav-link" href="<%=Pages.PROFESSOR.ALL_PROFESSORS.PATH_ABSOLUTE%>">View all professors</a>
                        </li>
                    </sec:authorize>

                    <li class="nav-item">
                        <a class="nav-link" href="<%=Pages.VIEWS.ABOUT.PATH_ABSOLUTE%>">About</a>
                    </li>
                    <sec:authorize access="!isAuthenticated()">
                        <li class="nav-item">
                            <a class="nav-link" href="<%=Pages.USER.LOGIN.PATH_ABSOLUTE%>">Log in</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%=Pages.USER.REGISTER.PATH_ABSOLUTE%>">Sign up</a>
                        </li>
                    </sec:authorize>
                    <sec:authorize access="isAuthenticated()">
                        <li class="nav-item">
                            <a class="nav-link" href="<%=Pages.USER.LOGOUT.PATH_ABSOLUTE%>">Logout</a>
                        </li>
                    </sec:authorize>
                </ul>
            </div>
        </nav>
