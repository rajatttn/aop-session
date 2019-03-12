package ex5;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@annotation Example

@EnableAspectJAutoProxy
@SpringBootConfiguration
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("ex5");
        ServiceImpl service=ctx.getBean("service", ServiceImpl.class);
        service.doSomething();
    }

}
