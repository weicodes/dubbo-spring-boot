package com.wd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ProviderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ProviderBootstrap.class,args);

        //new SpringApplicationBuilder(ProviderBootstrap.class)
        //        .web(WebApplicationType.NONE)
        //        .run(args);
    }

}
