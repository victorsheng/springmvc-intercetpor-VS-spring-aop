package com.example.springaopinterceptor.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class A extends Parent {


  @Pointcut("@annotation(com.example.springaopinterceptor.annotation.A)")
  private void aspectjMethod() {

  }


  @Before(value = "aspectjMethod()")
  public void beforeAdvice(JoinPoint point) {
    // DO Nothing
    super.beforeAdvice(point);
  }


  @After(value = "aspectjMethod()")
  public void afterAdvice(JoinPoint joinPoint) {
    // DO Nothing
    super.afterAdvice(joinPoint);
  }

  @Around(value = "aspectjMethod()")
  public Object aroundAdvice(ProceedingJoinPoint point) throws Throwable {
    return super.aroundAdvice(point);
  }


}
