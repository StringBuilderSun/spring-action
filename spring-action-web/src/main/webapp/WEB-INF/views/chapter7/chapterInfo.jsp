<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>章节信息(基本数据模式)</h1>
<h2>${chapterName}</h2>
</body>
<h1>章节信息(POJO数据模式)</h1>
<h2>章节:${chapter.chapterName}</h2>
<h2>页数:${chapter.chapterPages}</h2>
<h2>作者:${chapter.author}</h2>
</body>
</html>
