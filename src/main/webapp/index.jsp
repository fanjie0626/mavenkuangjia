<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<html>
<body>
  <h2>Hello World!</h2>
  <a href="showUser?id=2">ShowUser page</a><br>
  <a href="insertUserPage">insertUser </a><br>
<%--
  <c:out value="<要显示的数据对象（未使用转义字符）>" escapeXml="true" default="默认值"></c:out><br/>  
  <c:out value="<要显示的数据对象（使用转义字符）>" escapeXml="false" default="默认值"></c:out><br/>  
  <c:out value="${null}" escapeXml="false">使用的表达式结果为null，则输出该默认值</c:out><br/> --%>
</body>
</html>
