class Count_Squares {
    public static void main(String sr[]) {
        int n = 9; // Define the upper limit
        int c = 0; // Initialize count of squares
            // print the count of sqr<n
        // Loop to find perfect squares
        for (int i = 1; i * i < n; i++) {
            c++; // Increment counter for each perfect square found
        }

        // Print the count of perfect squares less than n
        System.out.println(c);
    }
}
