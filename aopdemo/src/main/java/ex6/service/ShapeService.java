package ex6.service;

import ex6.model.Circle;
import ex6.model.Triangle;

public class ShapeService {

    private Circle circle;
    private Triangle triangle;


    public Circle getCircle() {
        System.out.println("get Circle called");
        return circle;
    }
    public void setCircle(Circle circle) {
        this.circle = circle;
    }



    public Triangle getTriangle() {
        return triangle;
    }
    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }


}