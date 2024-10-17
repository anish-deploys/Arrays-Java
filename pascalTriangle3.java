import java.util.*;

public class pascalTriangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
        // Print Pascal's Triangle row by row
        for (int row = 0; row < numRows; row++) {
            long value = 1;  
            // Print the elements in the current row
            for (int col = 0; col <= row; col++) {
                System.out.print(value + " ");  
                // Update value for the next element using nCr formula: 
                value = value * (row - col) / (col + 1);
            }
            System.out.println();  
            sc.close();
        }
    }
}
