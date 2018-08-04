package com.example.springaopinterceptor.handler;

import com.example.springaopinterceptor.annotation.A;
import com.example.springaopinterceptor.annotation.B;
import com.example.springaopinterceptor.annotation.C;
import java.util.UUID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class IndexHandler {


  @RequestMapping(value = "", method = RequestMethod.GET)
  @A
  @B
  @C
  public String hi() throws InterruptedException {
    return UUID.randomUUID().toString();
  }
}
