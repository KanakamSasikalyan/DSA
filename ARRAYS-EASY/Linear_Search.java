import java.util.*;

public class Solution{
    
    public static boolean linear_search(int[] arr, int n, int target){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(linear_search(arr,n,target));
    }
}