<%--
  Created by IntelliJ IDEA.
  User: Yasmeen Muhtaseb
  Date: 1/6/2021
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dojo Survey Index</title>
    <style>
        form {
            border: 2px solid black;
            width: 260px;
            height: 260px;
            padding-left: 10px;
            padding-top: 10px;
            margin-top: 10%;
            margin-left: 40%;
        }
        #submitB{
            box-shadow: 2px 2px 2px black ;
            background-color: cadetblue;
            color: white;
            margin-right: 40px;
            float: right;
        }
        select{
            width: 120px;
            float: right;
            margin-right: 10px;
        }
        textarea{
            width: 240px;
            height: 50px;
        }
    </style>
</head>
<body>
    <form action="/getInformation" method="post">
        <label>Your Name:</label>
        <input type="text" name="your_name"><br><br>
        <label>Dojo Location:</label>
        <select name="location">
            <option value="ramallah">Ramallah</option>
            <option value="hebron">Hebron</option>
            <option value="nablus">Nablus</option>
        </select><br><br>
        <label>Favorite Language:</label>
        <select name="favorite_language">
            <option value="Python">Python</option>
            <option value="Java">Java</option>
            <option value="Mern">Mern</option>
        </select><br><br>
        <label>Comment (optional):</label><br><br>
        <textarea name="text_area"></textarea><br><br>
        <input id="submitB" type="submit" value="Button">
    </form>
</body>
</html>
