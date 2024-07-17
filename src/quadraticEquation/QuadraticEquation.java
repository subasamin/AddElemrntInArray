package quadraticEquation;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getDiscriminant(){
        return this.b* this.b - 4* this.a* this.c;
    }
    double getRoot1(){
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }
    double getRoot2(){
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

}
