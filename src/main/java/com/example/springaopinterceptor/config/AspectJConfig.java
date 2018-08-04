package com.example.springaopinterceptor.config;

import com.example.springaopinterceptor.advice.A;
import com.example.springaopinterceptor.advice.B;
import com.example.springaopinterceptor.advice.C;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectJConfig {

  @Bean
  public AnnotationAwareAspectJAutoProxyCreator get() {
    return new AnnotationAwareAspectJAutoProxyCreator();
  }

  @Bean
  public A getA() {
    return new A();
  }

//  @Bean
//  public B getB() {
//    return new B();
//  }
//
//  @Bean
//  public C getC() {
//    return new C();
//  }

}
