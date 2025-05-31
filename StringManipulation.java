import java.util.ArrayList;
import java.util.List;

public class StringManipulation {

    static int countDigits(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    static String removeSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    static String slice(String s, int start, int end) {
        if (start > end) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            for (int i = start; i < end; i++) {
                sb.append(s.charAt(i));
            }
        } catch (Exception e) {
            e.printStackTrace(
                    System.out
            );
        }

        return sb.toString();
    }

    static String reverseWord(String s) {
        List<String> result = new ArrayList<String>();
        String[] words = s.split(" ");
        for (String word : words) {
            result.add(reverseWord(word));
            System.out.println(result);
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("abc def ghi"));
    }
}
