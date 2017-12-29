<%@ page import="by.nc.school.dev.web.util.Pages" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page trimDirectiveWhitespaces="true" %>
<html>
<head>
    <title>Enter</title>
    <link href="<c:url value="/static/css/loginAndRegistration.css"/>" type="text/css" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="/static/css/bootstrap.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/bootstrap-theme.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/style.css"/>" type="text/css" rel="stylesheet">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script>
        function checkForm() {
            if ((document.getElementById("password1").value) !== (document.getElementById("password2").value)) {
                document.getElementById("msg").style.display = "inline";
            }
            else {
                document.getElementById("msg").style.display = "none";
            }
        }
    </script>
</head>


<body>
<%@include file="jspElements/navigationBar.jsp"%>
<c:if test="${sessionScope.role != null}">
    <jsp:forward page="<%=Pages.USER.ALL_USERS.PATH_ABSOLUTE%>">
        <jsp:param name="command" value="users"/>
    </jsp:forward>
</c:if>

<c:if test="${sessionScope.role == null}">

    <div class="container">
        <div class="row">
            <div class="col-md-offset-3 col-md-6">
                <div class="tab" role="tabpanel">
                    <div>
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs" role="tablist">
                        <li role="presentation" class="active">
                            <a href="#Section1" aria-controls="home" role="tab" data-toggle="tab">sign in</a>
                        </li>
                        <li role="presentation">
                            <a href="#Section2" aria-controls="profile" role="tab" data-toggle="tab">sign up</a>
                        </li>
                    </ul>
                    </div>
                    <!-- Tab panes -->
                    <div class="tab-content tabs">
                        <div role="tabpanel" class="tab-pane fade in active" id="Section1">
                            <form name="Login" class="form-horizontal" action="<%=Pages.USER.LOGIN.PATH_ABSOLUTE%>" method="POST">
                                <div class="form-group">
                                    <label for="username">username</label>
                                    <input type="text" class="form-control" id="username" required name="username">
                                </div>
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" id="password" required name="password">
                                </div>
                                <div class="form-group">
                                    <div class="main-checkbox">
                                        <input value="None" id="checkbox1" name="check" type="checkbox">
                                        <label for="checkbox1"></label>
                                    </div>
                                    <span class="text">Keep me Signed in</span>
                                </div>
                                <div class="form-group">
                                    <button type="submit" class="btn btn-success">Sign in</button>
                                </div>
                                <div class="form-group forgot-pass">
                                    <button type="submit" class="btn btn-default">forgot password</button>
                                </div>

                            </form>
                        </div>

                        <div role="tabpanel" class="tab-pane fade" id="Section2">
                            <form name="Registration" class="form-horizontal" action="<%=Pages.USER.REGISTER.PATH_ABSOLUTE%>" method="POST">
                                <div class="top-row">
                                    <div class="form-group">
                                        <input id="surname" type="text" class="form-control" name="surname"
                                               pattern="^[A-zА-я-]+$" placeholder="Surname">
                                    </div>

                                    <div class="form-group">
                                        <input id="name" type="text" class="form-control" name="name"
                                               pattern="^[A-zА-я-]+$" placeholder="Name">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <input list="roleUser" id="role" type="text" class="form-control" name="role"
                                           placeholder="Role (STUDENT or PROFESSOR)">
                                    <datalist id="roleUser">
                                        <option value="STUDENT">
                                        <option value="PROFESSOR">
                                    </datalist>
                                </div>

                                <div class="form-group">
                                    <input id="newUsername" name="username" type="text" class="form-control"
                                           pattern="^[A-z0-9-_]{3,16}$" placeholder="Username">
                                </div>

                                <div class="top-row">
                                    <div class="form-group">
                                        <input id="password1" name="password" type="password" class="form-control"
                                               pattern="^[a-zA-Z0-9-_]{6,16}$" onkeyup="checkForm(this)" placeholder="Password">
                                    </div>

                                    <div class="form-group">
                                        <input id="password2" type="password"  class="form-control" name="repeatPassword"
                                               onkeyup="checkForm(this)" placeholder="Confirm password">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <input type="email" class="form-control" id="email" name="email" placeholder="Email Address">
                                </div>

                                <div class="form-group">
                                    <input id="telephoneNumber" type="text" class="form-control" name="telephoneNumber"
                                           pattern="^[0-9-()]{15}$" placeholder="Telephone Number">
                                </div>

                                <div id="errorMessageRegistration">
                                    <c:if test="${emptyFields == true}">Not all required fields are filled.</c:if>
                                    <c:if test="${passwordError == true}">Passwords don't match.</c:if>
                                    <c:if test="${regexError == true}">The entered data does not match the template.</c:if>
                                    <c:if test="${loginExists == true}">This login already exists.</c:if>
                                    <c:if test="${successAddUser == true}"><p class="text-success">Information about user added successfully.</p></c:if>
                                    <c:if test="${successAddUser  == false}"><p class="text-danger">Information about user didn't add successfully.</p></c:if>
                                </div>

                                <div class="form-group">
                                    <button type="submit" class="btn btn-success" value="Sign Up">Sign Up</button>
                                    <!-- <button type="submit" class="btn btn-success" value="Sign Up"></button> -->
                                </div>
                            </form>


                        </div>
                    </div>
                </div>

            </div><!-- /.col-md-offset-3 col-md-6 -->
        </div><!-- /.row -->
    </div><!-- /.container -->
</c:if>
</body>
</html>


