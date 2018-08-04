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
@Order(3)
public class B extends Parent {


  @Pointcut("@annotation(com.example.springaopinterceptor.annotation.B)")
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
