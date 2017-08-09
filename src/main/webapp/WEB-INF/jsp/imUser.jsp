<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>修改用户信息</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
</head>
<body>
    <c:if test="${allErrors!=null}">
        <c:forEach items="${allErrors}" var="error">
            ${error.defaultMessage}<br>
        </c:forEach>
    </c:if>
    <form action="/editImUserValidate.action" method="post" enctype="multipart/form-data">
        <input type="hidden" name="id" value="${imUser.id}">
        修改商品信息
        <table width="100%" border="1">
            <tr>
                <td>姓名11</td>
                <td><input name="name" value="${imUser.name}"></td>
            </tr>
            <tr>
                <td>id</td>
                <td>${imUser.id}</td>
            </tr>
            <tr>
                <td>机构编号</td>
                <td>${imUser.branchid}</td>
            </tr>
            <tr>
                <td>商品图片</td>
                <td><input type="file" name="pictureFile"> </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="提交" width="100%"></td>
            </tr>
        </table>
    </form>
</body>
</html>
