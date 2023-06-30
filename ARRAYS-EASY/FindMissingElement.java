import java.util.Scanner;

public class Solution{

    public static int brute_force(int[] arr, int len, int n){
        for(int i=1;i<=n;i++){
            int flag = 0;
            for(int j=0;j<len;j++){
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
    public static int better_solution(int[] arr, int len, int n){
        int[] hash = new int[n+1];
        for(int i=0;i<len;i++){
            hash[arr[i]]++;
        }

        for(int i=1;i<n+1;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static int optimal_solution1(int[] arr, int len, int n){
        int isum = 0, sum = 0;
        for(int i=0;i<len;i++){
            sum+=arr[i];
        }
        isum = n*(n+1)/2;
        return isum-sum;
    }

    public static int optimal_solution2(int[] arr, int len, int n){
        int xor1 = 0, xor2 = 0;
        for(int i=0;i<len;i++){
            xor1^=arr[i];
            xor2^=(i+1);
        }
        xor2^=n;
        return xor1^xor2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(brute_force(arr,n,5));
        System.out.println(better_solution(arr,n,5));
        System.out.println(optimal_solution1(arr,n,5));
        System.out.println(optimal_solution2(arr,n,5));
    }
}