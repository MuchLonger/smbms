package cn.smbms.service.user;

import cn.smbms.Utils.MybatisUtil;
import cn.smbms.dao.role.RoleMapper;
import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @description:
 * @Time: 2018/10/12 22:01
 */
public class RoleServiceImpl implements RoleService {

    RoleMapper roleMapper=null;
    SqlSession session=null;

    public RoleServiceImpl(){
        session=MybatisUtil.getSession();
        roleMapper= session.getMapper(RoleMapper.class);
    }


    @Override
    public List<Role> getRoleList() {
        sessionOpen();

        List<Role> roleList=roleMapper.getRoleList();

        sessionClose();
        return roleList;
    }



    //打开数据库会话
    private void sessionOpen() {
        session = MybatisUtil.getSession();
        roleMapper = session.getMapper(RoleMapper.class);
    }

    /*            用来关闭数据库会话              */
    public void sessionClose() {
        if (session != null) {
            session.close();
        }
    }

}
