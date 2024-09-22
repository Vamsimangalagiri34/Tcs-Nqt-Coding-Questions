class StringOperations {
    public static void main(String[] ae) {
        String str = "gfgs"; //print the cpunt of diffferent letters in other word
        String str2 = "gfg";
        int t = 0;  // Initialize the count of matches to 0
        int l = 0, r = Math.min(str.length(), str2.length()) - 1;

        while (l <= r) {
            // Compare characters from the start
            if (str.charAt(l) == str2.charAt(l)) {
                t++;
            }
            // Compare characters from the end
            if (str.charAt(r) == str2.charAt(r)) {
                t++;
            }
            l++;
            r--;
        }
        if(t>0){
            System.out.print(Math.abs(str.length()-str2.length()));
        }
        else 
        System.out.print(t);
    }
}
