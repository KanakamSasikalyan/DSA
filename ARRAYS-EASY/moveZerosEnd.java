import java.util.*;

public class Solution{
    public static void moveZerosEnd(int[] arr, int n){
        int j = 0;
        for(int i=0;i<=n-1;i++){
            if(i>j&&arr[j]==0&&arr[i]!=0){
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        moveZerosEnd(arr,n);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}