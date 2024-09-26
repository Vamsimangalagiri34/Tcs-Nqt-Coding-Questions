class UniquePath {
    public static void main(String[] args) {
        int m = 3; // Number of rows
        int n = 3; // Number of columns
        System.out.println("Unique Paths: " + uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of unique paths to each cell
        int[][] dp = new int[m][n];
        
        // There is only one way to reach each cell in the first row and first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1; // Only one way to reach cells in the first column
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1; // Only one way to reach cells in the first row
        }
        
        // Fill the dp array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // The number of unique paths to dp[i][j] is the sum of paths from the cell above and the cell to the left
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        // The bottom-right cell contains the number of unique paths to reach it
        return dp[m - 1][n - 1];
    }
}
