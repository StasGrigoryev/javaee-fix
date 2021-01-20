<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Sign Up</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

    <%@ page import="org.example.javaee_fix.models.User" %>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>

    <%
        List<User> users = (ArrayList<User>) request.getAttribute("usersFromServer");
    %>

    <table>
        <tr>
            <th>Username</th>
            <th>Birth Date</th>
        </tr>

        <c:forEach items="${usersFromServer}" var="user">
            <tr>
                <td>${user.name}</td>
                <td>${user.birthDate}</td>
            </tr>
        </c:forEach>

    </table>

    <div class="login-box">
        <form method="post" name="login" action="/signup">
            <div class="textbox">
                <input type="text" required placeholder="Your name" name="name">
            </div>
            <div class="textbox">
                <input type="password" required placeholder="Password" name="password">
            </div>
            <div class="textbox">
                <input type="text" required placeholder="Date of birth" name="birthdate">
            </div>

            <input class="btn" type="submit" value="Create">
        </form>
    </div>

</body>
</html>
