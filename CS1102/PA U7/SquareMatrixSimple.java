package squarematrixsimple;

public class SquareMatrix {

    public static void main(String[] args) {
            // enter the matrix
        int[][] matrix = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
                {13, 14, 15}
        };

            // declare variables
        int numberOfRows = matrix.length; // number of rows
        int numberOfColumns = matrix[0].length; // number of columns
        int secDiagSum = 0; // sum of diag

            // ...and, in case it is really square, calculate the sum of its secondary diagonal values
        if (numberOfRows == numberOfColumns) {
            for (int i = 0; i < numberOfRows; i++) { // iterate through the rows
                secDiagSum += matrix[i][numberOfRows - (i + 1)]; // add each secondary diagonal value
            }
        System.out.println("Secondary diagonal values sum: " + secDiagSum);
        } else {
        System.out.println("This is not a square matrix!");
        }
    }
}
