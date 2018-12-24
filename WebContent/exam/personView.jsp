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
이름 : ${name } <br>
이름 : <c:out value="${name }"/> <br>
아이디 : ${id }<br>
패스워드 : ${password }<br>
성별 : ${gender }<br>
메일 수신 여부 : ${notice }<br>
<c:forEach items="${notice }" var="i">
	${i }
</c:forEach>
<br>
직업 : ${job }

</body>
</html>