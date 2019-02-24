package com.didispace.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import java.util.Random;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Service
public class HelloService {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() throws Exception{
        // 测试超时触发断路器
        int sleepTime = new Random().nextInt(4000);
        logger.info("sleepTime:" + sleepTime);
        Thread.sleep(sleepTime);
        return "hello world";
    }

    public String helloFallback() {
        return "error";
    }



}