package com.sgic.demo.controller;

import com.sgic.demo.config.AppConfiguttils;
import com.sgic.demo.utils.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AppConfiguttils appConfiguttils;


    @GetMapping
    public String config(){
    return appConfiguttils.getAppname();
    }
}

//    @GetMapping
//    ResponseEntity <ResponseWrapper<String>> getApp() {
//        String appName = appConfiguttils.getAppname();
//        if (appName != null && !appName.isEmpty()) {
//            return ResponseEntity.ok();
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND);
//        }

