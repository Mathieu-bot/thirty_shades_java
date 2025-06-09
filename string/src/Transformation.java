import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Transformation {
  static String accum(String s) {
    List<String> res = new ArrayList<>(List.of(s.trim().split("")));
    return res.stream()
      .map((el) -> el.toUpperCase().concat(el.repeat(res.indexOf(el))))
      .collect(Collectors.joining("-"));
  }

  static String separateCamelCase(String s) {
    List<String> res = new ArrayList<>(List.of(s.trim().split("")));
    return res.stream()
      .map(el -> el.equals(el.toUpperCase())? String.format(" %s", el) : el )
      .collect(Collectors.joining(""));
  }

  static String decodeMessage(String s) {
    List<String> words = new ArrayList<>(List.of(s.trim().split(" ")));
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.size(); i++) {
      String word = words.get(i);
      sb.append(word.charAt(words.indexOf(word)));
    }
    return sb.toString();
  }

  static String toPascalCase(String s) {
    List<String> res = new ArrayList<>(List.of(s.replaceAll("\\.", "").trim().split(" ")));
    return res.stream()
      .map(el -> el.substring(0, 1).toUpperCase().concat(el.substring(1)) )
      .collect(Collectors.joining(""));
  }


}
