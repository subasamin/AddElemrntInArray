package ss6.Circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"green");
        Cylinder cylinder = new Cylinder(4,"black",5);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
        System.out.println("Dien tich hinh tron la: "+circle.getArea());
        System.out.println("The tich hinh tru la: "+cylinder.getArea());
    }
}
