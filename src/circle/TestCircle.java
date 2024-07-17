package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c0 = new Circle();
        Circle c = new Circle();
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c.setRadius(1);
        c1.setRadius(2);
        c2.setRadius(3);
        System.out.println(c0.getArea());

    }
}
