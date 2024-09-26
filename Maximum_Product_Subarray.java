class Maximum_Product_Subarray {
    public static void main(String ar[]) {
        int arr[] = {1, 2, 3,0,4,5,6,7};
        
        int maxProduct = arr[0];
        int currentProduct = arr[0];
        
        // Variables to track the subarray with maximum product
        int start = 0, end = 0, tempStart = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (currentProduct == 0) {
                currentProduct = arr[i];
                tempStart = i; // Start a new subarray when current product becomes 0
            } else {
                currentProduct *= arr[i];
            }

            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
                start = tempStart; // Update start of the max subarray
                end = i;           // Update end of the max subarray
            }
        }
        
        // Print the maximum product
        System.out.println("Maximum Product: " + maxProduct);
        
        // Print the subarray with maximum product
        System.out.print("Subarray with Maximum Product: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + (i == end ? "]" : ", "));
        }
    }
}
