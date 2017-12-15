<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%> 
<%@page import="java.util.ArrayList"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h4><c:out value="forEach实例"/></h4>
  <hr>
  <% 
  	  List<String> aaa = new ArrayList<String>();
  	  aaa.add("贝贝");
  	  aaa.add("晶晶");  
  	  aaa.add("欢欢");  
  	  aaa.add("莹莹");  
  	  aaa.add("妮妮"); 
  	  request.setAttribute("bbb", aaa);
  %>
    <b><c:out value="不指定begin和end的迭代：" /></b><br>
    <c:forEach var="fuwa" items="${bbb }">
      <c:out value="${fuwa }"></c:out><br>
    </c:forEach>
    
    <br><br><br>    
    
    <b><c:out value="指定begin和end的迭代：" /></b><br>
    <c:forEach var="fuwa" items="${bbb }" begin="0" end="4" step="2">
      <c:out value="${fuwa }"></c:out><br>
    </c:forEach>
    
    <br><br><br>
    
    <b><c:out value="输出整个迭代的信息：" /></b><br>
    <c:forEach var="fuwa" items="${bbb }" begin="3" end="4" step="1" varStatus="sss">
      <c:out value="${fuwa }"/>的四种属性：<br> 
               所在位置，即索引：<c:out value="${sss.index}" /><br>  
               总共已迭代的次数：<c:out value="${sss.count}" /><br>  
               是否为第一个位置：<c:out value="${sss.first}" /><br>  
               是否为最后一个位置：<c:out value="${sss.last}" /><br>  
    </c:forEach>
</body>
</html>