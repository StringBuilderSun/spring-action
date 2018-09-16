<%--Spring 表单库--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="form_div">
    <sf:form method="post" action="/chapter6/register">
        <sf:label path="firstName" cssErrorClass="errorPro">First Name</sf:label><sf:input path="firstName"/><br>
        <sf:errors path="firstName"/><br>
        Last Name<sf:input path="lastName"/><br>
        <sf:errors path="lastName"/><br>
        Email:<sf:input path="email"/><br>
        <sf:errors path="email"/><br>
        UserName:<sf:input path="userName"/><br>
        <sf:errors path="userName"/><br>
        PassWord:<sf:input path="passWord"/><br>
        <sf:errors path="passWord"/><br>
        <input type="submit" value="提交">
    </sf:form>
    <sf:input path=""/>
    <sf:button/>
</div>
</body>
</html>
