import java.util.HashMap;
import java.util.Scanner;

public class countSubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int K = sc.nextInt();

        // HashMap to store (prefixSum, frequency of prefixSum)
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);  // Initialize for the case when the subarray starts from index 0

        int count = 0;
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            // Calculate prefix sum up to the current element
            prefixSum += arr[i];

            // Check if (prefixSum - K) exists in the map
            if (prefixSumMap.containsKey(prefixSum - K)) {
                count += prefixSumMap.get(prefixSum - K);  // Increment count by the frequency of (prefixSum - K)
            }

            // Update the frequency of the current prefixSum
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }
        System.out.println("Number of subarrays with sum equal to " + K + " is: " + count);
        sc.close();
    }
}
