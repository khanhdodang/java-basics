package array;

public class Transpose {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};

        // Display current matrix
        display(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display transposed matrix
        display(transpose);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}

/*
The matrix is:
2    3    4
5    6    4
The matrix is:
2    5
3    6
4    4

In the above program, display() function is only used to print the contents of a matrix to the screen.

Here, the given matrix is of form 2x3, i.e. row = 2 and column = 3.

For the transposed matrix, we change the order of transposed to 3x2, i.e. row = 3 and column = 2. So, we have transpose = int[column][row]

The transpose of the matrix is calculated by simply swapping columns to rows:

transpose[j][i] = matrix[i][j];
 */