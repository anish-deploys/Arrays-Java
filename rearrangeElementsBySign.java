import  java.util.*;
public class rearrangeElementsBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements but same no. of +ve and -ve :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

         // Two pointers to handle the rearrangement
         int i = 0, j = 1;

         // Rearrange by swapping elements
         while (i < n && j < n) {
             // Find the next wrongly positioned positive
             while (i < n && arr[i] >= 0) {
                 i += 2;
             }
             // Find the next wrongly positioned negative
             while (j < n && arr[j] < 0) {
                 j += 2;
             }
             // Swap them if valid positions found
             if (i < n && j < n) {
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
 
         // Print the rearranged array
         System.out.println("Rearranged Array:");
         System.out.println(Arrays.toString(arr));

         sc.close();
    }
}
