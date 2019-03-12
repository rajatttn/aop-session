package ex6.model;

import javax.management.RuntimeErrorException;

public class Circle {

    private String name;

    public String getName() {
        System.out.println("Circle getter called");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Circle's setter has been called");
        throw new RuntimeErrorException( new Error("Error!!!"));
    }

    public String setNameAndReturn(String name) {
        this.name = name;
        System.out.println("Circle's setter has been called");
        return name;
    }


}
