package Sinduri.A45;

import java.util.List;
import java.util.Optional;

public class Smallest {

    public static void findSmallestNumber(List<Integer> intList) {
        int smallestNumber = intList.get(0);
        int indexValue = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) < smallestNumber) {
                smallestNumber = intList.get(i);
                indexValue = i;
            }
        }

        System.out.println("\nThe original list is,");
        for(int element : intList) {
            System.out.println(element);
        }

        intList.remove(indexValue);

        intList.add(0, smallestNumber);

        System.out.println("The smallest number is \"" + smallestNumber + "\".");
        System.out.println("The updated list is,");
        for(int element : intList) {
            System.out.println(element);
        }
    }


    public static void findSmallestNumber2(List<Integer> intList) {
        int smallestNumber = intList.get(0);

        Optional<Integer> smallest = intList.stream()
                .sorted((e1, e2) -> e1 < e2 ? -1 : 1)
                .findFirst();

        int indexValue = intList.indexOf(smallest.get());

        System.out.println("\nThe original list is,");
        for(int element : intList) {
            System.out.println(element);
        }
        intList.remove(indexValue);
        intList.add(0, smallest.get());
        System.out.println("The smallest number is \"" + smallest.get() + "\".");
        System.out.println("The updated list is,");
        for(int element : intList) {
            System.out.println(element);
        }
    }

}
