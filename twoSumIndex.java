import java.util.Scanner;

public class twoSumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the target sum
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        boolean found = false;

        // Brute force approach: check every pair of elements
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    // Output the indices
                    System.out.println("Indices: " + i + " and " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        // If no pair is found
        if (!found) {
            System.out.println("No pair found that adds up to the target sum.");
        }

        sc.close();
    }
}
