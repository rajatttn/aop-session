package ex4;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@PointCuts and Joincuts

@EnableAspectJAutoProxy
@SpringBootConfiguration
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("ex4");
        ServiceImpl service=ctx.getBean("service", ServiceImpl.class);
        service.getInteger(10);
    }

}
