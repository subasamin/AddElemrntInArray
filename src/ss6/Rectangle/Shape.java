package ss6.demo;

public class Shape {
    private String color = "Green";
    private Boolean filled = true;

    public Shape(Boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (getFilled()?"True":"Fale");
    }
}
