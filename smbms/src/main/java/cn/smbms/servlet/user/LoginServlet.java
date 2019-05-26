package cn.smbms.servlet.user;

import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import cn.smbms.service.user.UserServiceImpl;
import cn.smbms.tools.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @Time: 2018/10/8 21:29
 */
public class LoginServlet extends HttpServlet {
    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("login --------------");

        String userCode = req.getParameter("userCode");
        String userPassword = req.getParameter("userPassword");


        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.login(userCode, userPassword);


        if (null != user) {
            //将session放入
             req.getSession().setAttribute(Constants.USER_SESSION,user);
            //页面跳转
            resp.sendRedirect(getServletContext().getContextPath()+"/jsp/frame.jsp");
        } else {
            req.setAttribute("name", "用户名或密码不正确");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }

    }
}
