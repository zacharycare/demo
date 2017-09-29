<%--
  Created by IntelliJ IDEA.
  User: Zacha
  Date: 2017/8/27
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <title>登录</title>
    <link rel="shortcut icon" href="custom/favicon.ico" type="image/x-icon">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="plugins/bootstrap-4.0.0-beta-dist/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="custom/css/manage/login.css">
</head>
<body>
    <div class="container">
        <form class="form-signin" method="post" action="u/login">
            <h2 class="form-signin-heading">Please sign in</h2>
            <span>${msg}</span>
            <input name="account" class="form-control" value="${cookie.nc.value}" placeholder="Account" required autofocus>
            <input type="password" name="password" class="form-control" placeholder="Password" required>
            <div class="checkbox">
                <label>
                    <input type="checkbox" name="remember" value="remember-me" ${not empty cookie.nc ? "checked" : ""}> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block">Sign in</button>
        </form>
    </div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="plugins/jquery-3.2.1.min.js"></script>
<script src="plugins/popper.min.js"></script>
<script src="plugins/bootstrap-4.0.0-beta-dist/js/bootstrap.min.js"></script>
</body>
</html>
