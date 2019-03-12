package ex1;

import org.springframework.stereotype.Component;

@Component("service")
public class ServiceImpl {

    public void doSomething()
    {
        System.out.println("I m doing something");
    }
}
