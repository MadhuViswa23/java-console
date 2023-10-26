package pro;

public class MATRIX {

	    public static void main(String[] args) {
	        // Define the dimensions of the matrix
	        int numRows = 2;
	        int numCols = 2;

	        // Create a 2D array to represent the matrix
	        int[][] matrix = new int[numRows][numCols];

	        // Initialize the matrix with values
	        matrix[0][0] = 1;
	        matrix[0][1] = 2;
	        //matrix[0][2] = 3;
	        matrix[1][0] = 4;
	        matrix[1][1] = 5;
	       // matrix[1][2] = 6;
//	        matrix[2][0] = 7;
//	        matrix[2][1] = 8;
//	        matrix[2][2] = 9;

	        // Display the matrix
	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j < numCols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println(); // Move to the next row
	        }
	    }
	}


