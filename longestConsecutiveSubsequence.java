import java.util.HashSet;
import java.util.Scanner;

public class longestConsecutiveSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Create a HashSet and add all elements to the set
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int longestStreak = 0;
        // Iterate over each element in the array
        for (int num : arr) {
            // Only consider the start of a sequence (if num - 1 is not in the set)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                // Update maximum streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        sc.close();
        System.out.println("Longest Consecutive Subsequence Length: " + longestStreak);
    }
}
