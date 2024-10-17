import java.util.*;

public class pascalTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();

        // Printing the Pascal's Triangle
        for (int row = 0; row < numRows; row++) {
            long value = 1;  // Initialize the first element of each row
            for (int col = 0; col <= row; col++) {
                System.out.print(value + " ");  // Print the value
                value = value * (row - col) / (col + 1);  // Update the value using nCr formula
            }
            System.out.println();  
        }

        System.out.print("Enter the row (0-indexed) you want to print: ");
        int inputRow = sc.nextInt();

        if (inputRow < 0 || inputRow >= numRows) {
            System.out.println("Invalid row number.");
        } else {
            long value = 1;  
            System.out.print("Row " + inputRow + ": ");
            for (int col = 0; col <= inputRow; col++) {
                System.out.print(value + " ");  
                value = value * (inputRow - col) / (col + 1);  
            }
            System.out.println();  
            sc.close();
        }
    }
}
