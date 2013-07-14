public class ex1_7 {
    public static void zero(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] columns = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean zero = (matrix[i][j] == 0);
                rows[i] |= zero;
                columns[j] |= zero;
            }
        }

        for (int i = 0; i < columns.length; i++) {
            if (columns[i]) {
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        for(int i = 0; i < rows.length; i++) {
            if (rows[i])
                matrix[i] = new int[n];
        } 
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] generate(int m, int n) {
        int[][] matrix = new int[m][n];
        int value = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = value++ % 3;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = generate(8,6);
        print(matrix);
        System.out.println();
        zero(matrix);
        print(matrix);
    }
}
