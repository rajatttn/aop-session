package ex3;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@Around advice

@EnableAspectJAutoProxy
@Configuration
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("ex3");
        ServiceImpl service=ctx.getBean("service", ServiceImpl.class);
        service.display();
    }

}
