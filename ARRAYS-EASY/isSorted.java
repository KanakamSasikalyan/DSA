import java.util.Scanner;

public class Solution{

    static boolean isSorted(int[] arr, int n){
        for(int i=1;i<=n-1;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr, n));
    }
}