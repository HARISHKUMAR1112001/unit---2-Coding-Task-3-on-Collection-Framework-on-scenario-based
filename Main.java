/* Write a java program to store group of integers [order of insertion elements does not matter and store unique elements] (HashSet)
 */

import java.util.*;

class Main {

  public static void main(String[] args) {
    HashSet<Integer> setOfIntegers = new HashSet<Integer>();

    setOfIntegers.addAll(Arrays.asList(new Integer[] { 5, 6, 4, 3, 2, 1, 5, 4, 3, 2, 1 }));

    System.out.println(setOfIntegers);
  }
}
