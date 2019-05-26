package cn.smbms.servlet.user;

import cn.smbms.pojo.Role;
import cn.smbms.pojo.User;
import cn.smbms.pojo.UserWithRole;
import cn.smbms.service.user.RoleService;
import cn.smbms.service.user.RoleServiceImpl;
import cn.smbms.service.user.UserService;
import cn.smbms.service.user.UserServiceImpl;
import cn.smbms.tools.Constants;
import cn.smbms.tools.PageSupport;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.hsf.HSFJSONUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

/**
 * @description:
 * @Time: 2018/10/8 21:34
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");

        System.out.println("method----->    " + method);

        if (method != null && method.equals("add")) {

        } else if (method != null && method.equals("query")) {
            this.query(req, resp);
        } else if (method != null && method.equals("getrolelist")) {

        } else if (method != null && method.equals("ucexist")) {

        } else if (method != null && method.equals("deluser")) {
            deluser(req, resp);
        } else if (method != null && method.equals("view")) {
            this.getUserById(req,resp,"userview.jsp");
        } else if (method != null && method.equals("modify")) {

        } else if (method != null && method.equals("modifyexe")) {

        } else if (method != null && method.equals("pwadmodify")) {
            this.getPwdByUserId(req, resp);
        } else if (method != null && method.equals("savepwd")) {
            this.updatePwd(req, resp);
        }


    }

    private void updatePwd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Object o = request.getSession().getAttribute(Constants.USER_SESSION);

        String newPassword = request.getParameter("newpassword");

        System.out.println("newPassword ----> " + newPassword);
        boolean flag = false;
        if (o != null && newPassword != null && newPassword != "") {
            UserService userService = new UserServiceImpl();
            flag = ((UserServiceImpl) userService).updatePwd(((User) o).getId(), newPassword);
            if (flag) {
                request.setAttribute(Constants.SYS_MESSAGE, "修改密码成功，请退出并使用密码登陆");
                request.getSession().removeAttribute(Constants.USER_SESSION);
            } else {
                request.setAttribute(Constants.SYS_MESSAGE, "修改密码失败");
            }
        } else {
            request.setAttribute(Constants.SYS_MESSAGE, "密码不能为空，修改密码失败");
        }

        request.getRequestDispatcher("pwdmodify.jsp").forward(request, response);

    }

    private void getPwdByUserId(HttpServletRequest request, HttpServletResponse response) {

    }


    private void query(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("charset=utf-8");
        //用户的列表（用以查询）
        String queryUserName = request.getParameter("queryname");
        System.out.println("cqy!!!!!"+queryUserName);
        String temp = request.getParameter("queryUserRole");

        String pageIndex = request.getParameter("pageIndex");
        //默认让它为0
        int queryUserRole = 0;

        UserService userService = new UserServiceImpl();

        List<UserWithRole> userList = null;

        //设置页面的容量
        int pageSize = Constants.pageSize;
        //当前的页码
        int currentPageNo = 1;
        if (queryUserName == null) {
            queryUserName = "";
        }
        //用户的名字
        if (temp != null && !temp.equals("")) {
            queryUserRole = Integer.parseInt(temp);
        }
        if (pageIndex != null) {
            try {
                currentPageNo = Integer.valueOf(pageIndex);
            } catch (NumberFormatException e) {
                response.sendRedirect("error.jsp");
            }
        }
        //表的总数量
        int totalCount = ((UserServiceImpl) userService).getUserCount(queryUserName, queryUserRole);

        PageSupport pages = new PageSupport();
        //显示当前第几页
        pages.setCurrentPageNo(currentPageNo);
        //传入每页显示数
        pages.setPageSize(pageSize);
        //传入总数用户数
        pages.setTotalCount(totalCount);

        int totalPageCount = pages.getTotalPageCount();

        //小于最小页的按第一页，大于的按最大页
        if (currentPageNo < 1) {
            currentPageNo = 1;
        } else if (currentPageNo > totalCount) {
            currentPageNo = totalPageCount;
        }

        userList = ((UserServiceImpl) userService).getUserList(queryUserName, queryUserRole, currentPageNo, pageSize);

        request.setAttribute("userList", userList);
        List<Role> roleList = null;


        RoleService roleService = new RoleServiceImpl();
        roleList = roleService.getRoleList();

        request.setAttribute("roleList", roleList);
        request.setAttribute("queryUserName", queryUserName);
        request.setAttribute("queryUserRole", queryUserRole);
        request.setAttribute("totalCount", totalCount);
        request.setAttribute("totalPageCount", totalPageCount);
        request.setAttribute("currentPageNo", currentPageNo);
        request.getRequestDispatcher("userlist.jsp").forward(request, response);
    }


    public void deluser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id=request.getParameter("userId");
        System.out.println("del ----> "+id);

        Integer delId=0;
        delId=Integer.parseInt(id);
        HashMap<String,String> resultMap=new HashMap<>();
        if(delId.intValue()<=0){
            resultMap.put("delResult","notExist");
        }else{
            UserService userService=new UserServiceImpl();
            if(userService.deleteUserById(delId)){
                resultMap.put("delResult","true");
            }else{
                resultMap.put("delResult","false");
            }

            response.setContentType("application/json");
            PrintWriter outPrintWriter=response.getWriter();
            outPrintWriter.print(JSONObject.toJSONString(resultMap));
            outPrintWriter.flush();
            outPrintWriter.close();
        }




    }

    private void getUserById(HttpServletRequest request,HttpServletResponse response,String url){

    }



}
