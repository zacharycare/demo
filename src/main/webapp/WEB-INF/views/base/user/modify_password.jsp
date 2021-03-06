<%--
  Created by IntelliJ IDEA.
  User: Zacha
  Date: 2017/9/23
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <title>修改密码</title>
    <link rel="shortcut icon" href="custom/favicon.ico" type="image/x-icon">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="plugins/bootstrap-4.0.0-beta-dist/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="plugins/jquery-confirm-3.3.0/jquery-confirm.min.css">
    <link rel="stylesheet" href="plugins/open-iconic/css/open-iconic-bootstrap.min.css"/>
</head>
<body>
    <div class="p-2">
        <form role="form" id="modify">
            原密码：
            <input name="old" class="form-control" required>
            新密码：
            <input name="new" class="form-control" required>
            确认：
            <input name="confirm" class="form-control" required>
            <div class="float-right py-2">
                <input type="button" class="btn btn-primary" value="修改" onclick="mp()">
            </div>
        </form>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="plugins/jquery-3.2.1.min.js"></script>
    <script src="plugins/popper.min.js"></script>
    <script src="plugins/bootstrap-4.0.0-beta-dist/js/bootstrap.min.js"></script>
    <script src="plugins/jquery-confirm-3.3.0/jquery-confirm.min.js"></script>
    <script>
        //修改密码
        function mp(){
            $.confirm({
                title : 'tip',
                content : '确认修改？',
                buttons : {
                    确认 : function(){
                        $.ajax({
                            url : 'manage/modify-password',
                            type : 'post',
                            data : $("#modify").serialize(),
                            dataType : 'json',
                            success :function(data){
                                $.alert({
                                    title : 'tip',
                                    content : data.msg,
                                    buttons : {
                                        ok : function(){
                                            if (data.code == 0){
                                                window.location.href = "manage/logout";
                                            }
                                        }
                                    }
                                })
                            },
                            error : function(e){
                                $.alert("请求异常","tip");
                            }
                        })
                    },
                    取消 : function(){

                    }
                }
            })
        }
    </script>
</body>
</html>
