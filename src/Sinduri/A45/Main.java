package Sinduri.A45;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //A5
        System.out.println("\nA5");

        List<String> stringList = new ArrayList<String>();

        stringList.add("banana");
        stringList.add("apple");
        stringList.add("pourouma cecropiaefoli");
        stringList.add("berry");
        stringList.add("pomegranate");

        Longest.findLongestString(stringList);
        Longest.findLongestString2(stringList);

        //A4
        System.out.println("\nA4");

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(5);
        intList.add(7);
        intList.add(10);
        intList.add(12);
        intList.add(1);
        intList.add(18);

        Smallest.findSmallestNumber(intList);

        Smallest.findSmallestNumber2(intList);
    }
}
