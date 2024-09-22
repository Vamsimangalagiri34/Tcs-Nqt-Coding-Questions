class Minimum_Swaps{
    public static void main(String  sr[]){
        int arr[]={2,1,5,6,3};
        int k=3;
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++)
            {
                int ele=arr[i];
                if(ele<=k){
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}