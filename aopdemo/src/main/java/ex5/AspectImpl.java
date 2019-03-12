package ex5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectImpl {

    @Around("@annotation(ex5.Loggable)")
    public void runAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("before Execution");
        proceedingJoinPoint.proceed();
        System.out.println("after Execution");

    }


}
