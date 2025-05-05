<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 06-05-2025
  Time: 01:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="Styles.css">

</head>

<body id="home">
<%
HttpSession loginSession = request.getSession(false);
if (loginSession != null
        && (loginSession.getAttribute("username")!= null
        && loginSession.getAttribute("password")!=null)
){
    String fullname = (String) loginSession.getAttribute("fullname");
%>
    <header id="fullName">
        <img src="user-circle-logo.svg">
        Hello <%= fullname %>
    </header>
    <div id="container">
        <div class="switchButtonOuter"><a href="LogoutServlet">Logout</a></div>
    </div>
<%
    }else {
    response.sendRedirect("login.jsp");
    }
%>

</body>
</html>
