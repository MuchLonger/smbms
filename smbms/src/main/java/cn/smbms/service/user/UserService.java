package cn.smbms.service.user;

import cn.smbms.pojo.User;

/**
 * @description:
 * @Time: 2018/10/9 10:58
 */
public interface UserService {

    User login(String userCode, String userPassword);

    Boolean deleteUserById(Integer delId);

    User getUserById(String id);
}
