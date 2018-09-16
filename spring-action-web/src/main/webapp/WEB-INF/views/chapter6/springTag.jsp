<%--
Spring 通用标签库
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<html>
<head>
    <title>Spring 通用标签库</title>
</head>
<body>
<%--s:message 可以从配置文件中获取信息 但是需要配置一个资源加载类--%>
<s:message code="spring.code"/>
</body>
</html>
