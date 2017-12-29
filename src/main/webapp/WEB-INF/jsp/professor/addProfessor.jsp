<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="by.nc.school.dev.web.util.Pages" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Add professor</title>
    </head>
    <body>
        <%@include file="../jspElements/_header.jsp" %>
        <div id="wrapper">
            <c:set var="path" value="<%=Pages.PROFESSOR.ADD_PROFESSOR.PATH_ABSOLUTE%>"/>
            <c:set var="button" value="Add professor"/>
        </div>
    </body>
</html>
