import java.util.*;
class workspace{
    public static void main(String arg[]){
      String str="{(";
    //   String sy={'[',']','{','}','(',')'};
      char crr[]=str.toCharArray();
      int f=0,b=0,p=0;
      for(int i=0;i<crr.length;i++){
        char c=crr[i];
       switch(c){
        case '{':
            f++;
        case '}':
            f--;
        case '[':
            b++;
        case ']':
            b--;
        case '(':
            p++;
        case ')':
            p--;
        default :
         System.out.println("failes"+c);
       }
      }
      if(f>=0 && b>=0 && p>=0){
        System.out.printf("%d %d %d",f,b,p);
      }
      else 
      System.out.print("not valid"+f+b+p);
    }
}