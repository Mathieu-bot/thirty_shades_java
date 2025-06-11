import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Algo {
 static Boolean isClosed (String s) {
   int count = 0;
   if (s.indexOf(")") < s.indexOf("(")) return false;
   for (int i = 0; i < s.length(); i++) {
     if (s.charAt(i) == '(') {
       count++;
     } else if (s.charAt(i) == ')') {
       count--;
     }
   }
   return count == 0;
 }

 static Boolean scramble (String s1, String s2) {
   List<String> str1 = Arrays.asList(s1.split(""));
   List<String> str2 = Arrays.asList(s2.split(""));
   boolean result = true;
   for (int i = 0; i < s2.length(); i++) {
     String chr = str2.get(i);
     if (str1.stream().filter(el -> el.equals(chr)).count() < str2.stream().filter(el -> el.equals(chr)).count()) {
       result = false;
     }
   }
   return result;
 }

  public static void main(String[] args) {
    System.out.println(isClosed(")())()()"));
    System.out.println(isClosed("("));
    System.out.println(isClosed("(())"));
    System.out.println(scramble("rkqodlw", "world"));
    System.out.println(scramble("katas", "steak"));
    System.out.println(scramble("codewaraaossoqqyt", "codewars"));
  }
}
