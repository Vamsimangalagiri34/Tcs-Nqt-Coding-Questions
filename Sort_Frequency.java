import java.util.*;

class Sort_Frequency {
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 3, 3, 1,1,1,1,1,1,2,7,7,7};
        
        // Step 1: Store frequencies in a HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort based on frequency and then by value
        List<Integer> sortedList = new ArrayList<>();
        for (int num : arr) {
            sortedList.add(num);
        }

        Collections.sort(sortedList, (a, b) -> {
            int freq1 = freqMap.get(a);
            int freq2 = freqMap.get(b);
            if (freq1 != freq2) {
                return freq2 - freq1; // Sort by frequency (descending) to change to ascending order just change it into freq1-freq2
            } else {
                return a - b; // If frequency is same, sort by value (ascending)
            }
        });

        // Step 3: Print the sorted array
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
