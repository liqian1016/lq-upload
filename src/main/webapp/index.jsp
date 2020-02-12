<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  两种方式的上传 :  form表单的上传-->
<center>

<form action="upload" method="post" enctype="multipart/form-data">

	上传图片:<input type="file" name="myfile"/>
	<br>
	<input type="submit" value="上传"/>






</form>
</center>
</body>
</html>