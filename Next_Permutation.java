import java.util.*;

class Sort_Frequency {
    public static void main(String ar[]) {
        int arr[] = {2, 2, 2, 3, 3, 1};
        int l = 0, r = 0, c = 1;  // initialize 'c' to 1 as we're counting the first occurrence

        for (int i = 0; i < arr.length;) {
            c = 1;  // reset the count for each new element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;  // count duplicates
                } else {
                    break;  // exit inner loop when a different element is found
                }
            }
            
            l = i;
            r = i + c - 1;  // r is adjusted by c-1 to include the counted occurrences
            for (int x = l; x <= r; x++) {
                System.out.print(arr[i] + " ");
            }
            i = r + 1;  // update i to skip over the counted duplicates
        }
    }
}
