<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 05-05-2025
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
  <link rel="stylesheet" type="text/css" href="Styles.css">

</head>
<body>
<header class="mainHeader">LOGIN TO ROAM INDIA</header>
<div class="container">
  <div class="loginOrSignupField">
    <div class="switchButtonOuter" id="toggleForm"><a href="register.jsp">Switch To Signup</a></div>
    <div class="form-title" id="formTitle">Login</div>

    <form action="LoginServlet" method="post" class="login-form active">
      <div class="form-field">
        <input type="email" name="email" placeholder="Email" required>
      </div>
      <div class="form-field">
        <input type="password" name="password" placeholder="Password" required>
      </div>
      <div class="form-field rememberMe">
        <label><input type="checkbox" name="remember"> Remember Me</label>
      </div>
      <div class="form-field">
        <input type="submit" value="Login">
      </div>
    </form>

    <div class="socialButtons">
      <button class="twitter">Twitter</button>
      <button class="facebook">Facebook</button>
      <button class="googleplus">Google+</button>
    </div>
    <div class="modes">
      <button onclick="document.body.className=''">Normal</button>
      <button onclick="document.body.className='mode01_ON'">Mode 1</button>
      <button onclick="document.body.className='mode02_ON'">Mode 2</button>
    </div>
    <div class="errorMessage">
      <%String error = request.getParameter("error");
        if (error != null && error.equals("1")) {%>
            <p style="color: red;">Invalid email/password</p>
      <% }%>
    </div>
  </div>
</div>
</body>
</html>
