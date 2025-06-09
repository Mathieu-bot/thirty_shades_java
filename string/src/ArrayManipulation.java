import java.util.*;
import java.util.stream.Collectors;

public class ArrayManipulation {
  static int[] removeFirstSmallest(int[] arr) {
    if (arr == null || arr.length == 0 || arr.length == 1) return new int[0];
    int min = arr[0];
    int minIndex = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min && arr[i] != min) {
        min = arr[i];
        minIndex = i;
      }
    }
    int[] result = new int[arr.length - 1];
    for (int i = 0, j = 0; i < arr.length; i++) {
      if (i != minIndex) {
        result[j++] = arr[i];
      }
    }
    return result;
  }

  static List<Integer> removeFirstSmallest(List<Integer> arr) {
    if (arr == null || arr.isEmpty()) return Collections.emptyList();
    int min = Collections.min(arr);
    List<Integer> result = new ArrayList<>();
    boolean removed = false;
    for (Integer integer : arr) {
      if (!removed && min == integer) {
        removed = true;
        continue;
      }
      result.add(integer);
    }
    return result;
  }

  static int[][] matrices(int[][] arr1, int[][] arr2) {
    if (arr1 == null || arr2 == null) throw new IllegalArgumentException("The given arrays must not be null");
    if (arr1.length != arr2.length) throw new IllegalArgumentException("The given arrays must have the same length");
    int[][] res = new int[arr1.length][arr1[0].length];
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i].length != arr2[i].length) throw new IllegalArgumentException("The given arrays must have the same length");
      for (int j = 0; j < arr1[0].length; j++) {
        res[i][j] = arr1[i][j] + arr2[i][j];
      }
    }
    return res;
  }

  static List<List<Integer>> matrices(List<List<Integer>> arr1, List<List<Integer>> arr2) {
    if (arr1 == null || arr2 == null) throw new IllegalArgumentException("The given arrays must not be null");
    if (arr1.size() != arr2.size()) throw new IllegalArgumentException("The given arrays must have the same length");
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < arr1.size(); i++) {
      List<Integer> sumRow = new ArrayList<>();
      if (arr1.get(i).size() != arr2.get(i).size()) throw new IllegalArgumentException("The given arrays must have the same length");
      for (int j = 0; j < arr1.get(i).size(); j++) sumRow.add(arr1.get(i).get(j) + arr2.get(i).get(j));
      res.add(sumRow);
    }
    return res;
  }

  static List<Integer> arraysDifference(List<Integer> arr1, List<Integer> arr2) {
    if (arr1 == null || arr2 == null) throw new IllegalArgumentException("The given arrays must not be null");
    if (arr1.isEmpty()) return Collections.emptyList();
    if (arr2.isEmpty()) return arr1;
    return arr1.stream().filter(el -> !arr2.contains(el)).collect(Collectors.toList());
  }

//  static int[] arraysDifference(int[] arr1, int[] arr2) {
//    if (arr1 == null || arr2 == null) throw new IllegalArgumentException("The given arrays must not be null");
//    if (arr1.length == 0) return new int[0];
//    if (arr2.length == 0) return arr1;
//    return
//  }



  public static void main(String[] args) {
    System.out.println(Arrays.toString(removeFirstSmallest(new int[] {5})));
    System.out.println(removeFirstSmallest(List.of()));
    System.out.println(Arrays.deepToString(matrices(new int[][] {{1, 2}, {1, 3}}, new int[][] {{2, 4}, {3, 5}})));
    System.out.println(matrices(List.of(List.of(1, 2, 0), List.of(4, 3, -1)), List.of(List.of(5, 2, 3), List.of(1, 3, 4))));
    System.out.println(arraysDifference(List.of(), List.of()));
    System.out.println(Arrays.toString(arraysDifference(new int[] {1, 2, 3}, new int[] {1, 3})));
  }
}
