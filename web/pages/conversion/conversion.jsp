<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>

    <s:form action="conversion_test" theme="simple">

        Age:<s:textfield name="age" label="Age"></s:textfield> --${fieldErrors.age[0]}--<s:fielderror fieldName="age"></s:fielderror><%--默认的错误--%>
        <br>
        Birth:<s:textfield name="birth" label="Birth"></s:textfield> --<s:fielderror fieldName="birth"></s:fielderror>
        <br>
        <s:submit></s:submit>
    </s:form>
</body>
</html>
