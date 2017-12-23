<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page isErrorPage="true" %>

<html>
<head>
    <title>Error ${pageContext.errorData.statusCode}</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <jsp:include page="navigationBar.jsp"/>
    <div class="container">
        <br/>
            <h1>Error</h1>
        <br/>
        <p>Status code: ${pageContext.errorData.statusCode}</p>
        <p>From: ${pageContext.errorData.requestURI}</p>
        <p>Message: ${pageContext.errorData.throwable.message}</p>
    </div>
</body>
</html>