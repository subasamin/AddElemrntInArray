package ss1.demo;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input a: ");
        double a = scanner.nextDouble();

        System.out.println(" input b: ");
        double b = scanner.nextDouble();

        System.out.println(" input c: ");
        double c = scanner.nextDouble();

        if (a != 0){
            double answer = (c-b)/a;
            System.out.println(" Phuong trinh co nghiem la: " + answer);
        }
        else {
            if (b==c){
                System.out.println(" Phuong trinh co vo so nghiem");
            }
            else {
                System.out.println(" Phuong trinh vo nghiem");
            }
        }
    }
}
