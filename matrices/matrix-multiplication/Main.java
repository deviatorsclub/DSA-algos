import java.util.Arrays;

public class Main {
    // driver code
    public static void main(String[] args) {
        int[][] mat1 = {{ 1, 2, 3, 4 },
                        { 2, 3, 4, 5 },
                        { 3, 4, 5, 6}};
        int[][] mat2 = {{ 1, 2 },
                        { 3, 4 },
                        { 5, 6 },
                        { 7, 8 }};

        int[][] result = matmul(mat1, mat2);
        for (int[] row: result) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] matmul(int[][] mat1, int[][] mat2) {
        int m1 = mat1.length, n1 = mat1[0].length;
        int m2 = mat2.length, n2 = mat2[0].length;

        int[][] result = new int[m1][n2];
      
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return result;
    }
}
