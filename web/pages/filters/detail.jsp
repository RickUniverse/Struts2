<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>

    <%--读取对象栈中的数据 使用以下方式--%>
    productId :　<s:property value="[1].id"></s:property>
    productName :　<s:property value="[0].name"></s:property>

    <br>
    <%--读取context map域中的数据 使用一下方式--%>
    request productName2 :　<s:property value="#request.request.name"></s:property>
    <br>
    session productName2 :　<s:property value="#session.session.name"></s:property>

    <br>
    <%--使用OGNL调用静态方法--%>
    <%--属性--%>
    PI:<s:property value="@java.lang.Math@PI" />
    <br>
    <%--静态方法--%>
    staticMethod : <s:property value="@java.lang.Math@cos(0)"/>
    <br>
    <%--调用对象栈方法为对象赋值--%>
    <s:property value="setName('使用OGNL修改后')"/>
    name :　<s:property value="[0].name"/>
    <br>


    <%--调用数组对象的属性--%>
    <%
        String[] names = new String[]{"aa","bb","cc"};
        request.setAttribute("names",names);
    %>

    <%--调用length方法--%>
    <br>
    length : <s:property value="#attr.names.length"/>
    <br>
    <%--获取属性--%>
    latter[1] : <s:property value="#attr.names[1]"/>

    <%--map集合--%>
    <%
        Map<String, String> map = new HashMap();
        request.setAttribute("map",map);
        map.put("key1","key1value");
    %>
    <br>
    <%--size方法--%>
    size :　<s:property value="#attr.map.size"/>
    <br>
    key1 :　<s:property value="#attr.map['key1']"/>
    <hr>
    productId : ${id} or <%=request.getAttribute("id")%>
    <%=request%>
    productName : ${name}
</body>
</html>
