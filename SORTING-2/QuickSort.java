import java.util.Scanner;
import java.util.ArrayList;

class Solution{
    public static int partition(int[] arr, int low, int high){
        int pivot = low;
        int i = low+1;
        int j = high;
        while(i<j){
            while(arr[pivot]>arr[i]&&i<=high-1){
                i++;
            }
            while(arr[pivot]<arr[j]&&j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}