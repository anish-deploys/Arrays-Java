import java.util.*;
public class leftRotateArrayByOnePlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //store first element 
        int firstElement = arr[0];

        //shift elements to left 
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }

        //place first element at last 
        arr[n-1] = firstElement;
        System.out.println("Array after left rotation by one place:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
