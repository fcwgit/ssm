<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>用户列表</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <script type="text/javascript">
        function deleteSelect() {
            document.userForm.action="${pageContext.request.contextPath}/deleteImUser.action";

            document.userForm.submit();
        }
        function queryImUser() {
            document.userForm.action="${pageContext.request.contextPath}/queryImUser.action";

            document.userForm.submit();
        }
        
    </script>
</head>
<body>
    当前用户：${username}，
    <c:if test="${username != null}">
        <a href="${pageContext.request.contextPath}/logout.action">退出</a>
    </c:if>

    <form name="userForm" method="post">
        查询条件${pageContext.request.contextPath}：
        <table width="100%" border="1">
            <tr>
                <td>
                    <select>
                        <c:forEach items="${itemType}" var="type">
                            <option value="${type.key}">${type.value}</option>
                        </c:forEach>
                    </select>
                </td>
                <td><input type="button" value="查询" onclick="queryImUser()"/></td>
                <td><input type="button" value="批量删除" onclick="deleteSelect()"></td>
            </tr>
        </table>
        商品列表：
        <table width="100%" border="1">
            <tr>
                <td>选择</td>
                <td>姓名</td>
                <td>编号</td>
                <id>机构</id>
                <td>住址</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${imUserList}" var="imUser">
                <tr>
                    <td><input type="checkbox" name="ids" value="${imUser.id}"></td>
                    <td>${imUser.name}</td>
                    <td>${imUser.id}</td>
                    <td>${imUser.branchid}</td>
                    <td>${imUser.address}</td>
                    <td><a href="${pageContext.request.contextPath}/queryImUserById.action?id=${imUser.id}">修改</a> </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>
