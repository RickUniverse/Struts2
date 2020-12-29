<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>
    <h1>Edit</h1>
    <s:form action="emp-update">

        <s:hidden name="id"></s:hidden>

        <s:textfield name="name" label="Name" ></s:textfield>
        <s:textfield name="password" label="Password" ></s:textfield>
        <s:radio list="#{'1':'Male','0':'Female'}" name="gender" label="Gender"></s:radio>
        <s:select list="#request.departments"
                  listKey="departmentId"
                  listValue="departmentName"
                  name="dept" label="Deoartment"></s:select>
        <s:checkboxlist list="#request.roles"
                        listKey="roleId"
                        listValue="roleName"
                        name="roles" label="Roles" ></s:checkboxlist>
        <s:textarea name="desc" label="Desc"></s:textarea>

        <s:submit></s:submit>
    </s:form>
    <hr>
</body>
</html>
