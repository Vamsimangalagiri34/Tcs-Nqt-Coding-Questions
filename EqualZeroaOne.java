class EqualZeroaOne {
    
    // Function to return the count of maximum substrings str can be divided into
    static int maxSubStr(String str, int n) {
        // To store the count of 0s and 1s
        int count0 = 0, count1 = 0;

        // To store the count of maximum substrings str can be divided into
        int cnt = 0;
        
        // To store the starting index of a substring
        int start = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
            
            // When count of 0s and 1s are equal, we found a valid substring
            if (count0 == count1) {
                cnt++;
                System.out.println("Substring " + cnt + ": " + str.substring(start, i + 1));
                // Update the start of the next substring
                start = i + 1;
            }
        }

        // If it's not possible to split the string into such substrings
        if (count0 != count1) {
            return -1;
        }
        return cnt;
    }

    // Driver code
    public static void main(String[] args) {
        String str = "0100110101";
        int n = str.length();

        int result = maxSubStr(str, n);
        if (result == -1) {
            System.out.println("The string cannot be divided into equal '0' and '1' substrings.");
        } else {
            System.out.println("Total number of substrings: " + result);
        }
    }
}
