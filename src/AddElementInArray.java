import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = {1,2,3,5,7,6,9};

        System.out.println("Nhap vao phan tu can them vao mang: ");
        int x = scanner.nextInt();

        System.out.println("Vi tri muon chenf vaof trong mang: ");
        int y = scanner.nextInt();

        int [] newArray = new int[array.length + 1];

        for(int i = 0; i<y ;i++){
           newArray[i] = array[i];
        }

        newArray[y] = x;

        for(int j = y+1;j<newArray.length;j++){
            newArray[j] = array[y];
             y++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
