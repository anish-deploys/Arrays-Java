import java.util.*;

public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Moore's Voting Algorithm
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // Verify if the candidate is the majority element
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("The majority element is: " + candidate);
        } else {
            System.out.println("No majority element found.");
        }

        sc.close();
    }
}
