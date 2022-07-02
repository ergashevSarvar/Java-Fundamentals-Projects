import java.util.Scanner;

public class RectangleTask {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter height of rectangle: ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            String star = "*";
            String space = " ";
            for (int j = 0; j < i; j++) {
                star = star + "**";
            }
            String spaceBefore = space.repeat(height-i-1);
            star = spaceBefore+star;
            System.out.println(star);
        }

    }
}
