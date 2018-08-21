package com.wd.dubbo.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.wd.dubbo.pojo.LoginUser;
import com.wd.dubbo.service.DemoService;
import com.wd.dubbo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Reference(
            version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}"
    )
    private LoginService loginService;

    @RequestMapping("/user")
    public LoginUser user() {
        return loginService.getLoginUser(1);
    }

}
