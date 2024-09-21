import java.util.*;

public class twoSUm {
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

        // Sort the array
        Arrays.sort(arr);

        // Initialize two pointers
        int left = 0, right = n - 1;

        // Two-pointer approach to find the target sum
        boolean found = false;  // To track if a pair is found
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // Output result
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
