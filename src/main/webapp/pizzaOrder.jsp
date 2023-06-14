<%--
  Created by IntelliJ IDEA.
  User: rayglass
  Date: 6/14/23
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
    <h1>Pizza Order Form</h1>
    <form action="pizza-order" method="POST">
        <label for="crust">Crust Type:</label>
        <select name="crust" id="crust">
            <option value="thin">Thin Crust</option>
            <option value="thick">Thick Crust</option>
            <option value="deep-dish">Deep Dish</option>
        </select>
        <br>
        <br>
        <label for="size">Size Type:</label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <br>
        <br>
        <label for="sauce">Sauce Type:</label>
        <select name="sauce" id="sauce">
            <option value="Marinara Sauce">Marinara</option>
            <option value="Alfredo">Alfredo</option>
            <option value="Pesto">Pesto</option>
            <option value="BBQ">BBQ</option>
        </select>
        <br>
        <br>
<%--        <label>Toppings:</label>--%>
        <br>
        <input type="checkbox" name="toppings" value="pepperoni">Pepperoni<br>
        <input type="checkbox" name="toppings" value="mushrooms">Mushrooms<br>
        <input type="checkbox" name="toppings" value="onions">Onions<br>
        <input type="checkbox" name="toppings" value="sausage">Sausage<br>
        <input type="checkbox" name="toppings" value="olives">Olives<br>
        <br>

        <label for="address">Delivery Address:</label>
        <input type="text" name="address" id="address">
        <br><br>

        <input type="submit" value="Place Order">
    </form>

</body>
</html>
