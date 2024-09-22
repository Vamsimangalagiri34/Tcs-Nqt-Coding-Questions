class Bracket_Balance {
    public static void main(String[] args) {
        String str = "{(";
        int openCurly = 0, openRound = 0, openSquare = 0;
        int closeCurly = 0, closeRound = 0, closeSquare = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '{':
                    openCurly++;
                    break;
                case '(':
                    openRound++;
                    break;
                case '[':
                    openSquare++;
                    break;
                case '}':
                    closeCurly++;
                    break;
                case ')':
                    closeRound++;
                    break;
                case ']':
                    closeSquare++;
                    break;
            }
        }

        // Calculate unmatched brackets
        int unmatchedCurly = Math.abs(openCurly - closeCurly);
        int unmatchedRound = Math.abs(openRound - closeRound);
        int unmatchedSquare = Math.abs(openSquare - closeSquare);

        // Each unmatched bracket pair requires half the reversals
        int reversalsCurly = (unmatchedCurly + 1) / 2;
        int reversalsRound = (unmatchedRound + 1) / 2;
        int reversalsSquare = (unmatchedSquare + 1) / 2;

        System.out.println("Unmatched curly brackets: " + unmatchedCurly);
        System.out.println("Unmatched round brackets: " + unmatchedRound);
        System.out.println("Unmatched square brackets: " + unmatchedSquare);
        System.out.println("Reversals needed for curly brackets: " + reversalsCurly);
        System.out.println("Reversals needed for round brackets: " + reversalsRound);
        System.out.println("Reversals needed for square brackets: " + reversalsSquare);
    }
}
