package org.ttn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.ttn.publisher.DummyPublisher;

@SpringBootConfiguration
@EnableAsync
public class Main {
    public static void main(String[] args) {
        //ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("org.ttn");
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("org.ttn");
        ctx.start();
        Dummy dummy = ctx.getBean("dummy", Dummy.class);
        dummy.display();
       /* Dummy dummy2 = ctx.getBean("dummy", Dummy.class);
        dummy2.display();*/
       DummyPublisher dp=ctx.getBean("dummyPublisher",DummyPublisher.class);
       dp.display();
        ctx.stop();

    }
}
