<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yasmeen Muhtaseb
  Date: 1/6/2021
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Favorite Language</title>
    <style>
        h1{
            padding-left: 6%;
        }
        div{
            width: 1100px;
            border: 2px solid black;
            margin-top: 10%;
            margin-left: 16%;
            height: 130px;
        }
        input{
            margin-left: 50%;
            margin-top: 5px;
            box-shadow: 2px 2px 2px black;
            background-color: cadetblue;
            color: white;
        }
    </style>
</head>
<body>
<div>
    <h1>Hello, <c:out value="${your_name}"/>. It's great that you choose Java as your favorite language!</h1>
    <form method="post" action="/back">
        <input type="submit"  value="Go Back">
    </form>
</div>
</body>
</html>
