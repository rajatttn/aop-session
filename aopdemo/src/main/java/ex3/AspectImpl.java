package ex3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectImpl {

    @Around("execution(void display())")
    void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around before");
        System.out.println(proceedingJoinPoint.getSignature());
        proceedingJoinPoint.proceed();
        System.out.println("Around after");
    }

}
