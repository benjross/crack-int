public class ex1_6 {
	public static int[][] rotate(int[][] array) {
		int n = array.length;
		int[][] tmp = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tmp[j][n - 1 - i] = array[i][j];
			}
		}	
		return tmp;
	}

	public static void  rotateInPlace(int[][] array) {
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] generate(int n) {
		int[][] matrix = new int[n][n];
		int value = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = value++;
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			System.out.println("A " + i + " x " + i + " matrix:");
			int[][] matrix = generate(i);
			print(matrix);
			System.out.println("\nRotated:");
			print(rotate(matrix));
			System.out.println();
		}
	}
}
