package com.wd.dubbo.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.wd.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/demo")
public class DemoConsumerController {

    @Reference(
            version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}"
    )
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return demoService.sayHello("xxx");
    }

}
