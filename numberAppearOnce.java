//find the number that appears once and others twice
import java.util.*;
public class numberAppearOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Make sure only no. is different and other nos appear twice ");
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int xorr=0;
        for (int i=0;i<n;i++) {
            xorr=xorr^arr[i];
        }
        System.out.println(xorr);
        sc.close();
    }
}
