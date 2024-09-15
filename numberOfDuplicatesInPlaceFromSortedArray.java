import java.util.*;
public class numberOfDuplicatesInPlaceFromSortedArray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //two pointer approach
        int i=0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("Number of unique elements: " + (i + 1));
    }
    
    
}