package Array;

// Declare a public class named Main
public class hello{
    // Declare the main method that accepts a String array
    // as a parameter
    public static void main(String[] args)
    {
        // Declare and initialize a 2D integer array named
        // matrix
        int[][] matrix = { { 4, 5 }, { 34, 67 }, { 8, 9 } };
        // Use nested for loops to access rows and columns
        // of the array.
        // The outer loop iterates through each row of the
        // array
        for (int i = 0; i < 3; i++) {
            // The inner loop iterates through each column
            // of the array
            for (int j = 0; j < 2; j++) {
                // Print the value of the current element to
                // the console
                System.out.println("matrix[" + i + "][" + j
                        + "]=" + matrix[i][j]);
            }
        }
    }
}
