package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CatAspect {
    //@Pointcut("execution(* org.example.Cat.s*(..))")
    public void allCatmethods(){}
   // @Before("allCatmethods()")
    public void beforeAllMethods(JoinPoint jp){
        //jp.getSignature().
        System.out.println("Before");
    }
  //  @After("allCatmethods()")
    public void afterAllMethods(){
        System.out.println("Before");
    }
   // @Around("execution(* org.example.Cat.e*(..))")
    public void aroundEat(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Начало");
            Object value = pjp.proceed();
        System.out.println("Конец");
    }
   // @Before("@annotation(org.example.SayMeow)")
    public void sayMeow(){
        System.out.println("Мяу ! А потом ...");
    }
    @AfterThrowing("execution(* org.example.Cat.*(..))")
    public void ifCatIsBroken(){
        System.out.println("Какой ужас !!");
    }
}
