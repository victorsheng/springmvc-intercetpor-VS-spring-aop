package com.example.springaopinterceptor.handler;

import com.example.springaopinterceptor.annotation.A;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class Aop {


  @RequestMapping(value = "", method = RequestMethod.GET)
  @A
  public String hi() throws InterruptedException {
    TimeUnit.MILLISECONDS.sleep(200);
    return UUID.randomUUID().toString();
  }
}
