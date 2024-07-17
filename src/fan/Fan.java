package fan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    public int speed;
    public boolean on;
    private double radius;
    private String color;

    public Fan(String color, double radius, boolean on, int speed) {
        this.color = "blue";
        this.radius = 5;
        this.on = false;
        this.speed = SLOW;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on){
            return "fan is on";
        }
        else {
            return "fan is off";
        }
    }
}
