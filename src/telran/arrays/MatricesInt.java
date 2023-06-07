package telran.arrays;

public class MatricesInt {
public static int[][] multiplyConstant(int[][] matrix, int constant) {
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[i].length; j++) {
			matrix[i][j] *= constant;
		}
	}
	return matrix;
}
public static int[] getColumn(int[][] matrix, int column) {
	int[] result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        result[i] = matrix[i][column];
    }
	return result;
}
public static int[][] transpMatrix (int[][] matrix) {
	 int rows = matrix.length;
	    int cols = matrix[0].length;
	    int[][] transp = new int[cols][rows];
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            transp[j][i] = matrix[i][j];
	        }
	    }
	return transp;
	
}
}