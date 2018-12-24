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
첫 번째 수 : ${param.num1 }<br>
두 번째 수 : ${param.num2 }<br>

<hr>
<!-- 변수에 담는 명령어 request는 유효범위의 뜻임 page는 현재페이지 -->
<c:set value="${param.num1 }" var="no" scope="request"/>
	${no }
</body>
</html>