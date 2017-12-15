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
  <c:out value="url标签使用"></c:out>
  <h4>  
        使用url标签生成一个动态的url，并把值存入session中.  
  </h4>
  <c:url value="http://localhost:8080/test01" var="url" scope="session">  
  </c:url>  
  <a href="${url}">Tomcat首页</a> 
</body>
</html>