package rectangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai hcn: ");
        double a = sc.nextDouble();
        System.out.println("Nhap vao chieu rong hcn: ");
        double b = sc.nextDouble();
        rectangle hcn = new rectangle(a,b);
        System.out.println(hcn.display());
    }
}
