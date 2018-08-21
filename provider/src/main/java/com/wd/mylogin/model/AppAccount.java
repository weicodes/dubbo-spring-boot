package com.wd.mylogin.model;

public class AppAccount {
    private Integer id;

    private Integer userId;

    private Integer appId;

    private String account;

    private String accountPwd;

    private String accountPwd2;

    public AppAccount(Integer id, Integer userId, Integer appId, String account, String accountPwd, String accountPwd2) {
        this.id = id;
        this.userId = userId;
        this.appId = appId;
        this.account = account;
        this.accountPwd = accountPwd;
        this.accountPwd2 = accountPwd2;
    }

    public AppAccount() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAccountPwd() {
        return accountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd == null ? null : accountPwd.trim();
    }

    public String getAccountPwd2() {
        return accountPwd2;
    }

    public void setAccountPwd2(String accountPwd2) {
        this.accountPwd2 = accountPwd2 == null ? null : accountPwd2.trim();
    }
}