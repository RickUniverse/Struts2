<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <s:debug></s:debug>


    <h1>Add</h1>
    <s:form action="emp-add">
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

   <h1>List</h1>
    <table cellpadding="10" cellspacing="0" border="1">
        <thead>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Password</td>
                <td>Gender</td>
                <td>Dept</td>
                <td>Roles</td>
                <td>Desc</td>
                <td>Edit</td>
                <td>Deltete</td>
            </tr>
        </thead>
        <tbody>
            <s:iterator value="#request.employeeList">
                <tr>
                    <td>${id}</td>
                    <td>${name}</td>
                    <td>${password}</td>
                    <td>${gender}</td>
                    <td>${dept}</td>
                    <td>
                        <s:iterator value="#attr.roles">
<%--                            ${roleName}--%>
                            <s:property value="roleName"></s:property>
                        </s:iterator>
                    </td>
                    <td>${desc}</td>
                    <td><a href="emp-edit?id=${id}">Edit</a></td>
                    <td><a href="emp-delete?id=${id}">Delete</a></td>
                </tr>
            </s:iterator>
        </tbody>
    </table>
</body>
</html>
