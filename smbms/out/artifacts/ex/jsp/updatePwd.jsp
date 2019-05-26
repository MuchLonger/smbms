<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/10/10
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>密码修改页</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/jsp/user.do" method="get">
    <%-- 用于给后端做判断方法 --%>
    <input type="hidden" name="method" value="savepwd">

    <h1>${message}</h1>

    当前密码： <input type="password" name="oldpassword" ></br>
    更改密码：<input type="password" ></br>
    重复密码：<input type="password" name="newpassword" ></br>
    <input type="submit" value="保存">
</form>

</body>
</html>
