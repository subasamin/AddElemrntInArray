package stopWatch;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StopWatch stopWatch = new StopWatch();

        System.out.println("Nhap start de bat dau:");
        String start = scanner.nextLine();

        if (start.equalsIgnoreCase("start")){
            stopWatch.start();
        }
        System.out.println("Nhap end de ket thuc:");
        String end = scanner.nextLine();
        if (end.equalsIgnoreCase("end")){
            stopWatch.end();
            System.out.println(stopWatch.getElapsedTime());
        }
    }
}
