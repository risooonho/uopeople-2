package squarematrixadv;

public class SquareMatrix {

    public static void main(String[] args) {
            // enter the matrix
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

            // declare variables
        boolean isSquare = true; // condition to check whether to start the calculation
        int numberOfRows = matrix.length; // number of rows
        int secDiagSum = 0; // sum of diag

            // check that the matrix is square
        for (int[] ints : matrix) {
            if (ints.length != numberOfRows) {
                System.out.println("This is not a square matrix!");
                isSquare = false;
                break;
            }
        }

            // ...and, in case it is really square, calculate the sum of its secondary diagonal values
        if (isSquare) {
            for (int i = 0; i < numberOfRows; i++) { // iterate through the rows
                secDiagSum += matrix[i][numberOfRows - (i + 1)]; // add each secondary diagonal value
            }
        System.out.println("Secondary diagonal values sum: " + secDiagSum);
        }
    }
}
