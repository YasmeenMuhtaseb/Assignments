<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yasmeen Muhtaseb
  Date: 1/6/2021
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dojo Survey Index</title>
    <style>
        div{
            border: 2px solid black;
            width: 250px;
            height: 250px;
            padding-left: 20px;
            margin-top: 10%;
            margin-left: 40%;
        }
        h3{
            text-decoration: underline;
        }
        table{
            text-align: left;
        }
        input{
            margin-right: 40px;
            float: right;
            margin-top: 50px;
            box-shadow: 2px 2px 2px black ;
            background-color: cadetblue;
            color: white;
        }
    </style>
</head>
<body>
<div>
    <h3> Submitted Info</h3>
    <table>
        <tr>
            <th>Name:</th>
            <td><c:out value="${your_name}"/></td>
        </tr>
        <tr>
            <th>Dojo Location:</th>
            <td><c:out value="${location}"/></td>
        </tr>
        <tr>
            <th>Favorite Language:</th>
            <td><c:out value="${favorite_language}"/></td>
        </tr>
        <tr>
            <th>Comment:</th>
            <td><c:out value="${text_area}"/></td>
        </tr>
    </table>
    <form method="post" action="/back">
        <input type="submit"  value="Go Back">
    </form>
</div>
</body>
</html>
