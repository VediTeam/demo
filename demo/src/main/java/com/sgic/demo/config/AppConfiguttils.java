package com.sgic.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//general purpose
public class AppConfiguttils {

    @Value("${app.name}")
    private String appname;

    @Value("${app.version}")
    private String appversion;

    public  String getAppname(){
        return "App Name : "+appname +" "+"App version : "+appversion;
    }
}
