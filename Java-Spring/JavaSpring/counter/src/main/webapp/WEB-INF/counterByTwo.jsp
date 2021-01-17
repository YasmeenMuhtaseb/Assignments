<%--
  Created by IntelliJ IDEA.
  User: Yasmeen Muhtaseb
  Date: 1/5/2021
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Current visit count</title>
</head>
<body>
<p>You have visited <a href="/your_server">http://your_server</a> <%= session.getAttribute("count")%> times.</p>
<a href="/your_server">Test another visit?</a>
<form action="/your_server/destroy">
    <button>Reset</button>
</form>
</body>
</html>
