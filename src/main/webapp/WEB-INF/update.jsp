<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Form</title>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Update your Profile!" />
    </jsp:include>

    <link rel="stylesheet" type="text/css" href="../CSS/home.css">
</head>
<body>


<jsp:include page="partials/navbar.jsp" />
<div class="container">
    <h1>Please update your information.</h1>
    <form action="/update" method="POST">
        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input id="email" name="email" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <div class="form-group">
            <label for="confirm_password">Confirm Password</label>
            <input id="confirm_password" name="confirm_password" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary btn-block">
    </form>
</div>



</body>
</html>