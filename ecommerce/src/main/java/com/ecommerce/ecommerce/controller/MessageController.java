package com.ecommerce.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecommerce.entities.Message;

// Rest ---> Representational State transfer
/*
    A set of rules that define how applications should communicate over HTTP
*/

// CLEINT ----> SERVER

@RestController
public class MessageController {
    

    @RequestMapping("/hello")
    public Message sayHello(){
        return new Message("Hello World!");
    }
}



