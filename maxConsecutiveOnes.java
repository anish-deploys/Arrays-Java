    import java.util.*;
    public class maxConsecutiveOnes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("At least single '1' should be there for output");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxi=0;
            int count=0;
            for (int i=0;i<n;i++) {
                if(arr[i]==1) {
                    count++;    
                    maxi=Math.max(maxi, count);
                }
                else {
                    count=0;    
                }
                
            }
            System.out.println(maxi);
            sc.close();
        }
    }
