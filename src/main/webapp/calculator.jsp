<%@ page import="model.Calculator" %>

<%--
  Created by IntelliJ IDEA.
  User: timur
  Date: 12.12.2022
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator result page</title>
</head>
<body>
<% Calculator calculator = (Calculator) session.getAttribute("calculator"); %>
<br>
    Результат: <%=calculator.toString()%>
<br>
<br>
<br>
<a href="/">НА ГЛАВНУЮ</a>
</body>
</html>
