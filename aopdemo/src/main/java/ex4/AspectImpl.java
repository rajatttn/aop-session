package ex4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectImpl {
    @Before("execution(Integer getInteger(Integer))")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Running before advice");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getSignature());
        Object [] objects=joinPoint.getArgs();
        for (Object object:objects){
            System.out.println(object);
        }
    }


}
