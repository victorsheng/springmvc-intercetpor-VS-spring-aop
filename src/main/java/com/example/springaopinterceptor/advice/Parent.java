package com.example.springaopinterceptor.advice;

    import org.aspectj.lang.JoinPoint;
    import org.aspectj.lang.ProceedingJoinPoint;

public class Parent {

  public void beforeAdvice(JoinPoint point) {
    System.out.println("beforeAdvice--------" + this.getClass());

  }

  public void afterAdvice(JoinPoint joinPoint) {
    System.out.println("afterAdvice--------" + this.getClass());
  }

  public Object aroundAdvice(ProceedingJoinPoint point) throws Throwable {
    System.out.println("aroundAdvice--------" + this.getClass());
    return point.proceed(point.getArgs());
  }
}
