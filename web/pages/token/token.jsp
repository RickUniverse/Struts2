<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:form action="testToken">

        <%--解决表单重复提交试用token标签--%>
        <s:token></s:token>

        <s:textfield name="username" label="Username"></s:textfield>

        <s:submit></s:submit>
    </s:form>
</body>
</html>
