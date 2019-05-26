package cn.smbms.dao.user;

import cn.smbms.pojo.User;
import cn.smbms.pojo.UserWithRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @Time: 2018/10/8 23:19
 */
public interface UserMapper {
    User getLoginUser(User user);

    int updatePwd(User user);


    int getUserCount(User user);

    List<UserWithRole> getUserList(@Param("userName") String queryUserName, @Param("role") Integer queryUserRole, @Param("start") Integer start, @Param("num") Integer num);

    List<User> getDate();

    int deleteUserById(@Param("id") Integer id);

    User getUserById(@Param("id") Integer id);

    User getUserAddr(@Param("id") Integer id);
}
