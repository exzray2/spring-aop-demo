package com.exzray.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.exzray.model.ShoppingCart.checkout(..))")
    public void startCheckout(JoinPoint joinPoint) {
        String status = (String) joinPoint.getArgs()[0];
        System.out.println("status: " + status);
        System.out.println("Start checkout");
    }

    @After("execution(* *.*.*.*.checkout(..))")
    public void endCheckout() {
        System.out.println("End checkout");
    }

    @AfterReturning(pointcut = "execution(* com.exzray.model.ShoppingCart.checkout(..))", returning = "retVal")
    public void afterCheckout(String retVal) {
        System.out.println("message after returning: " + retVal);
    }

    @Pointcut("execution(int com.exzray.model.ShoppingCart.quantity())")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterQuantity(Object retVal){
        System.out.println("Cart quantity: " + retVal);
    }
}
