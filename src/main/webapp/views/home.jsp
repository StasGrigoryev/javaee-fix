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
<div class="hello">
    <H1 style="color: ${cookie.color.value};">Hello</H1>
</div>

<div class="outer-box">
    <div class="box">
        <form method="post" action="/home" id="color">
            <label for="color">
            <select name="color" id="color">
                <option value="red">Red</option>
                <option value="green">Green</option>
                <option value="pink">Pink</option>
                <option value="blue">Blue</option>
                <option value="yellow">Yellow</option>
            </select>
        </form>
    </div>

    <button class="btn-two" type="submit" form="color">Set color</button>
</div>

</body>
</html>
