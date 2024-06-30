public class Main {
  // driver code
  public static void main(String[] args) {
    int[][] matrix = {{ 1, 2, 3, 4 },
                      { 5, 6, 7, 8},
                      { 9, 0, 1, 2}};

    System.out.println("ROW WISE TRAVERSAL");
    rowWiseTraversal(matrix);
    System.out.println("\nCOLUMN WISE TRAVERSAL");
    columnWiseTraversal(matrix);
  }

  static void rowWiseTraversal(int[][] matrix) {
    int m = matrix.length, n = matrix[0].length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void columnWiseTraversal(int[][] matrix) {
    int m = matrix.length, n = matrix[0].length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
  }
}
