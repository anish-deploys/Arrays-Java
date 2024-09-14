import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int largest = arr[0];
        
        //taking array input
        System.out.println("Enter " + n + " elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();    
        }

        //print largest element
        for (int i=0;i<n;i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
        sc.close();

    }
    
}
