package cn.smbms.pojo;

/**
 * @description:
 * @Time: 2018/10/12 21:34
 */
public class UserWithRole extends User {
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
