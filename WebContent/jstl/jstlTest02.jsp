<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>여기에 제목을 입력하십시오</title>
</head>
<body>
<form action="jstlTest" method="post">
ID : <input type="text" name="id"><br>
Color : 
<select name="color">
	<option value="yellow">노랑</option>
	<option value="blue">blue</option>
	<option value="orange">"orange"</option>
	<option value="pink">"pink"</option>
</select>
<input type="submit" value="보내기">
</form>
</body>
</html>