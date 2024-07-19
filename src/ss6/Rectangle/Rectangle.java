package ss6.demo;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;
    public Rectangle(Boolean filled, String color, double width, double height) {
        super(filled, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return width + height;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and length = "+getHeight()+", which is a subclass of " +super.toString() ;
    }
}
