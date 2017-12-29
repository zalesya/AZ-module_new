<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="by.nc.school.dev.web.util.Pages" %>
<form:form id="registrationForm" style="margin: 20px" action="<%=Pages.PROFESSOR.ADD_PROFESSOR.PATH_ABSOLUTE%>" method="post">

    <div class="form-group">
        <form:label path="name">First name</form:label>
        <form:input path="name" type="text" class="form-control"
                    placeholder="First name" required="required"
                    data-validation="length alphanumeric"
                    data-validation-length="6-15"
                    data-validation-error-msg="First name has to be a value (6-15 chars)"
        />
        <form:errors path="name" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="lastName">Last name</form:label>
        <form:input path="lastName" type="text" class="form-control"
                    placeholder="Last name" required="required"
                    data-validation="length alphanumeric"
                    data-validation-length="5-15"
                    data-validation-error-msg="Last name has to be an alphanumeric value (5-15 chars)"
        />
        <form:errors path="lastName" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="email">Email</form:label>
        <form:input path="email" type="email" class="form-control"
                    placeholder="Email" required="required"
                    data-validation="email"
        />
        <form:errors path="email" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="telephoneNumber">Telephone number</form:label>
        <form:input path="telephoneNumber" type="text" class="form-control"
                    placeholder="Telephone number" required="required"
                    data-validation="length"
                    data-validation-length="11-15"

        />
    </div>
    <div class="form-group">
        <form:label path="scienceDegree">Science Degree</form:label>
        <form:input path="scienceDegree" id="scienceDegree" class="form-control"
                    placeholder="Science degree" required="required"
        />
    </div>
    <div class="form-group">
        <form:label path="listSubjectsProfessorTeach">Professor's subjects teach</form:label>
        <form:input path="listSubjectsProfessorTeach" id="listSubjectsProfessorTeach" class="form-control"
                    placeholder="Professor's subjects teach (from ',')" required="required"
        />
    </div>

    <div class="form-group">
        <form:button type="submit" class="btn btn-primary">Add new student</form:button>
    </div>
</form:form>