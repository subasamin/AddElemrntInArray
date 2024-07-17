package quadraticEquation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao vao so a: ");
        double a = input.nextDouble();

        System.out.println("Nhap vao so b: ");
        double b = input.nextDouble();

        System.out.println("Nhap vao so c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Phuong trinh co hai nghiem la: " +"\n");
            System.out.println("x1 = "+quadraticEquation.getRoot1());
            System.out.println("x2 = "+quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("Phuong trinh co mot nghiem duy nhat la: "+quadraticEquation.getRoot1());
        }
        else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
