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
  <h4>
    <c:out value="import实例" />
  </h4>
  <hr>
  
<%--   <h4>
    <c:out value="绝对路径引用的实例" />
  </h4>
  <c:catch var="error1">
    <c:import url="http://www.baidu.com" />
  </c:catch>
  <c:out value="${error1 }" />
  <hr> --%>
  
<%--   <h4>
    <c:out value="相对路径引用的实例，引用本应用中的文件" />
  </h4>
  <c:catch>
    <c:import url="a1.txt" charEncoding="UTF-8" />
  </c:catch>
  <hr> --%>
  
  <h4>
    <c:out value="使用字符串输出、相对路径引用的实例，并保存在session范围内" />
  </h4>
  <c:catch var="error3">
    <c:import url="a1.txt" var="myurl" scope="session" charEncoding="UTF-8" />
    <c:out value="${myurl}"></c:out>
    <c:out value="${myurl }" />
  </c:catch>
  <c:out value="${error3}"></c:out>
  
</body>
</html>