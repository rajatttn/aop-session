package ex3;

import org.springframework.stereotype.Component;

@Component("service")
public class ServiceImpl {

    public void display()
    {
        System.out.println("display method");
    }
}
