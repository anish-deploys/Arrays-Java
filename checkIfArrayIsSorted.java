import java.util.*;
public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Taking array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 

        // Variable to track if the array is sorted
        boolean isSorted = true;

        // Checking if the array is sorted
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        // Output result based on the flag
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

        sc.close();
    }
}
