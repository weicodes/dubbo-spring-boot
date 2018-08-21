package com.wd.dubbo.service;

import com.wd.dubbo.pojo.LoginUser;

public interface LoginService {

    LoginUser getLoginUser(int userId);

}