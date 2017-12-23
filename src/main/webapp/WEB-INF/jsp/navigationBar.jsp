<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <link href="<c:url value="/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/css/style.css"/>" type="text/css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

    <body>

        <nav role="navigation" class="navigationBar navbar-default navbar-fixed-top" >
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-main">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Students</a>

                    <div class="collapse navbar-collapse" id="navbar-main">
                        <ul class="nav navbar-nav">
                        <c:if test="${sessionScope.role != null}">
                            <c:if test="${sessionScope.role eq 'PROFESSOR'}">
                                <li>
                                    <a href="${pageContext.request.contextPath}/jsp/addProfessor.jsp">Add professor</a>
                                </li>
                                <li>
                                    <a href="#" onclick="document.getElementById('users_form').submit();">Users</a>
                                </li>
                            </c:if>
                            <c:if test="${sessionScope.role eq 'STUDENT'}">
                                <li>
                                    <a href="${pageContext.request.contextPath}/jsp/addStudent.jsp">Add student</a>
                                </li>
                                <li>
                                    <a href="#" onclick="document.getElementById('users_form').submit();">Users</a>
                                </li>
                            </c:if>
                        </c:if>
                        <li>
                            <a href="${pageContext.request.contextPath}/jsp/account.jsp">Account</a>
                        </li>
                        <li>
                            <a onclick="document.getElementById('logout_form').submit(); return false;"
                               href="#" class="btn-danger">Exit</a>
                        </li>
                        <li>
                            <form id="home_form" action="${pageContext.request.contextPath}/controller" method="POST">
                                <input type="hidden" name="command" value="users"/>
                                <a href="#" onclick="document.getElementById('home_form').submit(); return false;">Users</a>
                            </form>
                        </li>
                    </ul>
                    </div>
                 </div>
            </div>
        </nav>

        <form id="logout_form" action="${pageContext.request.contextPath}/controller" method="POST">
            <input type="hidden" name="command" value="logout"/>
        </form>
        <br>
    </body>
</html>