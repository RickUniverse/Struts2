<%@ page import="org.struts2.valuestack.City" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>
    <s:form action="form-tag-save.do">

        <s:hidden name="userId"></s:hidden>

        <s:textfield name="username" label="Username"></s:textfield>
        <s:password name="password" label="Password"></s:password>
        <s:textarea name="desc" label="Desc"></s:textarea>

        <s:checkbox name="married" label="Married"></s:checkbox>
        
        <%--radio标签--%>
        <s:radio name="gender" list="#{'1':'Male','0':'Female'}" label="Gender"></s:radio>
        <%--checkboxlist--%>
        <%
            List<City> cityList = new ArrayList();
            cityList.add(new City(1,"a"));
            cityList.add(new City(2,"b"));
            cityList.add(new City(3,"c"));
            cityList.add(new City(4,"d"));
            request.setAttribute("cityList",cityList);
        %>
        <s:checkboxlist list="#request.cityList"
                        listKey="cityId"
                        listValue="cityName"
                        name="cities" label="Cities"></s:checkboxlist>
        <%--select 选择框--%>
        <s:select list="{1,2,3,4, 5,6,7,8,9}"
                  headerKey="0"
                  headerValue="请选择..."
                  name="age" label="Age">
            <%--
                s:optgroup 可以用作s：select的子标签，用于显示下拉框
                只能使用键值对，不能使用集合
            --%>
            <s:optgroup label="10-20" list="#{10:10,11:11}"></s:optgroup>
            <s:optgroup label="20-30" list="#{20:20,21:21}"></s:optgroup>

        </s:select>

        <s:submit></s:submit>
    </s:form>

    <form action="form-tag-save.do">
        <input type="checkbox" name="married" id="">
        <input type="submit" value="提交">
    </form>
</body>
</html>
