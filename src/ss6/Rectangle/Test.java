package ss6.demo;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(true,"yellow",3);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(false, "white", 3, 2);
        System.out.println(rectangle.toString());
        System.out.println("Diện tích hcn là: " + rectangle.getArea());
        System.out.println("Chu vi hcn là: "+rectangle.getPerimeter());
        System.out.println("Diện tích hình tròn là: "+circle.getArea());
    }
}
