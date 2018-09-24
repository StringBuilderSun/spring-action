<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/chapter7/upload2" enctype="multipart/form-data" method="post">
    <label>上传文件</label><input type="file" name="file">
    <input type="submit" value="提交">
</form>
<hr>
<br>
<a href="/chapter7/exception">异常处理</a>
</body>
</html>
