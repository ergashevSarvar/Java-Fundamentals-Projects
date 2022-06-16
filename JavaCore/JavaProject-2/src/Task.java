import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a number: ");
    Integer num = scanner.nextInt();
    boolean musbat = (num / 2) > 0;
    boolean juft = (num % 2) == 0;
    if (musbat && juft) System.out.println("Ushbu son musbat va juft");
    if (musbat && !juft) System.out.println("Ushbu son musbat va toq");
    if (!musbat && juft) System.out.println("Ushbu son manfiy va juft");
    if (!musbat && !juft) System.out.println("Ushbu son manfiy va toq");
  }
}
