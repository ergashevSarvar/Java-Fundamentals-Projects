import java.util.Scanner;

public class Santimetr {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter santimetres of something it will convert to metr: ");
    int santimetr = scanner.nextInt();
    int metr = santimetr / 100;
    int sm2 = santimetr % 100;
    System.out.println(metr + " metr. " + sm2 + " santimetr ");
  }
}
