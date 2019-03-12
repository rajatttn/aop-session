package ex2;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("service")
public class ServiceImpl {
    public Integer getInteger()
    {
        System.out.println("generating random integer");
        Random rand = new Random();
        return rand.nextInt(50);
    }

    public void throwException()
    {
        System.out.println("throwing exception");
        throw new RuntimeException("test exception");
    }

    public void display()
    {
        System.out.println("inside display method");
        throw new RuntimeException("jhgdjfs");
    }
}
