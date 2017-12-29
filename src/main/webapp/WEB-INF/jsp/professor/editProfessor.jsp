<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Professor</title>
    <link href="<c:url value="http://cdnjs.cloudflare.com/ajax/libs/select2/4.0.0/css/select2.min.css"/>" rel="stylesheet"/>
</head>
<body>
<%@include file="../jspElements/_header.jsp"%>
<jsp:useBean id="professor" class="by.nc.school.dev.beans.Professor"/>
<div id="wrapper">
    <script src="http://cdnjs.cloudflare.com/ajax/libs/select2/4.0.0/js/select2.min.js"></script>
    <c:if test="${error != null}">
        <div style="margin: 10px" class="alert alert-danger" >
                ${error}
        </div>
    </c:if>
    <div class="content" style="margin-left: 10px">
        <p>Surname: ${professor.surname}</p>
        <p>Name: ${professor.name}</p>
        <p>Email: ${professor.email}</p>
        <p>Telephone number: ${professor.telephoneNumber}</p>
        <p>Science degree: ${professor.scienceDegree}</p>
        <p>Professor's list of subjects teach: ${professor.listSubjectsProfessorTeach}</p>

        <%@include file="../jspElements/editProfessorForm.jsp"%>
    </div>
</div>

</body>

</html>