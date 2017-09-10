<%--
  Created by IntelliJ IDEA.
  User: Zacha
  Date: 2017/9/7
  Time: 22:46
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
    <title>编辑菜单</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"/>
</head>
<body>
这是编辑菜单页1<button class="btn btn-danger">点击</button><br>
这是编辑菜单页2<button class="btn btn-danger">点击</button><br>
这是编辑菜单页3<button class="btn btn-danger">点击</button><br>
这是编辑菜单页4<button class="btn btn-danger">点击</button><br>
这是编辑菜单页5<button class="btn btn-danger">点击</button><br>
这是编辑菜单页6<button class="btn btn-danger">点击</button><br>
这是编辑菜单页7<button class="btn btn-danger">点击</button><br>
这是编辑菜单页8<button class="btn btn-danger">点击</button><br>
这是编辑菜单页9<button class="btn btn-danger">点击</button><br>
这是编辑菜单页10<button class="btn btn-danger">点击</button><br>
<div class="visible">visible</div>
<div class="invisible">invisible</div>
这是编辑菜单页11<button class="btn btn-danger">点击</button><br>
这是编辑菜单页12<button class="btn btn-danger">点击</button><br>
这是编辑菜单页13<button class="btn btn-danger">点击</button><br>
这是编辑菜单页14<button class="btn btn-danger">点击</button><br>
这是编辑菜单页15<button class="btn btn-danger">点击</button><br>
这是编辑菜单页16<button class="btn btn-danger">点击</button><br>
这是编辑菜单页17<button class="btn btn-danger">点击</button><br>
这是编辑菜单页18<button class="btn btn-danger">点击</button><br>
这是编辑菜单页19<button class="btn btn-danger">点击</button><br>
这是编辑菜单页20<button class="btn btn-danger">点击</button><br>
这是编辑菜单页21<button class="btn btn-danger">点击</button><br>
这是编辑菜单页22<button class="btn btn-danger">点击</button><br>
这是编辑菜单页23<button class="btn btn-danger">点击</button><br>
这是编辑菜单页24<button class="btn btn-danger">点击</button><br>
这是编辑菜单页25<button class="btn btn-danger">点击</button><br>
这是编辑菜单页26<button class="btn btn-danger">点击</button><br>
这是编辑菜单页27<button class="btn btn-danger">点击</button><br>
这是编辑菜单页28<button class="btn btn-danger">点击</button><br>
这是编辑菜单页29<button class="btn btn-danger">点击</button><br>
这是编辑菜单页30<button class="btn btn-danger">点击</button><br>
<div class="d-none d-lg-block">
    试一下class
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.3/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</body>
</html>
