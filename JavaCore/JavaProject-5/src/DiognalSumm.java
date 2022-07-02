public class DiognalSumm {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 45, 12, 4},
                {15, 9, 17, -8},
                {9, 10, 11, 12},
                {1, 21, 18, 16},
        };
        int matrixSize = matrix.length;
        int sumDiognal = 0;
        int sumDiognal2 = 0;

        for (int i = 0; i < matrixSize; i++) {
            matrixSize--;
            sumDiognal += matrix[i][i];
            sumDiognal2 += matrix[i][matrixSize];
        }
        System.out.println("Left sum of dioganal : " + sumDiognal);
        System.out.println("Right sum of dioganal: " + sumDiognal2);
    }
}
