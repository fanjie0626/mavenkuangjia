<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增用户</title>
</head>
<body>  
  <form:form action="insertUser" method="post" commandName="user">
    <c:out value="${user.password}" escapeXml="false">使用的表达式结果为null，则输出该默认值</c:out><br/>
    <c:out value="<要显示的数据对象（未使用转义字符）>" escapeXml="true" default="默认值"></c:out><br/>  
    <c:out value="<要显示的数据对象（使用转义字符）>" escapeXml="false" default="默认值"></c:out><br/>  
    <table>
      <tr>
        <td>用户名：</td>
        <td><input type="text" name="userName"/></td>
        <td><form:input path="userName"/></td>
      </tr>
      <tr>
        <td>密码：</td>
        <td><input type="text" name="password"/></td>
        <td><form:password path="password" showPassword="true"/></td>
      </tr>
      <tr>
        <td>年龄：</td>
        <td><input type="text" name="age"/></td>
        <td><form:input path="age"/></td>
      </tr>
      <tr>
        <td colspan="2"><input type="submit" value="提交"></td>
      </tr>
    </table>
  </form:form>  
</body>
</html>