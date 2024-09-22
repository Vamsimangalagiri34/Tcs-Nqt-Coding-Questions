class Lower_Triangle {//upper traingle
    public static void main(String[] args) {
        // Create a 2D array (5x5 matrix for this example)
        int arr[][] = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        // Get the size of the array (assuming it's square)
        int n = arr.length;

        // Make the matrix upper triangular
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { //j=i+1 => gives lower trinagle
                // Set elements below the diagonal to zero
                arr[i][j] = 0;
            }
        }

        // Print the resulting upper triangular matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
