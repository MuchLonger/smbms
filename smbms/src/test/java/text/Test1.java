package text;

import cn.smbms.Utils.MybatisUtil;
import cn.smbms.dao.role.RoleMapper;
import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.Role;
import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import cn.smbms.service.user.UserServiceImpl;
import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @Time: 2018/10/12 16:53
 */
public class Test1 {
    @Test
    public void test1() {
        UserMapper mapper = MybatisUtil.getSession().getMapper(UserMapper.class);

        List<User> dateList = mapper.getDate();
        System.out.println(dateList);
    }

    @Test
    public void test2(){
        int t=20;
        int b=6;
        System.out.println(23/6);
    }

    @Test
    public void m1(){
        SqlSession session = MybatisUtil.getSession();
        RoleMapper roleMapper = session.getMapper(RoleMapper.class);

        List<Role> roleList=roleMapper.getRoleList();

        for (Role r :
                roleList) {
            System.out.println(r.getRoleName());
        }

    }

    @Test
    public void m2(){
        UserService userService=new UserServiceImpl();

        userService.deleteUserById(14);

    }

    @Test
    public void m3(){
        Map<String,String> map=new HashMap<>();

        map.put("success","true");

        System.out.println(JSONArray.toJSONString(map));

    }

    @Test
    public void m4(){
        SqlSession sqlSession=MybatisUtil.getSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        User user=userMapper.getUserAddr(5);
        System.out.println(user.getAddress());


        if(sqlSession!=null){
            sqlSession.close();
        }
    }

}

