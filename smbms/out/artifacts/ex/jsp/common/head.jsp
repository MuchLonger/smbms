<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/10/9
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>超市管理系统</title>
</head>
<body>
<ul>
    <li><a href="${pageContext.request.contextPath}/jsp/bill.do?method=query">订单管理</a> </li>
    <li><a href="${pageContext.request.contextPath}/jsp/provider.do?method=query">供应商管理</a> </li>
    <li><a href="${pageContext.request.contextPath}/jsp/user.do?method=query">用户管理</a> </li>
    <li><a href="${pageContext.request.contextPath}/jsp/updatePwd.jsp">密码修改</a> </li>
    <li><a href="${pageContext.request.contextPath}/jsp/logout.do">退出系统</a> </li>
</ul>

</body>
</html>
