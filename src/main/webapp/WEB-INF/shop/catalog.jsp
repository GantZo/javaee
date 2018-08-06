<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%=request.getAttribute("title")%></title>
</head>
<body>
<div>
    <ul>
        <li><a href="main">Главная</a> </li>
        <li><a href="catalog">Каталог</a> </li>
        <li><a href="cart">Корзина</a> </li>
        <li><a href="order">Заказ</a> </li>
        <li><a href="product">Продукт</a> </li>
    </ul>
</div>
<h1><%=request.getAttribute("title")%></h1>

</body>
</html>
