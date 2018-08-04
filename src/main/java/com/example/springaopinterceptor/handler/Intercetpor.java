package com.example.springaopinterceptor.handler;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.omg.CORBA.TIMEOUT;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/i")
public class Intercetpor {


  @RequestMapping(value = "", method = RequestMethod.GET)
  public String hi() throws InterruptedException {
    TimeUnit.MILLISECONDS.sleep(200);
    return UUID.randomUUID().toString();
  }
}
