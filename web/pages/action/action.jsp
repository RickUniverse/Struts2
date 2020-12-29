<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Test Action Context</h1>
    <br>
    application : ${applicationScope.applicationKey}
    <%
        if (application.getAttribute("date") == null)
            application.setAttribute("date",new Date());
    %>
    <br>
    session : ${sessionScope.sessionKey}
    <br>
    request : ${requestScope.requestKey}
    <br>
    parameter : ${param.name}
</body>
</html>
