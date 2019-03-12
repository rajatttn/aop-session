package ex1;

import ex1.AspectImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@Before basics

@EnableAspectJAutoProxy
@SpringBootConfiguration
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("ex1");
        ServiceImpl service=ctx.getBean("service", ServiceImpl.class);
        service.doSomething();
    }

}
