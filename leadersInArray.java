import java.util.*;
public class leadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[n - 1]; // Last element is always a leader
        leaders.add(maxFromRight);

        // Traverse from second-last to the first element
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Reverse the leaders list to maintain the correct order
        Collections.reverse(leaders);

        System.out.println("Leaders in the array: " + leaders);
        sc.close();
    }
}
