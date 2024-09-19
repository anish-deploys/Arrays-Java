import java.util.*;
public class missingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n-1]; //since one number is missing


        System.out.println("Enter " + (n-1) + " elements:");
        for(int i=0;i<n-1;i++) {
            arr[i]=sc.nextInt();
        }

        int sum = n * (n + 1)/2;
        int s2 = 0;

        for (int i = 0;i<n-1;i++) {
            s2+=arr[i];
        }
        int missingNum = sum-s2;
        System.out.println("The missing number is: " + missingNum);
        sc.close();
    }

}