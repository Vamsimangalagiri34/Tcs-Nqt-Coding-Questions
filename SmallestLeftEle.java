import java.util.*;
class SmallestLeftEle{
    public static void main(String srg[]){
        int arr[]={1,6,4,10,2,5};
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
               l.add(isSmall(arr,i));
        }
        System.out.println(l);
    }
    public static int isSmall(int arr[],int ele){
        int e=-1;
         for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>ele){
                ele=arr[i];
                e=ele;
                return arr[i];
            }
         }
         return e;
    }
}