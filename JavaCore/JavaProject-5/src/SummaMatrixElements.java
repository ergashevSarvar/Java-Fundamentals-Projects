public class SummaMatrixElements {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 45, 5},
                {0, 8, 9, 2, 1},
                {8, 2, 38, 1, 3},
                {9, 17, 8, 24, 7},
        };
        System.out.println("-----------ORIGINAL------------------");
        int matrixSize = matrix.length;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------ELEMENTS ADDED------------------");

        for (int i = 0; i < matrixSize; i++) {
            int sumArr  = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumArr += matrix[i][j];
            }
            System.out.println("Sum of "+(i+1)+"-element: "+sumArr);
        }
    }
}
