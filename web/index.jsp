<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <a href="product-input.action">去输入...</a>
      <br>
      <a href="test.action">Test</a>
      <br>
      <a href="TestActionContext.action">TestActionContext</a>
      <br>
      <a href="TestAware.action">TestAware</a>
      <%--控制台--%>
      <br>
      <a href="TestServletActionContext">TestServletActionContext</a>
      <%--控制台--%>
      <br>
      <a href="TestAwareServletActionContext">TestAwareServletActionContext</a>
      <br>
      <a href="go-login.do">login</a>
      <br>
      <a href="testActionSupport.do">testCActionSupport</a>
      <br>
      <a href="testResult.do?number=1">testResult</a>
      <br>
      <a href="/Struts2/pages/wildcard/wildcard.jsp">wildcard.jsp</a>
      <br>
      <a href="test-Tag.do?username=王五">testTag</a>
      <form action="test-Tag.do?username=赵六" method="post">
          <input type="text" value="testUrl" name="testName">
          <input type="submit" value="submit">
      </form>

      <br>
      <a href="pages/tag/form-tag.jsp">Go form-tag.jsp</a>
      <br>
      <a href="emp-input.do">Go App</a>
      <br>
      <a href="emp-list.do">Go App List</a>
      <br>
      <a href="pages/conversion/conversion.jsp">Go Conversion.jsp</a>
      <br>
      <a href="pages/conversion/conversion_list.jsp">Go ConversionList.jsp</a>
      <br>
      <a href="testI18n">Go I18n.jsp</a>
      <br>
      <a href="pages/validation/validation.jsp">Go validation.jsp</a>
      <br>
      <a href="pages/validation/validation2.jsp">Go validation2.jsp</a>
      <br>
      <a href="pages/upload/upload.jsp">Go upload.jsp</a>
      <br>
      <a href="pages/download/download.jsp">Go download.jsp</a>
      <br>
      <a href="pages/token/token.jsp">Go token.jsp</a>

  </body>
</html>
