<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

   <%-- <meta name="_csrf" content="${_csrf.token}"/>
    <meta name="_csrf_header" content="${_csrf.headerName}"/>
    --%>
    <link href="<c:url  value="/bower_components/bootstrap/dist/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url  value="/bower_components/bootstrap/dist/css/cover.css" />" rel="stylesheet">
    <link href="<c:url  value="/bower_components/bootstrap/dist/css/signin.css" />" rel="stylesheet">




</head>
<body>
<div class="container">
    <form class="form-signin"  action="/appLogin" method="POST">
        <h2 class="form-signin-heading">Welcome,please login</h2>
        <input type="text" class="form-control" placeholder="User Name" id="username" name="username"/>
        <input type="password" class="form-control" placeholder="Password" id="password" name="password"/>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>


</div>
</body>

</html>
