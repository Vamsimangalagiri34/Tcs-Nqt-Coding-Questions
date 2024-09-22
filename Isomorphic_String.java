import java.util.*;

class Isomorphic_String {
    public static void main(String arg[]) {
        String str = "aab";
        String str2 = "xxy";

        if (str.length() != str2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedValues = new HashSet<>(); // To check if any char in str2 is already mapped

        for (int i = 0; i < str.length(); i++) {
            char c1 = str.charAt(i);
            char c2 = str2.charAt(i);

            // If 'c1' has already been mapped to a different character
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    System.out.println("Not Isomorphic");
                    return;
                }
            } else {
                // If 'c2' is already mapped to some other character
                if (mappedValues.contains(c2)) {
                    System.out.println("Not Isomorphic");
                    return;
                }

                // Create a new mapping
                map.put(c1, c2);
                mappedValues.add(c2);
            }
        }

        System.out.println("Isomorphic");
    }
}
