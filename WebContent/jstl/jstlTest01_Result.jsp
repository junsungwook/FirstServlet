<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
ID : ${param.id }<br>
Color : ${param.color }<br>
<c:set value="${param.id}" var="id" scope="request"/>
	${id }<br>
<c:set value="${param.color}" var="color" scope="request"/>
	${color }<br>	
</body>
</html>