package ex4;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("service")
public class ServiceImpl {

    public void doSomething()
    {
        System.out.println("I m doing something");
    }
    public Integer getInteger(Integer integer)
    {
        System.out.println("generating random integer");
        Random rand = new Random();
        return rand.nextInt(50)+integer;
    }
}
