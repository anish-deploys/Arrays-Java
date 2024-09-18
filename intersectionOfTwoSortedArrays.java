import java.util.*;
public class intersectionOfTwoSortedArrays {
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

        // Find the intersection of two sorted arrays
        System.out.println("Intersection of the two arrays:");
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                // Common element found
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        sc.close();
    }
}
