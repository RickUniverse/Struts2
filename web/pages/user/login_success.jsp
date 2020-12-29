<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    welcome : ${sessionScope.username}
    <br>
    count on line : ${applicationScope.count}
    <br>
    <a href="logout.do">logout</a>
</body>
</html>
