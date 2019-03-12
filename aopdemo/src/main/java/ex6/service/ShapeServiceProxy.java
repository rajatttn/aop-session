package ex6.service;

import ex6.MyOwnAspect;
import ex6.model.Circle;
import ex6.service.ShapeService;

public class ShapeServiceProxy extends ShapeService {

    @Override
    public Circle getCircle() {
        /* i can implement code here before the actual method is called... */
        new MyOwnAspect().loggingAdvice();
        Circle circle =  super.getCircle();
        /* i can implement code here after the actual method is called... */
        new MyOwnAspect().loggingAdvice();
        return circle;
    }
}
