<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <s:debug></s:debug>

    execute : <s:property value="exception"/>
    <br>
    message : <s:property value="exception.message"/>

    <form action="product-save.action" method="get">
        productId :　<input type="text" name="id" id="">
        productName :　<input type="text" name="name" id="">

        <input type="submit" value="提交">
    </form>
</body>
</html>
