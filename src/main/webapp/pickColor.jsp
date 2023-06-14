<%--
  Created by IntelliJ IDEA.
  User: rayglass
  Date: 6/14/23
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick a Color</title>
</head>
<body>
<h1>Pick Your Favorite Color</h1>
<form action="viewColor.jsp" method="POST">
    <label for="color">Favorite Color:</label>
    <input type="text" name="color" id="color">
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
