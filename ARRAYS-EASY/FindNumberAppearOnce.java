import java.util.*;

public class Solution{
        
   public static int bruteforce_findNumberAppearOnce(int[] arr, int n){
       for(int i=0;i<n;i++){
           int cnt = 1;
           for(int j=0;j<n;j++){
               if(i!=j&&arr[i]==arr[j]){
                   cnt++;
               }
           }
           if(cnt==1){
               return arr[i];
           }
       }
       return -1;
   }

   public static int better_solution_findNumberAppearOnce(int[] arr, int n){
       HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
       for(int i=0;i<n;i++){
           if(!mp.containsKey(arr[i])){
               mp.put(arr[i], 1);
           }else{
               mp.put(arr[i], mp.get(arr[i])+1);
           }
       }

       for(Map.Entry<Integer, Integer> e: mp.entrySet()){
           if(e.getValue()==1){
               return e.getKey();
           }
       }

       return -1;
   }

   public static int optimal_solution(int[] arr, int n){
       int res = 0;
       for(int i=0;i<n;i++){
           res^=arr[i];
       }
       return res;
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(bruteforce_findNumberAppearOnce(arr, n));
        System.out.println(better_solution_findNumberAppearOnce(arr, n));
        System.out.println(optimal_solution(arr, n));
    }
}