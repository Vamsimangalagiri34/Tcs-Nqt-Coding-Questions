class Lower_Triangle {
    public static void main(String ar[]) {
        int mat[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // Set the upper triangle elements to 0
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = i + 1; j < mat[0].length; j++) {
        //         mat[i][j] = 0;
        //     }
        // }
        
        // Print the lower triangle of the matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i >= j) { // Condition to print lower triangle elements //if u want to change it into upper triangle change i<=j
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("0 "); // Printing 0 for upper triangle elements
                }
            }
            System.out.println();
        }
        // System.out.println(mat[0].length);
    }
}
