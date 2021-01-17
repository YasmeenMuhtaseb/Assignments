<%--
  Created by IntelliJ IDEA.
  User: Yasmeen Muhtaseb
  Date: 1/5/2021
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Date</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/app.js"></script>
</head>
<body onload="dateDisplay()">
<center>
    <h1 class="date"><c:out value="${date}"/></h1>
    <a href="/">Go Back</a>
</center>
</body>
</html>