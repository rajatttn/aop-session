package ex1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectImpl {

    @Before("execution(void doSomething())")
    public void print()
    {
        System.out.println("Running before advice -1");
    }

    @Before("execution( * do*())")
    void beforeAdvice() {
        System.out.println("Running before advice 0");
    }
    @Before("execution( * com.spring.demo.Dummy.*())")
    void beforeAdvice2() {
        System.out.println("Running before advice 1");
    }

    @Before("execution(void *())")
    void beforeAdvice3() {
        System.out.println("Running before advice 2");
    }

    @Before("execution(* *())")
    void beforeAdvice4() {
        System.out.println("Running before advice 3");
    }

    @Before("execution(* *(..))")
    void beforeAdvice5() {
        System.out.println("Running before advice 4");
    }


}
