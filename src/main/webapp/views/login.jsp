<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Log In</title>
</head>
<body>

    <form method="post" name="login" action="/login">
        <input type="text" required placeholder="Your name" name="name">
        <input type="password" required placeholder="Password" name="password">
        <input type="submit" value="Log In">
    </form>

</body>
</html>
