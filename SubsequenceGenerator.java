import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SubsequenceGenerator {
    // Function to generate all subsequences of a string using bit manipulation
    public static void generateSubsequences(String str) {
        int n = str.length();
        int max = 1 << n; // Total number of subsequences is 2^n
        List<String> subsequences = new ArrayList<>();

        for (int i = 1; i < max; i++) { // Start from 1 to skip the empty subsequence
            StringBuilder subsequence = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subsequence.append(str.charAt(j));
                }
            }

            subsequences.add(subsequence.toString());
        }

        // Sort the list of subsequences by their length
        Collections.sort(subsequences, Comparator.comparingInt(String::length));

        // Print all subsequences
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All subsequences of the string \"" + input + "\" in ascending order by length:");
        generateSubsequences(input);
    }
}
