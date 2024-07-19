package ss6.demo;

public class Square extends Shape {
    private double sidee = 1;
    public Square(Boolean filled, String color, double sidee) {
        super(filled, color);
        this.sidee = sidee;
    }

    public double getSidee() {
        return sidee;
    }

    public void setSidee(double sidee) {
        this.sidee = sidee;
    }

    @Override
    public String toString() {
        return "A Square with side="+ getSidee()+", which is a subclass of "+ super.toString();
    }
}
