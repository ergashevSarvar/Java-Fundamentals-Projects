import java.util.Scanner;

public class Math {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 5;
    int number3 = 6;

    System.out.println(" --> " + number1 / number2); // butun qismi chunki int
    System.out.println(" --> " + number1 / number3); // butun qismi chiqadi faqat
    System.out.println(" --> " + number1 % number3); // qoldiq qismi

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num1 = scanner.nextInt();
    System.out.println("Your number: " + num1);
  }
}

// task1
// 1..10 sonlari (juft, toq, musbat, manfiy) ligini aniqlovchi dastur tuzish
// abrcha ASC,DESClarni sinab koramiz
