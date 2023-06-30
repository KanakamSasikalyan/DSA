import java.util.*;

public class Solution{
    
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n, int m){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0, j = 0;
        while(i<n&&j<m){
            if(arr1[i]<arr2[j]){
                if(!list.contains(arr1[i])){
                    list.add(arr1[i]);
                }
                i++;
            }else{
                if(!list.contains(arr2[i])){
                    list.contains(arr2[j]);
                }
                j++;
            }
        }

        while(i<n){
            if(!list.add(arr1[i])){
                list.add(arr1[i]);
            }
            i++;
        }

        while(j<m){
            if(!list.contains(arr2[j])){
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> list = findUnion(arr1, arr2, n, m);

        System.out.println(list);
    }
}