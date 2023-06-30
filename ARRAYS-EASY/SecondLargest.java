import java.util.Scanner;

public class Solution{

    static int secondLargest(int[] arr, int n){
        int max = -1;
        int smax = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax = -1;
                max = arr[i];
            }else if(arr[i]!=max&&arr[i]>smax){
                smax = arr[i];
            }
        }
        return smax;
    }

    static int secondSmallest(int[] arr, int n){
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                smin = min;
                min = arr[i];
            }else if(arr[i]!=min&&arr[i]<smin){
                smin = arr[i];
            }
        }
        return smin;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(secondLargest(arr,n));
        System.out.println(secondSmallest(arr,n));
    }
}