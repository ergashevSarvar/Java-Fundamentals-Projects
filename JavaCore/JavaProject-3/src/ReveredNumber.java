import java.util.Scanner;

public class ReveredNumber {
  public static void main(String[] args) {
   /*
   *
   * */
    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    int num2 = num*(-1);

    System.out.println(num2);
  }
}
