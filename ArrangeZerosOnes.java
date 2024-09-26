import java.util.*;
class ArrangeZerosOnes{
public static void main(String arf[]){
    int arr[]={1,1,1,0,0};
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.print(Arrays.toString(arr));
}
}