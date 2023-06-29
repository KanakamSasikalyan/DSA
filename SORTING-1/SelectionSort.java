import java.util.Scanner;

class Solution{
    public static void selection_sort(int[] arr, int n){
        for(int i=0;i<=n-1;i++){
            int min = i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selection_sort(arr, n);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}