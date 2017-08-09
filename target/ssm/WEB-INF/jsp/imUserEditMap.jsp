<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>用户列表</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <script type="text/javascript">
        function queryImUser() {
            document.userForm.action="${pageContext.request.contextPath}/queryImUser.action";

            document.userForm.submit();
        }
        
        function editSelectImUser() {

            document.userForm.action="${pageContext.request.contextPath}/editSelectImUserMap.action";

            document.userForm.submit();
        }
    </script>
</head>
<body>
    <form name="userForm" method="post">
        查询条件${pageContext.request.contextPath}：
        <table width="100%" border="1">
            <tr>
                <td><input type="button" value="查询" onclick="queryImUser()"/></td>
                <td><input type="button" value="批量修改" onclick="editSelectImUser()"></td>
            </tr>
        </table>
        商品列表：
        <table width="100%" border="1">
            <tr>
                <td>姓名</td>
                <td>编号</td>
                <td>机构</td>
                <td>住址</td>
            </tr>
            <c:forEach items="${imUserList}" var="imUser" varStatus="status">
                <tr>
                    <td><input type="text" name="imUserMap[name]" value="${imUser.name}"></td>
                    <td><input type="text" name="imUserMap[id]" value="${imUser.id}"></td>
                    <td><input type="text" name="imUserMap[branchid]" value="${imUser.branchid}"></td>
                    <td><input type="text" name="imUserMap[address]" value="${imUser.address}"></td>
                </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>
