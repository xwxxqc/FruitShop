package zky.demo.domain;

import java.util.Date;

public class UserMessage {
    private int id;
    private String userName;
    private Date createTime;
    private Date loginTime;
    private String roleName;

    public UserMessage(String userName, Date createTime, Date loginTime, String roleName) {
        this.userName = userName;
        this.createTime = createTime;
        this.loginTime = loginTime;
        this.roleName = roleName;
    }

    public UserMessage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", createTime=" + createTime +
                ", loginTime=" + loginTime +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
