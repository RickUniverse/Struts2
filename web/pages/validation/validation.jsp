<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>
    <br>
    <%--这个action请求的验证要求是age在1-10之间--%>
    <s:form action="testValidation">
        <s:text name="username"></s:text>
        <br>
        <s:fielderror fieldName="age"></s:fielderror>
        <br>
        <s:textfield name="age" label="age"></s:textfield>:${fieldErrors.age[0]}
        <br>

        <hr>

        Password:<s:textfield name="password" label="password"></s:textfield>
        Password2:<s:textfield name="password2" label="password2"></s:textfield>

        <%--非字段验证错误获取方法--%>
        <s:actionerror/>
        <br>
        <hr>
<%--        <s:fielderror/>--%>
        ${fieldErrors.count[0]}
        Count:<s:textfield name="count" label="Count"></s:textfield>

        <hr>
        <%--验证等于123456789--%>
        ${fieldErrors.iDCard[0]}:
        IDCard:<s:textfield name="iDCard" label="IDCard"></s:textfield>

        <s:submit key="submit"></s:submit>
    </s:form>
</body>
</html>
