class Comman_Elements {
    public static void main(String arp[]) {
        int arr[][] = {{1, 2, 1, 4, 8},
                       {3, 7, 8, 5, 1},
                       {8, 7, 7, 3, 1},
                       {84, 1, 2, 7, 9}};
        int count = 0;

        for (int i = 0; i < arr[0].length; i++) {
            int element = arr[0][i];
            boolean isCommon = true;
            for (int j = 1; j < arr.length; j++) {
                boolean found = false;
                for (int k = 0; k < arr[j].length; k++) {
                    if (arr[j][k] == element) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                count++;
            }
        }
        System.out.println(count);
    }
}
