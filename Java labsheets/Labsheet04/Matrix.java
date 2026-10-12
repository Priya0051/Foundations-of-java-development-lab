public class Matrix {
    int[][] matrix = new int[2][2];
    static String matrixType = "2x2 Matrix";

    void addAndSubtract(Matrix other) {
        int[][] sum = new int[2][2];
        int[][] difference = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix[i][j] + other.matrix[i][j];
                difference[i][j] = matrix[i][j] - other.matrix[i][j];
            }
        }

        System.out.println("Matrix Type: " + matrixType);

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            System.out.println(sum[i][0] + " " + sum[i][1]);
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            System.out.println(difference[i][0] + " " + difference[i][1]);
        }
    }

    public static void main(String[] args) {
        int[][] values1 = {{1, 2}, {3, 4}};
        int[][] values2 = {{5, 6}, {7, 8}};

        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();

        m1.matrix = values1;
        m2.matrix = values2;

        m1.addAndSubtract(m2);
    }
}