import java.util.*;
public class bestTimeToBuySellGoods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }     

        int mini = arr[0], profit=0;
        for(int i=1;i<n;i++) {
            int cost=arr[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,arr[i]);
        }
        System.out.println(profit);
        sc.close();
    }
}
