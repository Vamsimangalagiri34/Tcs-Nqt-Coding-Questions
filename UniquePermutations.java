import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePermutations {
    public static void main(String[] args) {
        // Input string
        String S = "ABSG";
        
        // Find unique permutations
        List<String> permutations = findUniquePermutations(S);
        
        // Print permutations and their count
        int count = 0;
        for (String perm : permutations) {
            count++;
            System.out.print(perm + " ");
        }
        System.out.println(); // New line after printing all permutations
        System.out.println("Total permutations: " + count);
    }

    public static List<String> findUniquePermutations(String S) {
        List<String> results = new ArrayList<>();
        char[] chars = S.toCharArray(); // Convert string to character array
        Arrays.sort(chars); // Sort characters to handle duplicates and ensure lexicographical order
        boolean[] used = new boolean[chars.length]; // Track used characters
        backtrack(chars, new StringBuilder(), used, results); // Start backtracking
        return results;
    }

    private static void backtrack(char[] chars, StringBuilder path, boolean[] used, List<String> results) {
        if (path.length() == chars.length) {
            results.add(path.toString()); // Add complete permutation to results
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            // Skip used characters or duplicates
            if (used[i] || (i > 0 && chars[i] == chars[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true; // Mark character as used
            path.append(chars[i]); // Append character to current path

            // Recurse to build further permutations
            backtrack(chars, path, used, results);

            // Backtrack: Remove last character and mark it as unused
            path.deleteCharAt(path.length() - 1);
            used[i] = false;
        }
    }
}
