<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2018/10/12
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="common/head.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/scripts/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/scripts/js.js">

</script>

<h1>你现在所在的页面是：用户管理页面</h1>


<form action="${pageContext.request.contextPath}/jsp/user.do" method="get">
    <input name="method" value="query" type="hidden">
    用户名：
    <input name="queryname" class="input-text" type="text" value="${queryUserName}">

    用户角色：
    <select name="queryUserRole">
        <c:if test="${roleList != null}">
            <option value="0">请选择</option>
            <c:forEach var="role" items="${roleList}">
                <option
                        <c:if test="${role.id==queryUserRole}">selected="selected"</c:if>
                        value="${role.id}">
                        ${role.roleName}
                </option>
            </c:forEach>
        </c:if>
    </select>

    <input type="hidden" name="pageIndex" value="1"/>

    <input type="submit" value="查 询" id="searchButton">

    <a href="${pageContext.request.contextPath}/jsp/useradd.jsp">添加用户</a>


</form>
<table cellpadding="0" cellspacing="0">
    <tr>
        <th width="10%">用户编码</th>
        <th width="20%">用户名称</th>
        <th width="10%">性别</th>
        <th width="10%">年龄</th>
        <th width="10%">电话</th>
        <th width="10%">用户角色</th>
        <th width="30%">操作</th>
    </tr>
    <c:forEach var="user" items="${userList}" varStatus="status">
        <tr>
            <td>${user.userCode}</td>
            <td>${user.userName}</td>
            <td>
                <c:if test="${user.gender==1}">男</c:if>
                <c:if test="${user.gender==2}">女</c:if>
            </td>
            <td>${user.age}</td>
            <td>${user.phone}</td>
            <td>&nbsp&nbsp${user.role.roleName}</td>
            <td>
                <a href="javascript:;" userid="${user.id}" username="${user.userName}">增</a>
                <a href="javascript:;" userid="${user.id}" username="${user.userName}">改</a>
                <a href="javascript:;"  class="deleteUser" userid="${user.id}"
                   username="${user.userName}" name="del" value="${user.id}">删</a>

            </td>
        </tr>
    </c:forEach>
</table>
<input type="hidden" id="totalPageCount" value="${totalPageCount}">
<c:import url="rollpage.jsp">
    <c:param name="totalCount" value="${totalCount}"></c:param>
    <c:param name="currentPageNo" value="${currentPageNo}"></c:param>
    <c:param name="totalPageCount" value="${totalPageCount}"></c:param>
</c:import>
<a href="${pageContext.request.contextPath}/jsp/user.do">k</a>
