import java.util.Scanner;

public class Solution{

    static int removeDuplictes(int[] arr, int n){
        int j=0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        return j+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ind = removeDuplictes(arr,n);
        for(int i=0;i<ind;i++){
            System.out.print(arr[i]+" ");
        }
    }
}