import java.util.Scanner;

public class majorityElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Boyer-Moore Voting Algorithm
        int candidate = 0, count = 0;
        
        // First pass to find the candidate
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        // Second pass to confirm if the candidate is the majority element
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        
        // Output the result
        if (count > n / 2) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("No majority element.");
        }
        
        sc.close();
    }
}
