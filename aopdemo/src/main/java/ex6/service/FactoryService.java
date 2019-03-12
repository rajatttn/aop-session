package ex6.service;

import ex6.model.Circle;
import ex6.model.Triangle;

public class FactoryService {

    public Object getBean(String beanType) {

        if (beanType.equalsIgnoreCase("shapeService"))
            return new ShapeServiceProxy();

        if (beanType.equalsIgnoreCase("circle"))
            return new Circle();

        if (beanType.equalsIgnoreCase("triangle"))
            return new Triangle();

        return null;
    }
}
