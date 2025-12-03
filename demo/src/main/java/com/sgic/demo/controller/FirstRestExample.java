package com.sgic.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController //responsebody+requestbody combinne find the path
public class FirstRestExample {
    @GetMapping("/hello")//it like doGet
    public ResponseEntity<Object> getAll(){
        return ResponseEntity.ok("Hello this my REST API");

    }
    @RequestMapping("/hello-first")//it like webservlet
    public Map<String ,String>callMethod(){
        Map<String,String> map=new HashMap<>();
        map.put("Message","Hello");
        map.put("message","Nilu");
        return map;
    }


}
