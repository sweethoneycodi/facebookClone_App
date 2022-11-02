<%--
  Created by IntelliJ IDEA.
  User: macbookpro
  Date: 01/11/2022
  Time: 8:52 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up</title>
    <link rel ="stylesheet" href="style.css">
</head>
<body>
<div>
<form method="post" action="/"  class="form" id="Signup">
    <h1 class="form__title">Sign Up</h1>
    <div class="form__input-group">
        <input type="text" class="form__input" autofocus placeholder="First Name" name="firstname">
    </div>
    <div class="form__input-group">
        <input type="text" class="form__input" autofocus placeholder="Last Name" name="lastname">
    </div>
    <div class="form__input-group">
        <input type="text" class="form__input" autofocus placeholder="Username" name="username">
    </div>
    <div class="form__input-group">
        <input type="text" class="form__input" autofocus placeholder="email address" name="email">
    </div>
    <div class="form__input-group">
        <input type="password" class="form__input" autofocus placeholder="password" name="password">
    </div>
    <div class="form__input-group">
        <input type="password" class="form__input" autofocus placeholder="Confirm password" name="confP">
    </div>
    <button class="form__button" type="submit">continue</button>

    <p class="form__text">
        <a href="index.jsp" class="form__link" id="linkLogin">Already have an account? sign In.</a>
    </p>

</form>
</div>


</body>
</html>
