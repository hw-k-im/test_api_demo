package com.test.hwk.test_api_demo.controller;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloCtrl {
  
  @GetMapping("/hello")
  public Map<String, Object> hello(){
    Map<String, Object> response = new HashMap<>();
    ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

    response.put("koreaTime", now.toString());
    response.put("timestamp", System.currentTimeMillis());
    response.put("message", "Hello, World!");

    return response;
  }
  
}
