<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../WEB-INF/partials/navbar.jsp" />

    <div class="container">
            <div class="container">
                <h1>Welcome your Profile ${sessionScope.username} </h1>
                <h2>Viewing your profile.</h2>
            </div>

        <form action="/login" method="POST">
            <input type="submit" class="btn btn-primary btn-block" value="Log Out">
        </form>

    </div>

</body>
</html>
