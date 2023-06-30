import java.util.Scanner;

public class Solution{
        
    public static int maxConsecutiveOnes(int[] arr, int n){
        int max = 0, cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                cnt++;
                max = Math.max(max, cnt);
            }else{
                cnt = 0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxConsecutiveOnes(arr, n));
    }
}