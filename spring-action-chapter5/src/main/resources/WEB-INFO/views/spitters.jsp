<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Spitters Pages</h1>
<table class="spitter_table">
    <thead>
    <tr>
        <td>编号</td>
        <td>消息</td>
        <td>时间</td>
        <td>最后一次访问时间</td>
        <td>停留最长时间</td>
    </tr>
    <c:forEach items="${spitterList}" var="spitter">
        <tr>
            <td><c:out value="${spitter.id}"/></td>
            <td><c:out value="${spitter.message}"/></td>
            <td><c:out value="${spitter.time}"/></td>
            <td><c:out value="${spitter.lastitude}"/></td>
            <td><c:out value="${spitter.longitude}"/></td>
        </tr>
    </c:forEach>
    </thead>
</table>
</body>
</html>
