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
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			result.add(sb.toString());
		}
		return String.join(" ", result);
	}

	static String alternate(String s, String s1) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			sb.append(s1.charAt(i));
		}
		return sb.toString();
	}



	public static void main(String[] args) {
		System.out.println(alternate("jri", "adn"));
	}
}
