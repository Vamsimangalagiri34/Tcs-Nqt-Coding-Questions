class Palindromic_Array {
    public static void main(String ae[]) {
        int arr[] = {111, 222, 333,95};//each element palindram or not
        boolean istrue = true;

        for (int i = 0; i < arr.length; i++) {
            String str = String.valueOf(arr[i]);
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();

            // Use .equals() to compare strings
            if (!sb.toString().equals(str)) {
                System.out.println(str); // Print the non-palindromic number
                istrue = false; // Set flag to false
                break; // Exit the loop
            }
        }
        
        // Output the result
        System.out.println(istrue ? "true" : "false");
    }
}
