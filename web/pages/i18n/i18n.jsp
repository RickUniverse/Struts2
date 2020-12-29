<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>

    <hr>

    <a href="Testi18n.action?request_locale=en_US">English</a>
    <a href="Testi18n.action?request_locale=zh_CN">中文</a>

    <br>
    <a href="index.jsp">Go index.jsp</a>
    <hr>
    <s:form action="#">
        <s:text name="time">
            <s:param value="date"></s:param>
        </s:text>
        <br>
        <s:text name="time2"></s:text>

        <br>
        <%--使用OGNL获取国际化文件信息--%>
        <s:textfield name="username" label="%{getText('username')}"></s:textfield>
        <br>
        <%--使用key属性获取国际化信息--%>
        <s:textfield name="username" key="username"></s:textfield>
        <br>
        <s:textfield name="password" key="password"></s:textfield>

        <br>
        <s:submit key="submit"></s:submit>
    </s:form>

    <hr>

    <s:form action="" theme="simple">

        <h4>Simple Theme</h4>

        <s:text name="time">
            <s:param value="date"></s:param>
        </s:text>
        <s:text name="time2"></s:text>

        <s:text name="username"/>:<s:textfield name="username" key="username"></s:textfield>
        <s:text name="password"/>:<s:textfield name="password" key="password"></s:textfield>

        <s:submit value="%{getText('submit')}"></s:submit>
    </s:form>
</body>
</html>
