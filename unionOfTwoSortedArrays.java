import java.util.*;
public class unionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array: ");
        int n=sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter " + n + " elements for the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of 2nd array: ");
        int m=sc.nextInt();
        int[] arr2 =new int[m];

        System.out.println("Enter " + m + " elements for the first array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Two-pointer technique to find union
        System.out.println("Union of the two sorted arrays:");
        int i = 0, j = 0;
        while (i < n && j < m) {
            // If element of first array is smaller
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            }
            // If element of second array is smaller
            else if (arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            }
            // If elements are equal, print any one and move both pointers
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        // Print remaining elements of the first array (if any)
        while (i < n) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        // Print remaining elements of the second array (if any)
        while (j < m) {
            System.out.print(arr2[j] + " ");
            j++;
        }

        sc.close();


    }
}
