package com.springboot.aspect;


import com.springboot.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class GeneralAspect {

//  @Pointcut("execution(* com.springboot.controller.*.*(..))")
//  @Pointcut("within(com.springboot.services.*)")
//  @Pointcut("within(com.springboot..*)")
//  @Pointcut("this(com.springboot.services.EmployeeService)")
  @Pointcut("@annotation(com.springboot.annotation.CustomAnnotation)")
  public void loggingPointCut() {
  }

//  @Before("loggingPointCut()")
//  public void before(JoinPoint jointPoint) {
//    log.info("Before method invoke: " + jointPoint.getSignature());
//  }
//
//  @After("loggingPointCut()")
//  public void after(JoinPoint jointPoint) {
//    log.info("After method invoke: " + jointPoint.getSignature());
//  }

//  @AfterReturning(value = "execution(* com.springboot.controller.*.*(..))", returning = "employee")
//  public void afterReturning(JoinPoint jointPoint, Employee employee) {
//    log.info("After method invoke: " + employee);
//  }
//
//  @AfterThrowing(value = "loggingPointCut()", throwing = "exp")
//  public void afterThrowing(JoinPoint jointPoint, Exception exp) {
//    log.info("After method invoke: " + exp.getMessage());
//  }


  @Around(value = "loggingPointCut()")
  public Object around(ProceedingJoinPoint jointPoint) throws Throwable {
    log.info("Before method invoke: " + jointPoint.getArgs()[0]);

    Object object = jointPoint.proceed();

    if (object instanceof Employee) {
      log.info("After method invoked: " + ((Employee) object).getName());
    }
    return object;
  }

}
