import java.util.*;

class Four_Sum_Numbers {
    public static void main(String ar[]) {
        int k = 23;
        int arr[] = {10, 2, 3, 4, 5, 7, 8};

        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < arr.length - 3; i++) {
            isValid(arr, i, k, l);
        }
        System.out.println(l);
    }

    public static void isValid(int ar[], int i, int k, List<List<Integer>> l) {
        for (int x = i + 1; x < ar.length - 2; x++) {
            for (int y = x + 1; y < ar.length - 1; y++) {
                for (int z = y + 1; z < ar.length; z++) {
                    int sum = ar[i] + ar[x] + ar[y] + ar[z];
                    if (sum == k) {
                        List<Integer> sub = Arrays.asList(ar[i], ar[x], ar[y], ar[z]);
                        Collections.sort(sub);
                        if (!l.contains(sub)) {

                            l.add(sub);
                        }
                    }
                }
            }
        }
    }
}
