<%@ page import="org.struts2.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.struts2.valuestack.PersonComparator" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>
    <%--获取属性--%>
    name：<s:property value="[0].name"/>
    <br>
    <%--获取请求的参数--%>
    parameter：<s:property value="#parameters.username[0]"/>
    <br>
    <%--创建一个url字符串--%>
    <s:url value="/getProduct" var="url">
        <s:param name="productId" value="1001"/>
    </s:url>
    ${url}
    <br>
    <s:url value="/getProduct" var="url2">
        <%--对于value的值会自动进行OGNL解析--%>
        <s:param name="productId" value="productId"/>
    </s:url>
    ${url2}
    <br>
    <s:url value="/getProduct" var="url3">
        <%--对于value的值会自动进行OGNL解析,不希望进行OGNL解析的话使用' ' 括起来--%>
        <s:param name="productId" value="'productId'"/>
    </s:url>
    ${url3}
    <br>
    <%--创建一个请求action url--%>
    <s:url action="test-Tag" namespace="/helloWorld" method="save" var="url4"></s:url>
    ${url4}
    <br>
    <%--创建自动生成请求的参数的url--%>
    <s:url value="/testUrl" var="url5" includeParams="all"></s:url>
    ${url5}
    <br>
    <%--向request，session，page等域中压入数据，会进行OGNL解析--%>
    <s:set name="productName" value="'setProductName'" scope="request"></s:set>
    -set：request : <s:property value="#request.productName" />
    <br>
    <%
        Person person = new Person("AA", 12);
        request.setAttribute("person",person);
    %>
    <%--push 标签内可用--%>
    <s:push value="#request.person">
        ${name}
    </s:push>
   -- ${name}--
    <br>
    <%--if-esleif-else 标签--%>
    <s:if test="#request.person.age == 12">
        等于12
    </s:if>
    <s:elseif test="#request.person.age == 11">
        等于11
    </s:elseif>
    <s:else>
        其他
    </s:else>
    <br>
    <%--iterator 迭代--%>
    <%
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("bb", 123));
        personList.add(new Person("cc", 1234));
        personList.add(new Person("ee", 12));
        personList.add(new Person("AA", 12));
        request.setAttribute("personList",personList);
    %>
    <s:iterator value="#request.personList">
        name:${name} age:${age}<br>
    </s:iterator>
    <hr>
    <%--排序标签 sort--%>
    <%
        request.setAttribute("comparator",new PersonComparator());
    %>
    <s:sort comparator="#request.comparator" source="#request.personList" var="sortPersonList"></s:sort>
    <s:iterator value="#attr.sortPersonList">
        name:${name} age:${age}<br>
    </s:iterator>
    <br>
    <%--date 对日期进行格式化--%>
    <%
        request.setAttribute("date",new Date());
    %>
    <s:date name="#request.date" format="yyyy-MM-dd hh:mm:ss" var="date2"></s:date>
    format :　<s:property value="#attr.date2"/>
    <%--a 标签，生成超链接--%>
    <s:iterator value="#request.personList">
        <%--%{} 强制进行OGNL解析--%>
        <s:a href="getXxx.action?name=%{name}">${name}</s:a>
    </s:iterator>
</body>
</html>
