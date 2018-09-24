<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="header">
    <tiles:insertAttribute name="header"/>
</div>
<div id="body">
    <tiles:insertAttribute name="body"/>
</div>
<div id="footer">
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>
