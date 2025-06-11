
import java.util.List;
import static java.lang.Integer.parseInt;

public class AddOrSubstract {
  public static String calculate(String str) {
    List<String> optr = List.of(str.split("\\d+"));
    List<String> n = List.of(str.split("\\D+"));
    int res = parseInt(n.getFirst());

    for (int i = 1; i < optr.size(); i++)
      res = optr.get(i).equals("plus") ? res + parseInt(n.get(i)) : res - parseInt(n.get(i));
    return String.valueOf(res);
  }

  public static void main(String[] args) {
    System.out.println(calculate("1plus2minus30plus4minus0"));
  }
}