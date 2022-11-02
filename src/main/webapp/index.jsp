<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login/Signup</title>
    <link rel ="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
</head>
<body>
<%--/*<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>*/--%>
<a href="hello-servlet">Hello Servlet</a>
<div class=".container">
    <h1 align="center" background-color="blue">FACEBOOK</h1>
    <form  class="form" id="login">
        <h1 class="form__title">Login</h1>
        <div class="form__input-group">
            <input type="text" class="form__input" autofocus placeholder="Username or email">
        </div>
        <div class="form__input-group">
            <input type="password" class="form__input" autofocus placeholder="password">
        </div>
        <button class="form__button" type="submit">continue</button>
        <p class="form__text">
            <a href="" class="form__link">forgot your password?</a>
        </p>
        <p class="form__text">
            <a href="SignUp.jsp" class="form__link" id="linkCreateAccount">Don't have account? Create account.</a>
        </p>
    </form>


</div>





</body>
</html>