<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
    <link rel="stylesheet" type="text/css" href="../../CSS/profile.css">
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<h1>Ads your looking for</h1>

<h1>Search Results</h1>

<c:forEach var="result" items="${searchResults}">
    <div class="col-md-6 ad-card">
        <h2>${result.title}</h2>
        <p>${result.description}</p>
        <form action="/ResultsServlet" method="GET">
            <div class="form-group">
                <input type="hidden" name="title" value="${result.title}">
                <input type="hidden" name="description" value="${result.description}">
            </div>
        </form>
    </div>
</c:forEach>
</body>
</html>