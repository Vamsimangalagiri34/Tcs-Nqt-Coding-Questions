import java.util.*;

class Mobile_Pad {

    // Function which computes the sequence
    static String printSequence(String arr[], String input) {
        String output = "";

        // length of input string
        int n = input.length();
        for (int i = 0; i < n; i++) {
            // Checking for space
            if (input.charAt(i) == ' ') {
                output = output + "0"; // Space corresponds to '0'
            } else {
                // Calculating index for each character
                int position = input.charAt(i) - 'A'; // Get index from 'A'
                output = output + arr[position]; // Add corresponding numeric sequence
            }
        }

        // Output sequence
        return output;
    }

    // Driver Code
    public static void main(String[] args) {
        // Storing the sequence in array for A-Z
        String str[] = { "2", "22", "222", "3", "33", "333",
                         "4", "44", "444", "5", "55", "555",
                         "6", "66", "666", "7", "77", "777", "7777",
                         "8", "88", "888", "9", "99", "999", "9999" };

        String input = "GEEKSFORGEEKS";
        System.out.println(printSequence(str, input));
    }
}
