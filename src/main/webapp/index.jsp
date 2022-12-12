<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator main page</title>
</head>
<body>
    <h2>Формат ввода: localhost:8080/calculator?op1=23&op2=45&op=plus</h2>
    <br/>
    <h2>Формат ввода операций: plus - '+', minus - '-', div - '/', mul - '*'</h2>
    <br/>
    <p>Tomcat у меня работает на порту 8081... </p>
    <p>Сегодня:  <%= new java.util.Date() %></p>
</body>
</html>