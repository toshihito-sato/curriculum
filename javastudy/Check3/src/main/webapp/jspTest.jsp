<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>

<!-- name、idの入力エリアを作成しなさい -->
<div class="header"><%@ include file="header.jsp"%></div>

<table>
	<tr>
		<th>name</th>
		<td><input type="text"></td>
	</tr>
	<tr>
		<th>id</th>
		<td><input type="text"></td>
	</tr>
</table>

<div class="footer"><%@ include file="footer.jsp"%></div>

</body>
</html>
