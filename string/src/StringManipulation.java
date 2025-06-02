import java.util.ArrayList;
import java.util.Arrays;
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
	static String[] splice(String[] words, int start, int n) {
		return splice(words, start, n, null);
	}

	static String[] splice(String[] words, int start, int n, String[] newWords) {
		List<String> result = new ArrayList<>(Arrays.asList(words));
		try {
			if (n >= start) {
				result.subList(start, n + 1).clear();
				if (newWords != null) {
					for (int i = 0; i < newWords.length; i++) {
						result.add(start + i, newWords[i]);
					}
				}
			}
			return result.toArray(new String[0]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
			return null;
		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(splice(new String[] {"a", "b", "c", "d"}, 1, 1)));
	}
}
