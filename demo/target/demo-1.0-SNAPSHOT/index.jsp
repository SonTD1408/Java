<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<a href="code-servlet">hehe</a>
<br/>
<form action="code-servlet" method="post">
    Ten: <input type="text" name ="ten"/>
    Tuoi: <input type="text" name="tuoi"/>
    diachi: <input type="text" name="diachi">
    <input type="submit" name="submit">
</form>
</body>
</html>