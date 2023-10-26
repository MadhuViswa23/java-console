package pro;

public class Matrixx {
 public static void main(String args[]) {
	 
	 int numRows = 2;
	 int numCols = 2;


	 int[][] matrix = new int[numRows][numCols];


	 matrix[0][0] = 1;
	 matrix[0][1] = 2;
	 matrix[1][0] = 4;
	 matrix[1][1] = 5;
	
	 for (int i = 0; i < numRows; i++) {
    for (int j = 0; j < numCols; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println(); 
}
}
}