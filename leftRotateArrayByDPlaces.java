import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class leftRotateArrayByDPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n]; // Change to Integer[] to work with List

        // Taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of d (number of rotations): ");
        int d = sc.nextInt();
        d = d % n; // Normalize d if it is larger than the array size

        // Convert array to list for using Collections.reverse
        List<Integer> list = Arrays.asList(arr);

        // Step 1: Reverse first part (0 to d-1)
        Collections.reverse(list.subList(0, d));

        // Step 2: Reverse second part (d to n-1)
        Collections.reverse(list.subList(d, n));

        // Step 3: Reverse the whole array
        Collections.reverse(list);

        // Print rotated array
        System.out.println("Array after left rotation by " + d + " places:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
