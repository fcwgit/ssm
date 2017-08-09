<%--
  Created by IntelliJ IDEA.
  User: fanchengwei
  Date: 2017/8/1
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>jsonTest</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        function requestJson() {
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/requestJson.action",
                contentType:"application/json;charset=utf-8",
                data:'{"name":"手机","id":"123"}',
                success:function (data) {
                    alert(data);
                }
            });
        }

        function responseJson() {
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/responceJson.action",
                data:'name=abc&id=123',
                success:function (data) {
                    alert(data);
                }
            });
        }
    </script>

</head>
<body>
<input type="button" value="请求json" onclick="requestJson();"/>
<input type="button" value="请求key-value" onclick="responseJson();"/>
</body>

</html>
