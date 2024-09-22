// import java.util.*;

// class CiperText {
//     public static void main(String[] args) {
//         String str = "yZ89";
//         int k = 2;
//         StringBuilder result = new StringBuilder(str);

//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
            
//             if (c >= 'A' && c <= 'Z') {
//                 int index = c - 'A';
//                 index = (index + k) % 26;
//                 result.setCharAt(i, (char) (index + 'A'));
//             } else if (c >= 'a' && c <= 'z') {
//                 int index = c - 'a';
//                 index = (index + k) % 26;
//                 result.setCharAt(i, (char) (index + 'a'));
//             } else if (c >= '0' && c <= '9') {
//                 int index = c - '0';
//                 index = (index + k) % 10;
//                 result.setCharAt(i, (char) (index + '0'));
//             }
//         }

//         System.out.println("Encrypted text: " + result.toString());
//     }
// }
class CiperText{
    public static void main(String ae[]){
        String str="Yza89";
        StringBuffer str2=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            str2.append((char) (c+2));
        }
        System.out.println(str2.toString());
    }
}