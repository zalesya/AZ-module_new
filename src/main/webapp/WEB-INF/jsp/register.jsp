<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %>

<html>
<head>
    <title>Регистрация</title>
    <link href="/css/style.css" type="text/css" rel="stylesheet">
    <link href="/css/bootstrap.css" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script>
        function checkForm() {
            if ((document.getElementById("pass1").value) !== (document.getElementById("pass2").value)) {
                document.getElementById("msg").style.display = "inline";
            }
            else {
                document.getElementById("msg").style.display = "none";
            }
        }
    </script>
</head>
<body>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<div class="container">
    <div class="jumbotron">
        <div class="page-header">
            <h1>Registration</h1>
        </div>
        <section>






            <form name="Registration" action="${pageContext.request.contextPath}/controller" method="POST">
                <input type="hidden" name="command" value="register"/>

                <div id="regexlogin">Your LOGIN must be contain быть 3-16 symbols. You can use only latin symbols,
                    numbers and symbols such as "-", "_".
                </div>
                <br/>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="username">Login: <span class="red">*</span></label>
                            <input id="username" type="text" class="username form-control" name="username"
                                   pattern="^[A-z0-9-_]{3,16}$" autofocus="" required="">
                        </div>
                    </div>
                </div>

                <div id="regexpass">Your PASSWORD must be contain быть 3-16 symbols. You can use only latin symbols,
                    numbers and symbols such as "-", "_".
                </div>
                <br/>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="pass1">Password: <span class="red">*</span></label>
                            <input id="pass1" type="password" class="password form-control" name="password"
                                   pattern="^[a-zA-Z0-9-_]{6,16}$" autofocus="" required="" onkeyup="checkForm(this)">
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="pass2">Confirm password: <span class="red">*</span></label>
                            <input id="pass2" type="password"  class="password form-control" name="repeatPassword" required=""
                                   onkeyup="checkForm(this)">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="role">Role (STUDENT or PROFESSOR): <span class="red">*</span></label>
                            <input id="role" type="text" class="form-control" name="role"
                                   pattern="^[A-zА-я-]+$" required="">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="surname">Surname: <span class="red">*</span></label>
                            <input id="surname" type="text" class="form-control" name="surname"
                                   pattern="^[A-zА-я-]+$" required="">
                        </div>
                    </div>
                </div>
                <br/>

                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="name">Name: <span class="red">*</span></label>
                            <input id="name" type="text" class="form-control" name="name"
                                   pattern="^[A-zА-я-]+$" required="">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="email">Email: <span class="red">*</span></label>
                            <input id="email" type="text" class="form-control" name="email"
                                   pattern="^[^@]+@[^@.]+\.[^@]+$" required="">
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-4">
                        <div class="form-group">
                            <label for="telephoneNumber">Telephone Number: <span class="red">*</span></label>
                            <input id="telephoneNumber" type="text" class="form-control" name="telephoneNumber"
                                   pattern="^[0-9-()]{15}$" required="">
                        </div>
                    </div>
                </div>

                <div id="errorMessage">
                    <c:if test="${emptyFields == true}">Not all required fields are filled.</c:if>
                    <c:if test="${passwordError == true}">Passwords don't match.</c:if>
                    <c:if test="${regexError == true}">The entered data does not match the template.</c:if>
                    <c:if test="${loginExists == true}">This login already exists.</c:if>
                    <c:if test="${errorRegistration == true}">Error of registration.</c:if>
                    <c:if test="${successAdd == true}"><p class="text-success">Information about user added successfully.</p></c:if>
                    <c:if test="${successAdd  == false}"><p class="text-danger">Information about user didn't add successfully.</p></c:if>
                </div>

                <div id="msg"> Passwords don't match.</div>
                <div>
                    <input type="submit" class="btn btn-success" value="Registration">
                </div>
            </form>
            <p id="reg">

            </p>
            <form name="backToLogin" action="${pageContext.request.contextPath}/controller" method="post">
                <div>
                    <input type="hidden" name="command" value="login"/>
                    <input type="submit" class="btn navbar-btn" value="Continue">
                </div>
            </form>
        </section>
    </div>
</div>
</body>