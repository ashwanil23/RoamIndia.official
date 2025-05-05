<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 05-05-2025
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp</title>
  <link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
<header class="mainHeader">REGISTER WITH ROAM INDIA</header>
<div class="container">
  <div class="loginOrSignupField">
    <div class="switchButtonOuter"><a href="login.jsp">Switch To Login</a></div>
    <div class="form-title" id="formTitle">SignUp</div>

    <form action="RegisterServlet" method="post" class="signup-form active">
      <div class="form-field">
        <input type="text" name="fullname" placeholder="Full Name" required>
      </div>
      <div class="form-field">
        <input type="email" name="email" placeholder="Email" required>
      </div>
      <div class="form-field">
        <input type="password" name="password" placeholder="Password" required>
      </div>
      <div class="form-field">
        <input type="password" name="confirmPassword" placeholder="Confirm Password" required>
      </div>
      <div class="form-field">
        <input type="submit" value="Sign Up">
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
      <%
        String error = request.getParameter("error");
        if ("1".equals(error)) {
      %>
      <p style="color: red;">‼️Password‼️Not Matched</p>
      <% } %>

    </div>
  </div>
</div>
</body>
</html>
