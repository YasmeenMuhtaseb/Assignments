<%--
  Created by IntelliJ IDEA.
  User: Yasmeen Muhtaseb
  Date: 1/6/2021
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ninja Gold Game</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="gold">
    <label>Your Gold:</label>
    <p><%= session.getAttribute("gold")%></p>
</div>
<div class="div_forms">
    <form class="form" method="post" action="/process_money">
        <input type="hidden" name="which_form" value="farm">
        <h3>Farm</h3>
        <p>(earns 10-20 gold)</p>
        <button>Find Gold!</button>
    </form>
    <form class="form" method="post" action="/process_money">
        <input type="hidden" name="which_form" value="gave">
        <h3>Gave</h3>
        <p>(earns 5-10 gold)</p>
        <button>Find Gold!</button>
    </form>
    <form class="form" method="post" action="/process_money">
        <input type="hidden" name="which_form" value="house">
        <h3>House</h3>
        <p>(earns 2-5 gold)</p>
        <button>Find Gold!</button>
    </form>
    <form class="form" method="post" action="/process_money">
        <input type="hidden" name="which_form" value="casino">
        <h3>Casino</h3>
        <p>(earns/takes 0-50 gold)</p>
        <button>Find Gold!</button>
    </form>
    <form class="form" method="post" action="/process_money">
        <input type="hidden" name="which_form" value="spa">
        <h3>Spa</h3>
        <p>(takes 5-20 gold)</p>
        <button>Find Gold!</button>
    </form>
</div>
<div class="activities">
    <p>Activities:</p>
    <div class="scroll"><%=session.getAttribute("activities")%></div>
    <form action="/process_money">
        <input type="hidden" name="which_form" value="newGame">
        <button class="playAgain">Play Again</button>
    </form>
</div>
</body>
</html>
