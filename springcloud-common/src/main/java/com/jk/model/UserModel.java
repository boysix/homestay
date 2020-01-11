package com.jk.model;

public class UserModel {

    private Integer userId;
    private String  userNiCheng;    // 昵称
    private String  userAccount;    // 账号
    private String  userPasw;       // 密码
    private String  userPhone;      // 手机号
    private String  userMail;       // 邮箱
    private String  userzhucheDate; // 注册日期

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNiCheng() {
        return userNiCheng;
    }

    public void setUserNiCheng(String userNiCheng) {
        this.userNiCheng = userNiCheng;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPasw() {
        return userPasw;
    }

    public void setUserPasw(String userPasw) {
        this.userPasw = userPasw;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserzhucheDate() {
        return userzhucheDate;
    }

    public void setUserzhucheDate(String userzhucheDate) {
        this.userzhucheDate = userzhucheDate;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId=" + userId +
                ", userNiCheng='" + userNiCheng + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userPasw='" + userPasw + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userzhucheDate='" + userzhucheDate + '\'' +
                '}';
    }
}
