<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>emp-input</title>
</head>
<body>
    <s:debug></s:debug>

    <%
        request.setAttribute("theme","simple");
    %>

    <h1>员工注册</h1>
    <s:form action="emp-save.do" ><%--theme="simple"--%>
        <s:textfield name="name" label="Name"></s:textfield>
        <s:password name="password" label="Password"></s:password>

        <s:radio name="gender" list="#{'1':'Male','0':'Female'}"  label="Gender"></s:radio>
        <s:select list="#request.departments"
                    name="dept"
                    label="Dept"
                    listKey="departmentId"
                    listValue="departmentName"></s:select>
        <s:checkboxlist list="#request.roles"
                        listKey="roleId"
                        listValue="roleName"
                        name="roles" label="Roles" ></s:checkboxlist>
        <s:textarea name="desc" label="Desc"></s:textarea>

        <s:submit></s:submit>
        
    </s:form>
</body>
</html>
