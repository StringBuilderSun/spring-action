<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>MultiPart上传处理文件</h2>
<form action="/chapter7/upload2" enctype="multipart/form-data" method="post">
    <label>上传文件</label><input type="file" name="file">
    <input type="submit" value="提交">
</form>
<br>
<a href="/chapter7/exception">异常处理（全Controller生效）</a><br>
<hr>
<h2>Controller中的异常处理</h2>
<br>
<a href="/chapter7/exception1">异常处理1（单Controller生效）</a><br>
<a href="/chapter7/exception2">异常处理2（单Controller生效）</a><br>
<hr>
<h2>跨重定向请求传递</h2>
<a href="/chapter7/addChapter">新增章节(验证数据传递)</a>
</body>
</html>
