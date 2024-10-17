import java.util.*;

public class pascalTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = sc.nextInt();
        // Print Pascal's Triangle
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col <= row; col++) {
                long result = 1;
                int r = Math.min(col, row - col); 
                for (int i = 0; i < r; i++) {
                    result *= (row - i);  
                    result /= (i + 1);    
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter the row (0-indexed): ");
        int rowInput = sc.nextInt();

        System.out.print("Enter the column (0-indexed): ");
        int colInput = sc.nextInt();

        if (colInput > rowInput || colInput < 0) {
            System.out.println("Invalid position");
        } else {
            long result = 1;
            int r = Math.min(colInput, rowInput - colInput); 
            for (int i = 0; i < r; i++) {
                result *= (rowInput - i);  
                result /= (i + 1);        
            }
            System.out.println("Element at row " + rowInput + ", col " + colInput + ": " + result);
            sc.close();
        }
    }
}
