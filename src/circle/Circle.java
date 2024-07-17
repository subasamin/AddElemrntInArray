package circle;

import java.awt.*;

public class Circle {
    private double radius;
    private String color = "red";
    Circle(){
        this.radius = 10;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }
    protected double getArea(){
        return Math.PI * radius * radius;
    }
}
