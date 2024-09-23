import java.util.*;
public class rearrangeElementsBySign2 {
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

        // Rearrange elements by sign
 int positiveIndex = 0;
 int negativeIndex = n - 1;

 while (positiveIndex < negativeIndex) {
     while (positiveIndex < n && arr[positiveIndex] >= 0) {
         positiveIndex++;
     }
     while (negativeIndex >= 0 && arr[negativeIndex] < 0) {
         negativeIndex--;
     }

     if (positiveIndex < negativeIndex) {
         int temp = arr[positiveIndex];
         arr[positiveIndex] = arr[negativeIndex];
         arr[negativeIndex] = temp;
     }
 }

 // Print the rearranged array
 System.out.println("Rearranged array:");
 for (int i = 0; i < n; i++) {
     System.out.print(arr[i] + " ");

 }
        sc.close();
    }
}

