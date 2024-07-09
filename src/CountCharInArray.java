import java.util.Scanner;

public class CountCharInArray {
    public static int charCountInArray(String arr, Character c) {
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == c) {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao mot chuoi: ");
        String arr = sc.nextLine();

        System.out.println("Nhap vao mot ki tu: ");
        Character c = sc.next().charAt(0);

        System.out.println(charCountInArray(arr,c));
    }
}
