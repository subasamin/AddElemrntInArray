package rectangle;

public class rectangle {
    double width;
    double height;
    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Dien tich hcn la: "+ getArea() + " Chu vi hcn la: "+ getPerimeter();
    }
}
