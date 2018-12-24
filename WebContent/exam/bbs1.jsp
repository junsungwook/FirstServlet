<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
<h1>글쓰기</h1>
<form action="bbs1" method="get">
이름 : <input type="text" name="name"><br>
제목 : <input type="text" name="title"><br>
<textarea rows="5" cols="20" name="content"></textarea>
<input type="submit" value="전송">
</form>
</body>
</html>