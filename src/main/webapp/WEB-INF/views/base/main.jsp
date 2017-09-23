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
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">
    <link rel="stylesheet" href="plugins/open-iconic/css/open-iconic-bootstrap.min.css"/>
    <link rel="stylesheet" href="custom/css/manage/main.css">
</head>
<body>
    <!-- 顶部导航 -->
    <nav class="navbar navbar-light bg-light navbar-expand-md fixed-top">
        <a class="navbar-brand" href="javascript:SHMenu();">
            <span class="oi oi-menu"></span>
        </a>
        <a class="navbar-brand" href="javascript:void(0);">
            zachary
        </a>
        <button class="navbar-toggler" data-toggle="collapse" data-target="#navbar-collapse">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="navbar-collapse collapse" id="navbar-collapse">
            <form class="form-inline">
                <input class="form-control" type="search" placeholder="search...">
            </form>
            <div class="navbar-nav ml-auto">
                <a class="navbar-item nav-link" href="javascript:modyfypassword();">修改密码</a>
                <a class="navbar-item nav-link" href="manage/logout">注销</a>
            </div>
        </div>
    </nav>

    <!-- 页面主体，包含左侧菜单和右侧iframe -->
    <div class="d-flex h-100">
        <!-- 左侧菜单栏 -->
        <div class="left-menu" id="leftmenu">
            <ul>
                <li><a href="manage/menu/toListPage">菜单管理</a></li>
                <li><a href="manage/menu/toEditPage">新增菜单</a></li>
                <li><a href="javascript:void(0);">新增用户</a></li>
            </ul>
        </div>
        <!-- 右侧iframe -->
        <div class="w-100 pl-3">
            <iframe id="main" src="manage/welcome" width="100%" height="100%" frameborder="0" class="d-block"></iframe>
        </div>
    </div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.3/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js"></script>
<script>
    function SHMenu(){
        var leftmenu = $(".left-menu");
        leftmenu.toggle();
    }

    $(document).ready(function(){
        $("#leftmenu").find("a").click(function(){
            var href = this.href;
            $.post('isExpire',{},function (data,status) {
                if (data.code == "1") {     //过期
                    alert("登录已过期");
                    window.location.href = data.obj;
                } else {
                    document.getElementById('main').src = href;
                }
            },'json');
            return false;
        });
        if(navigator.userAgent.match(/(iPhone|iPod|Android|ios)/i)){
            $(".left-menu").toggle();
        }
    });

    function modyfypassword(){
        $.dialog({
            title : '修改密码',
            content : 'url:manage/modify-password',
            closeIcon : false,
            backgroundDismiss: true
        });
    }
</script>
</body>
</html>
