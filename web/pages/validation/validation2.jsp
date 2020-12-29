<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>
    <br>
    <%--这个action请求的验证要求是age在10-20之间--%>
    <s:form action="testValidation2">
        <s:fielderror fieldName="age"></s:fielderror>
        <br>
        <s:textfield name="age" label="age"></s:textfield>:${fieldErrors.age[0]}
        <br>
        <s:submit key="submit"></s:submit>
    </s:form>
</body>
</html>
