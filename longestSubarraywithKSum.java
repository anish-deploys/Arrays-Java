import java.util.*;
public class longestSubarraywithKSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }


        int left =0, right = 0, maxLen=0;;
        int sum=arr[0];
        System.out.println("Enter K Sum : ");
        int k = sc.nextInt();
        

        while(right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if(sum == k) {
                maxLen=Math.max(maxLen, right-left + 1);
            }

            right++; //first move to right then add
            if(right < n) 
            sum += arr[right];
        }
        System.out.println(maxLen);
        sc.close();
        

    }
}