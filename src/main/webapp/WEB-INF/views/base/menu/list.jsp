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
    <link rel="stylesheet" href="plugins/bootstrap-4.0.0-beta-dist/css/bootstrap.min.css"/>
    <!-- Bootstrap-table CSS -->
    <link href="plugins/bootstrap-table-1.11.1/bootstrap-table.min.css" rel="stylesheet">
</head>
<body>
    <table id="data"></table>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="plugins/jquery-3.2.1.min.js"></script>
<script src="plugins/popper.min.js"></script>
<script src="plugins/bootstrap-4.0.0-beta-dist/js/bootstrap.min.js"></script>
<!-- Bootstrap-table js -->
<script src="plugins/bootstrap-table-1.11.1/bootstrap-table.min.js"></script>
<script src="plugins/bootstrap-table-1.11.1/bootstrap-table-locale-all.min.js"></script>
<script>
    $("#data").bootstrapTable({
        url : 'manage/menu/get',
        sidePagination : 'server',
        columns : [
            {
                field : 'id',
                title : 'id'
            },
            {
                field : 'pid',
                title : 'pid'
            },
            {
                field : 'name',
                title : '名称'
            },
            {
                field : 'url',
                title : '指向url'
            },
            {
                field : 'sort',
                title : '排序'
            },
            {
                field : 'create_time',
                title : '创建时间'
            },
            {
                field : 'description',
                title : '描述'
            }
        ]
    })
</script>
</body>
</html>
