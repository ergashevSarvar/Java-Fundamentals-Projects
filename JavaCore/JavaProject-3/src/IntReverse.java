import java.util.Scanner;

public class IntReverse {
    public static void main(String[] args) {
        /*
         *
         * */
        System.out.println("Enter a number between 0 and 100: ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        if (number < 0 || number > 100) {
            System.out.println("-------------------------------------------");
            System.out.println("This number is not accepted! Please Enter number between 0 and 100");
            System.out.println("-------------------------------------------");
        }

        /*
         * Check numbers between 0 and 9
         * Should use variables with specific purpose
         * */

        Integer rightElement = number % 10;
        Integer leftElement = number / 10;

        if (number < 10) {
            System.out.println(number);
        } else {
            if (rightElement == 0) System.out.println(leftElement);
            else System.out.println(rightElement + "" + leftElement);
        }

        // TASK #2 0-100 gacha son berigan INTEGER typeda teskariga almashtirish algoritmini tuzish
    }
}
