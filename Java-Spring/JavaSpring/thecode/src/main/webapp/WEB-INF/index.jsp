<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yasmeen Muhtaseb
  Date: 1/5/2021
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Secret Code</title>
</head>
<body>
<center style="margin-top: 15%">
<p style="color:red"><c:out value="${error}"/></p>
<h1>What is the code?</h1>
<form action="/checkCode" method="post">
    <input type="text" name="code"><br><br>
    <input type="submit" value="Try Code" style="box-shadow: 2px 2px black;">
</form>
</center>
</body>
</html>
