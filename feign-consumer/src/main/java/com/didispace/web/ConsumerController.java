package com.didispace.web;

import com.didispace.dto.*;
import com.didispace.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ConsumerController {


    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("MIMI")).append("\n");
        sb.append(refactorHelloService.hello("MIMI", 20)).append("\n");
        sb.append(refactorHelloService.hello(new com.didispace.dto.User("MIMI", 20))).append("\n");
        return sb.toString();
    }

    @RequestMapping(value = "/test-object", method = RequestMethod.GET)
    public String testUser() {
        return refactorHelloService.helloUser(new User("wan",1));
    }

    @RequestMapping(value = "/test-object1", method = RequestMethod.GET)
    public String testUser1() {
        return refactorHelloService.helloUser(new User(null,1));
    }
}