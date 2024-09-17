import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter a number from the array : ");
        int num = sc.nextInt();
        sc.close();

        for(int i=0;i<num;i++) {
            if(arr[i] == num) {
                System.out.print(i);
            }
        }
        return;
    }
}
