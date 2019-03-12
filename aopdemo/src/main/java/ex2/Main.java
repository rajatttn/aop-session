package ex2;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@AfterReturn and @AfterThrowing

@EnableAspectJAutoProxy
@SpringBootConfiguration
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("ex2");
        ServiceImpl service=ctx.getBean("service", ServiceImpl.class);
        //service.getInteger();
        service.display();
        //service.throwException();


    }

}
