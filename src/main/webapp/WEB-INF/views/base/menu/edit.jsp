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
    <div class="container">
        <form>
            <div class="form-group row">
                <label for="name" class="col-form-label col-3">菜单名称</label>
                <div class="col-9">
                    <input class="form-control" id="name" name="name" required>
                </div>
            </div>
            <div class="form-group row">
                <label for="url" class="col-form-label col-3">指向URL</label>
                <div class="col-9">
                    <input class="form-control" id="url" name="url">
                </div>
            </div>
            <div class="form-group row">
                <label for="sort" class="col-form-label col-3">菜单排序</label>
                <div class="col-9">
                    <input type="number" class="form-control" id="sort" name="sort" required>
                </div>
            </div>
            <div class="form-group row">
                <label for="description" class="col-form-label col-3">菜单描述</label>
                <div class="col-9">
                    <input class="form-control" id="description" name="description">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-form-label col-3"></label>
                <div class="col-9">
                    <button type="submit" class="btn btn-primary">保存</button>
                    <button type="reset" class="btn btn-default">重置</button>
                </div>
            </div>
        </form>
    </div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.3/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</body>
</html>
