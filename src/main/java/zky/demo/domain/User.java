package zky.demo.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class User implements UserDetails {
    private int id;
    private String userName;
    private String passWord;
    private boolean isEnable;
    private boolean isLock;
    private boolean isCredentials;
    private boolean isExpired;
    private Date createTime;
    private Date loginTime;
    private List<GrantedAuthority> authorities;

    public User(String userName, String passWord, boolean isEnable, boolean isLock, boolean isCredentials,
                boolean isExpired, Date createTime, Date loginTime, List<GrantedAuthority> authorities) {
        this.userName = userName;
        this.passWord = passWord;
        this.isEnable = isEnable;
        this.isLock = isLock;
        this.isCredentials = isCredentials;
        this.isExpired = isExpired;
        this.createTime = createTime;
        this.loginTime = loginTime;
        this.authorities = authorities;
    }

    public User(String userName, String passWord, boolean isEnable,
                boolean isLock, boolean isCredentials, boolean isExpired, Date createTime, Date loginTime) {
        this.userName = userName;
        this.passWord = passWord;
        this.isEnable = isEnable;
        this.isLock = isLock;
        this.isCredentials = isCredentials;
        this.isExpired = isExpired;
        this.createTime = createTime;
        this.loginTime = loginTime;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", isEnable=" + isEnable +
                ", isLock=" + isLock +
                ", isCredentials=" + isCredentials +
                ", isExpired=" + isExpired +
                ", createTime=" + createTime +
                ", loginTime=" + loginTime +
                ", authorities=" + authorities +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public void setCredentials(boolean credentials) {
        isCredentials = credentials;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public int getId() {
        return id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return passWord;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isLock;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentials;
    }

    @Override
    public boolean isEnabled() {
        return isEnable;
    }
}
