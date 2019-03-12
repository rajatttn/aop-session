package ex2;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectImpl {

    @AfterReturning(pointcut = "execution(Integer getInteger())", returning = "returnValue")
    void afterReturningAdvice(Integer returnValue) {
        System.out.println("Running AfterReturning " + returnValue);
    }

    @AfterThrowing(pointcut = "execution(void throwException())", throwing = "ex")
    void afterReturningAdvice(Exception ex) {
        System.out.println("Running AfterThrowing " + ex);
    }

    @After("execution(void display())")
    void afterAdvice(){
        System.out.println("Running after advice");
    }

}
