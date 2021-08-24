package zky.demo.domain;

public class UserRole {
    private String userName;
    private String roleMemo;

    public UserRole(String userName, String roleMemo) {
        this.userName = userName;
        this.roleMemo = roleMemo;
    }

    public UserRole() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleMemo() {
        return roleMemo;
    }

    public void setRoleMemo(String roleMemo) {
        this.roleMemo = roleMemo;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userName='" + userName + '\'' +
                ", roleMemo='" + roleMemo + '\'' +
                '}';
    }
}
