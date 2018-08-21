package com.wd.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wd.dubbo.pojo.LoginUser;
import com.wd.dubbo.service.LoginService;
import com.wd.mylogin.dao.AppAccountMapper;
import com.wd.mylogin.model.AppAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class LoginServiceImpl implements LoginService {

    @Autowired
    AppAccountMapper appUserMapper;

    @Override
    public LoginUser getLoginUser(int userId) {
        LoginUser login = new LoginUser();

        Page<AppAccount> page = PageHelper.offsetPage(1,100);
        AppAccount appUser = appUserMapper.selectByUserId(userId);

        BeanUtils.copyProperties(appUser,login);

        page.getTotal();

        return login;
    }
}
