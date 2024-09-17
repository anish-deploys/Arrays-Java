import java.util.*;
public class moveAllZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //move all zeroes to end
        int j = -1;  // index to track first occurrence of zero;
        for (int i=0;i<n;i++) {
            if(arr[i] == 0) {
                j=i;
                break;
            }
        }
        
        // if no zero found, exit

        if(j==-1) {
            System.out.println("No zeroes in the array.");
            
        }


        //Swap non-zero elements with zeroes starting from the first zero index
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;  // Move the zero index to the next position
            }
        }

        // Print the modified array
        System.out.println("Array after moving zeroes to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();

        
    }
}
