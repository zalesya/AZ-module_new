<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="by.nc.school.dev.web.util.Pages" %>

<form:form id="addStudentForm" style="margin: 20px" action="<%=Pages.STUDENT.ADD_STUDENT.PATH_ABSOLUTE%>" method="post">
    <div class="form-group">
        <form:label path="name">First name</form:label>
        <form:input path="name" type="text" class="form-control"
                    placeholder="First name" required="required"
                    data-validation="length alphanumeric"
                    data-validation-length="6-15"
                    data-validation-error-msg="First name has to be an alphanumeric value (6-15 chars)"
        />
        <form:errors path="name" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="surname">Surname</form:label>
        <form:input path="surname" type="text" class="form-control"
                    placeholder="Surname" required="required"
                    data-validation="length alphanumeric"
                    data-validation-length="5-15"
                    data-validation-error-msg="Surname has to be an alphanumeric value (5-15 chars)"
        />
        <form:errors path="surname" cssClass="ui-state-error-text"/>
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
        <form:label path="courseNumber">Course number</form:label>
        <form:input path="courseNumber" id="courseNumber" class="form-control"
                       placeholder="Course number" required="required"
                       data-validation="length alphanumeric"
                       data-validation-length="1"
                       data-validation-error-msg="Course number must have a one number"
        />
        <form:errors path="courseNumber" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="avearageScore"></form:label>
        <form:input path="avearageScore" id="avearageScore" class="form-control"
                       placeholder="Avearage score" required="required"
        />
        <form:errors path="avearageScore" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="numberRecordBook">Number Record book</form:label>
        <form:input path="numberRecordBook" id="numberRecordBook" class="form-control"
                    placeholder="Number record book" required="required"
                    data-validation="length alphanumeric"
                    data-validation-length="7"
                    data-validation-error-msg="Number record book must have 7 numbers."
        />
        <form:errors path="numberRecordBook" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="listStudentSubjectsStudy">Student's subjects study</form:label>
        <form:input path="listStudentSubjectsStudy" id="listStudentSubjectsStudy" class="form-control"
                    placeholder="Student's subjects study (from ',')" required="required"
        />
    </div>

    <div class="form-group">
        <form:button type="submit" class="btn btn-primary">Add new student</form:button>
    </div>
</form:form>