import java.util.*;
class MinizArray{
    public static void main(String ar[]){
        int r=3;
        int arr[]={20,7,5,4};
        int l=arr.length;
        for(int i=0;i<r;i++){
            Arrays.sort(arr);
            int ele=arr[l-1];
            arr[l-1]=ele/2;
        }
        int sum=0;
        for(int a :arr){
            sum+=a;//min size array sum
        }
        System.out.println(sum);
    }
}