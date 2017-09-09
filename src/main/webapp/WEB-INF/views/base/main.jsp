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
    <title>管理平台</title>
    <link rel="shortcut icon" href="custom/favicon.ico" type="image/x-icon">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="custom/css/manage/main.css">
</head>
<body>
    <nav class="navbar navbar-light bg-light navbar-expand-md">
        <a class="navbar-brand" href="javascript:void(0);">zachary</a>
        <button class="navbar-toggler" data-toggle="collapse" data-target="#navbar-collapse">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbar-collapse">
            <form class="form-inline">
                <input class="form-control" type="search" placeholder="search...">
            </form>
            <div class="navbar-nav ml-auto">
                <a class="navbar-item nav-link" href="javascript:void(0);">修改密码</a>
                <a class="navbar-item nav-link" href="manage/logout">注销</a>
            </div>
        </div>
    </nav>
    <div class="container-fluid">
        <div class="row">
            <div class="col-2">
                <ul>
                    <li><a href="javascript:void(0);">新增菜单</a></li>
                </ul>
            </div>
            <div class="col-10 pr-0">
                <!-- class="d-block"即display:block 解决iframe height="100%"时body出现滚动条 -->
                <iframe id="main" src="manage/menu/toEditPage" width="100%" height="100%" frameborder="0" class="d-block"></iframe>
            </div>
        </div>
    </div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.3/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</body>
</html>
