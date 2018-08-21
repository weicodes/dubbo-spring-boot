package com.wd.mylogin.model;

public class AppLogin {
    private Integer id;

    private String appName;

    private String loginAction;

    public AppLogin(Integer id, String appName, String loginAction) {
        this.id = id;
        this.appName = appName;
        this.loginAction = loginAction;
    }

    public AppLogin() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getLoginAction() {
        return loginAction;
    }

    public void setLoginAction(String loginAction) {
        this.loginAction = loginAction == null ? null : loginAction.trim();
    }
}