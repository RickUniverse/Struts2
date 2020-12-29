<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:form action="emp-add.do">
        <s:textfield name="name" label="Name" ></s:textfield>
        <s:textfield name="password" label="Password" ></s:textfield>
        <s:radio list="{'1':'Male','0':'Female'}" name="gender" label="Gender"></s:radio>
        <s:select list="#request.departments" name="dept" label="Deoartment"></s:select>
        <s:checkboxlist list="#request.roles" name="roles" label="Roles" ></s:checkboxlist>
        <s:textarea name="desc" label="Desc"></s:textarea>

        <s:submit></s:submit>
    </s:form>
</body>
</html>
