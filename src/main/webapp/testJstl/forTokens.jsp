<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h4><c:out value="forToken实例"/></h4>
  <hr>
  <c:forTokens items="北、京、欢、迎、你" delims="、" var="ccc">
    <c:out value="${ccc }"></c:out>
  </c:forTokens>
  
  <br>
  
  <c:forTokens items="123-4567-8854" delims="-" var="vvv">
    <c:out value="${vvv }"></c:out>
  </c:forTokens>
  
  <br>
  
  <c:forTokens items="1*2*3*4*5*6*7" delims="*" begin="1" end="3" var="bbb" varStatus="sss">
    <c:out value="${bbb }" />的四种属性：<br>
           所在位置，即索引：<c:out value="${sss.index}" />  
    <br>  
           总共已迭代的次数：<c:out value="${sss.count}" />  
    <br>  
           是否为第一个位置：<c:out value="${sss.first}" />  
    <br>  
           是否为最后一个位置：<c:out value="${sss.last}" />  
    <br>
  </c:forTokens>
</body>
</html>