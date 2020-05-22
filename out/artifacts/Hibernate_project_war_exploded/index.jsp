<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/11
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>welcome to struts2 </h1>
  <p><a href="<s:url action="hello"/> ">Hello User</a> </p>
  <s:form action="hello">
    <s:textfield name="userName" label="用户名"/>
    <s:submit name="submit" value="提交"/>
  </s:form>

  </body>
</html>