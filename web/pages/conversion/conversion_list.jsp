<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:form action="testConversionList">
        DepartmentId:<s:textfield name="departmentId" label="DepartmentId"></s:textfield>
        <br>
        ----ManagerId:<s:textfield name="manager.managerId" label="ManagerId"></s:textfield>
        <br>
        ----Date:<s:textfield name="manager.date" label="Date"></s:textfield>
        <br>
        =============集合===============
        <h4>Customer one:</h4>
        Age:<s:textfield name="customers[0].age" label="Age"></s:textfield>
        <br>
        Birth:<s:textfield name="customers[0].birth" label="Birth"></s:textfield>
        <h4>Customer two:</h4>
        Age:<s:textfield name="customers[1].age" label="Age"></s:textfield>
        <br>
        Birth:<s:textfield name="customers[1].birth" label="Birth"></s:textfield>
        <br>
        <s:submit></s:submit>
    </s:form>
</body>
</html>
