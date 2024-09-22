import java.util.*;
public class maxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //kadane's algorithm 
        int maxSoFar = arr[0];  // Initialize to the first element
        int maxEndingHere = arr[0];  // Initialize to the first element

        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]); // Update maxEndingHere
            maxSoFar = Math.max(maxSoFar, maxEndingHere); // Update maxSoFar
        }

        System.out.println("Maximum Subarray Sum: " + maxSoFar);
        sc.close();

    }
}
