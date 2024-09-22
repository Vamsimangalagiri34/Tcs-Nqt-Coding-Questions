class StringRotation {
    public static void main(String[] args) {
        String str1 = "ABCD";
        StringBuffer str2 = new StringBuffer("CDAB"); // the progeam aim is whether the second string can form as first string
        
        for(int i = 0; i < str2.length(); i++) {
            // Get the substring from the start to the current index
            String s = str2.substring(0, 1);
            str2.delete(0, 1);  // Delete the first character
            str2.append(s);  // Append it to the end

            // Convert StringBuffer to String and compare with str1
            if(str2.toString().equals(str1)) {
                System.out.println("Possible");
                return;
            }
        }

        // If no match found
        System.out.println("Not possible");
    }
}
