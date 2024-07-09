import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println("input weight: ");
        weight = input.nextFloat();
        System.out.println("input height: ");
        height = input.nextFloat();
        float area = weight * height;
        System.out.println("Area is: " + area);
    }
}
