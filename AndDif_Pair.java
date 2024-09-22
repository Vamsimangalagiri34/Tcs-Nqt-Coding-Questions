import java.util.*;
class AndDif_Pair{
    public static void main(String srg[]){
        int n=78;
        int arr[]={5,20,3,2,5,80};//check the value and do dif if the pair dif eq to n print 1 or -1
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                if(Math.abs(arr[i]-arr[j])==n){
                    System.out.print(arr[i]+" "+arr[j]);
                    // break;
                    return;
                }
            }
        }
    }
}