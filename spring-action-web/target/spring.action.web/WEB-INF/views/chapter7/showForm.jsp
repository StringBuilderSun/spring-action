<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>通过URL传递数据</h1>
<form action="/chapter7/addChapter1" method="post">
    <label>章节:</label><input type="text" name="chapterName"><br>
    <label>页数:</label><input type="text" name="chapterPages"><br>
    <label>作者:</label><input type="text" name="author"><br>
    <input type="submit" value="提交">
</form>
<hr>
<h1>通过flash数据传递POJO复杂数据</h1>
<form action="/chapter7/addChapter2" method="post">
    <label>章节:</label><input type="text" name="chapterName"><br>
    <label>页数:</label><input type="text" name="chapterPages"><br>
    <label>作者:</label><input type="text" name="author"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
