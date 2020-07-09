package Sinduri.A45;

import java.util.List;
import java.util.Optional;

public class Longest {

    public static void findLongestString(List<String> stringList) {
        String longestString = stringList.get(0);
        for (String element:stringList) {
            if (element.length() > longestString.length()) {
                longestString = element;
            }
        }
        System.out.println("The longest string is \"" + longestString + "\".");

    }

    //Using a java 8 lambda expression;
    public static void findLongestString2(List<String> stringList) {
        Optional<String> longest = stringList.stream()
                .sorted((e1, e2) -> e1.length() > e2.length() ? -1 : 1)
                .findFirst();
        System.out.println("The longest string is \"" + longest.get() + "\".");
    }
}
