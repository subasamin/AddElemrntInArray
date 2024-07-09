import java.util.Scanner;

public class Displaytypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 1 to print the rectangle ");
        System.out.println("Input 2 to print the square triangle");
        System.out.println("Input 3 to print isosceles triangle ");
        System.out.println("Input 4 to exit ");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                for (int i = 1; i <= 4; i++){
                    for (int j = 1; j <= 7; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++){
                    for (int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++){
                    for (int j = 5; j>=i; j--){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice");
        }
        while (choice != 4){
            System.out.println("Input 1 to print the rectangle ");
            System.out.println("Input 2 to print the square triangle");
            System.out.println("Input 3 to print isosceles triangle ");
            System.out.println("Input 4 to exit ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    for (int i = 1; i <= 4; i++){
                        for (int j = 1; j <= 7; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++){
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++){
                        for (int j = 5; j>=i; j--){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
