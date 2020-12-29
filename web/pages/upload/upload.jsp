<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>

    <br>

    fielderror:<s:fielderror/>
    <br>
    actionerror:<s:actionerror/>
    <s:form action="testUpload" method="POST" enctype="multipart/form-data">
        Select file:<s:file name="ppt" label="PPT"></s:file>
        Desc:<s:textfield name="desc[0]" label="Desc"></s:textfield>
        <br>
        Select file:<s:file name="ppt" label="PPT"></s:file>
        Desc:<s:textfield name="desc[1]" label="Desc"></s:textfield>
        <br>
        Select file:<s:file name="ppt" label="PPT"></s:file>
        Desc:<s:textfield name="desc[2]" label="Desc"></s:textfield>

        <br>
        <s:submit></s:submit>
    </s:form>
</body>
</html>
