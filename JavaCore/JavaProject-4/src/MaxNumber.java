import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter num3: ");
        int num3 = scanner.nextInt();

        // step-1 Max variable
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }

        System.out.println(max);
        //step-2 MAX variable
//
//        int[] arr = new int[]{num1, num2, num3};
//        System.out.println("Max number: " + Arrays.stream(arr).max().getAsInt());
    }
}
