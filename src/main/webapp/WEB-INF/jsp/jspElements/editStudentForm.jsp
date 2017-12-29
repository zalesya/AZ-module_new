<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page trimDirectiveWhitespaces="true" %>

<script src="<c:url value="/static/jQuery-Form-Validator/form-validator/jquery.form-validator.min.js"/>" type="text/javascript"></script>
<jsp:useBean id="student" class="by.nc.school.dev.beans.Student"/>
<form:form style="margin: 20px" action="<%=Pages.STUDENT.EDIT_STUDENT.PATH_ABSOLUTE%>" method="post">
    <div class="form-group">
        <form:label path="surname">Surname</form:label>
        <form:input path="surname" type="text" class="form-control" id="surname"
                    name="surname" value="${student.surname}" readonly="true"
                    data-validation="required"
                    data-validation-error-msg="Surname is required.">
        </form:input>
        <form:errors path="surname" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="name">Name</form:label>
        <form:input path="name" type="text" class="form-control" id="name"
                    name="name" value="${student.name}" readonly="true"
                    data-validation="required"
                    data-validation-error-msg="Name is required.">
        </form:input>
        <form:errors path="name" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="email">Email</form:label>
        <form:input path="email" type="text" class="form-control" id="email"
                    name="email" value="${student.email}" readonly="true"
                    data-validation="required"
                    data-validation-error-msg="Email is required.">
        </form:input>
        <form:errors path="email" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="telephoneNumber">Telephone number</form:label>
        <form:input path="telephoneNumber" type="text" class="form-control" id="telephoneNumber"
                    name="telephoneNumber" value="${student.telephoneNumber}" readonly="true"
                    data-validation="required"
                    data-validation-error-msg="Telephone number is required.">
        </form:input>
        <form:errors path="telephoneNumber" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="numberRecordBook">Number record book</form:label>
        <form:input path="numberRecordBook" type="text" class="form-control" id="numberRecordBook"
                    name="numberRecordBook" value="${student.numberRecordBook}" readonly="true"
                    data-validation="required"
                    data-validation-error-msg="Number record book is required.">
        </form:input>
        <form:errors path="numberRecordBook" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="courseNumber">Course number</form:label>
        <form:input path="courseNumber" type="text" class="form-control" id="courseNumber"
                    name="courseNumber" value="${student.courseNumber}" readonly="true"
                    data-validation="required"
                    data-validation-error-msg="Course number is required.">
        </form:input>
        <form:errors path="courseNumber" cssClass="ui-state-error-text"/>
    </div>
    <div class="form-group">
        <form:label path="averageScore">Surname</form:label>
        <form:input path="averageScore" type="text" class="form-control" id="averageScore"
                    name="averageScore" value="${student.numberRecordBook}" readonly="true"
                    data-validation="required"
                    data-validation-error-msg="Average score record book is required.">
        </form:input>
        <form:errors path="averageScore" cssClass="ui-state-error-text"/>
    </div>

    <form:input path="id" type="hidden" name="id" value="${student.id}"></form:input>
    <form:input path="userId" type="hidden" name="userId" value="${student.user.id}"></form:input>

    <c:if test="${successUpdate == true}"><p class="text-success">Student's information is update successfully.</p></c:if>
    <c:if test="${successUpdate  == false}"><p class="text-danger">Student's information is not update successfully.</p></c:if>

    <div class="form-group">
        <form:button type="submit" class="btn btn-primary" >Edit student</form:button>
    </div>
</form:form>