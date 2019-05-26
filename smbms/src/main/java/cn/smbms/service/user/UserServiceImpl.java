package cn.smbms.service.user;

import cn.smbms.Utils.MybatisUtil;
import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
import cn.smbms.pojo.UserWithRole;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @description:
 * @Time: 2018/10/9 10:55
 */
public class UserServiceImpl implements UserService {


    private UserMapper userMapper = null;
    private SqlSession session;

    public UserServiceImpl() {
        session = MybatisUtil.getSession();
        userMapper = session.getMapper(UserMapper.class);
    }


    public User login(String userCode, String userPassword) {
        /*            确保数据库回话存在              */
        sessionOpen();
        User u = new User();
        u.setUserCode(userCode);
        u.setUserPassword(userPassword);
        User checkUser = null;
        checkUser = userMapper.getLoginUser(u);

        sessionClose();

        return checkUser;
    }

    public Boolean updatePwd(int id, String pwd) {
        sessionOpen();

        boolean flag = false;
        User u = new User();
        u.setId(id);
        u.setUserPassword(pwd);

        int row = 0;

        row = userMapper.updatePwd(u);
     //   session.commit();

        sessionClose();

        if (row == 1)
            flag = true;

        return flag;

    }

    /*            下面两个都是用以用户表格查询              */
    public int getUserCount(String queryUserName, int queryUserRole) {
        sessionOpen();
        User u = new User();

        u.setUserName(queryUserName);
        u.setUserRole(queryUserRole);

        int count = 0;
        System.out.println("queryUserName -----> " + queryUserName);
        System.out.println("queryUserRole -----> " + queryUserRole);

        count = userMapper.getUserCount(u);

        sessionClose();

        return count;
    }

    public List<UserWithRole> getUserList(String queryUserName, int queryUserRole, int currentPageNo, int pageSize) {
        sessionOpen();

        System.out.println("queryUserName ----> " + queryUserName);
        System.out.println("queryUserRole ----> " + queryUserRole);
        System.out.println("currentPageNo ----> " + currentPageNo);
        System.out.println("pageSize ----> " + pageSize);


        int start = (currentPageNo - 1) * pageSize;

        List<UserWithRole> userList = userMapper.getUserList(queryUserName, queryUserRole, currentPageNo, pageSize);


        sessionClose();
        return userList;
    }

    @Override
    public Boolean deleteUserById(Integer delId) {
        sessionOpen();
        if(delId ==null || delId == 0)
            return false;

        int row=0;
        row=userMapper.deleteUserById(delId);

     //   session.commit();
        sessionClose();
        return row==1?true:false;
    }

    @Override
    public User getUserById(String id){
        sessionOpen();

        User user=userMapper.getUserById(Integer.parseInt(id));


        sessionClose();

        return user;
    }

    /*            下面是用来确保数据Session关闭的两个方法（即每次都关闭，每次都打开）             */

    //打开数据库会话
    private void sessionOpen() {
        session = MybatisUtil.getSession();
        userMapper = session.getMapper(UserMapper.class);
    }

    /*            用来关闭数据库会话              */
    public void sessionClose() {
        if (session != null) {
            session.close();
        }
    }

}
