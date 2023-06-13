
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  if (request.getMethod().equalsIgnoreCase("post")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equals("admin") && password.equals("password")) {
      response.sendRedirect("/profile.jsp");
    }
  }
%>

<!DOCTYPE html>
<html>
<head>
  <jsp:include page="partials/header.jsp">
    <jsp:param name="title" value="LOGIN" />
  </jsp:include>
</head>
<body>
<%--<h1>Login</h1>--%>

<jsp:include page="partials/navbar.jsp" />

<form method="post" action="login.jsp">
  <label for="username">Username:</label>
  <input type="text" id="username" name="username" required><br><br>

  <label for="password">Password:</label>
  <input type="password" id="password" name="password" required><br><br>

  <input type="submit" value="Login">
</form>
</body>
</html>

