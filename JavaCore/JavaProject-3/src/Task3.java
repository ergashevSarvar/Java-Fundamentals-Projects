import java.util.Scanner;

public class Task3 {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.print("Enter first number (a): ");
    int number1 = scanner.nextInt();
    System.out.print("Enter second number (b): ");
    int number2 = scanner.nextInt();

    int a = number1;
    int b = number2;
    int temp; // oraliq o`zgaruvchi
    temp = a; // a ning qiymatini vaqtincha saqlab turish
    a = b; // b ning qiymatini a ga o`zlashtirish

    b = temp; // b ga a ning saqlangan qiymatini o`zlashtirish

    System.out.println("Reversed variable of a = " + a);

    System.out.println("Reversed variable of b = " + b);
  }
}
