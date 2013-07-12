public class ex1_6 {
    public static void rotate(int[][] array) {
    }
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int value = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(value + "\t");
                matrix[i][j] = value++;
            }
            System.out.println();
        }
        
    }
}
