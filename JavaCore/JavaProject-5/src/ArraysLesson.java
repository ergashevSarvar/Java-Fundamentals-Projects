import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        //step 1. Massive simple

       // String[] children = {"Aziza", "Anna", "Alice", "Aiwa"};
        String[] children2 = {"Азам", "Боб", "Жасур", "Сарвар"};
        int size = children2.length;
//        for (int i = 0; i < children.length; i++) {
//            System.out.println((i + 1) + " : " + children[i]);
//        }
        // step 2. Array with Object
        String [] childWithUs = new String[10];

        // step 3. Array index

//        String kids = Arrays.copyOf(children, size);

        Arrays.sort(children2);
        System.out.println(children2);
    }
}
