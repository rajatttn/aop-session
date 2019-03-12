package ex6;


//@Weaving

import ex6.service.FactoryService;
import ex6.service.ShapeService;

//@EnableAspectJAutoProxy
//@SpringBootConfiguration
public class Main {
    public static void main(String[] args) {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        //ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);

        //shapeService.getCircle().setNameAndReturn("my Circle");

        FactoryService factoryService = new FactoryService();
        ShapeService shapeService =(ShapeService)  factoryService.getBean("ShapeService");
        shapeService.getCircle();
        //System.out.println("CIRCLE NAME: " + shapeService.getCircle().getName());
        //System.out.println("TRIANGLE NAME: " + shapeService.getTriangle().getName());
    }

}
