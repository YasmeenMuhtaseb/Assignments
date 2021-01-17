<%--
  Created by IntelliJ IDEA.
  User: Yasmeen Muhtaseb
  Date: 1/6/2021
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prison</title>
    <style>
        h1{
            margin-top: 10%;
            margin-left: 20%;
            border: 2px solid;
            width: 800px;
            padding-left: 82px;
            height: 70px;
            padding-top: 32px;
        }
        button{
            margin-left: 45%;
        }
    </style>
</head>
<body>
<h1>You are in debtors prison with a balance of <%= session.getAttribute("gold")%> gold!</h1>
<form action="/process_money">
    <input type="hidden" name="which_form" value="newGame">
    <button>Play Again</button>
</form>
</body>
</html>
