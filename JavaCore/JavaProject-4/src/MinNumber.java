import java.util.Scanner;

public class MinNumber {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter num3: ");
        int num3 = scanner.nextInt();

        int min = num1;
        if (min > num2) min = num2;
        if (min > num3) min = num3;

        System.out.println("MIN: " + min);


    }
}
