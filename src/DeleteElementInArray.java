import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {1,3,4,5,6,8};
        System.out.println("Nhap phan tu can xoa: ");
        int x = scanner.nextInt();
        int index;
        for (int i = 0; i < array.length; i++) {
            if(x==array[i]) {
                index = i;
                System.out.println(index);
                int elemnt = array[i];
                for (int j = i+1;j<array.length;j++) {
                    array[index] = array[j];
                    index++;
                }
                array[array.length-1] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    }

