package ex5;

import org.springframework.stereotype.Component;

@Component("service")
public class ServiceImpl {

    @Loggable
    public void doSomething()
    {
        System.out.println("I m doing something");
    }
}
