<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.getSession().getAttribute("user");%>

<c:choose>
    <c:when test="${user.username == null}">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/ads">Adlister</a>
                </div>

                <%--Search Bar--%>
                <form class = "navbar-form navbar-right" action="/SearchAdsServlet" method="GET" class="search-form">
                    <div class="form-group">
                        <input id="user-search" name="user-search" placeholder="Search all ads" class="form-control" type="text">
                    </div>
                    <input type="submit" class="btn" value="Search">
                </form>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/login">Login</a></li>
                    <li><a href="/register">Register</a></li>
                </ul>
            </div>
        </nav>

    </c:when>

    <c:otherwise>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <a class="navbar-brand" href="/ads">Adlister</a>
                </div>

                <form class = "navbar-form navbar-right" action="/SearchAdsServlet" method="GET" class="search-form">
                    <div class="form-group">
                        <input id="user-search2" name="user-search" placeholder="Search all ads" class="form-control" type="text">
                    </div>
                    <input type="submit" class="btn" value="Search">
                </form>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/ads/create">Create Ad</a></li>
                    <li><a href="/profile">Profile</a></li>
                    <li><a href="/logout">Logout</a></li>
                    <li><a href="/update">Update Profile</a></li>
                    <li>

                    </li>
                </ul>
            </div>
        </nav>
    </c:otherwise>
</c:choose>