import java.util.Scanner;
import java.util.Arrays;

public class Solution{

    static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
    }
    static void leftRotateByK(int[] arr, int n, int k){
        if(k>n){
            k = k%n;
        }
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        leftRotateByK(arr, n, k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}