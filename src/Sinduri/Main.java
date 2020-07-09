package Sinduri;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //A1
        System.out.println("A1");

        List<Human> humanChromosomes = new ArrayList<Human>();

        humanChromosomes.add(new Male("Johann"));
        humanChromosomes.add(new Female("Sinduri"));
        humanChromosomes.add(new Female("Hema"));
        humanChromosomes.add(new Male("Andrew"));
        humanChromosomes.add(new Female("Hayley"));

        for(int i = 0; i < humanChromosomes.size(); i++) {
            System.out.printf("%s\t", humanChromosomes.get(i).getHumanName());
            humanChromosomes.get(i).getChromosomes();
        }

        //A2
        System.out.println("\nA2\n");

        System.out.println("Method Overloading");
        System.out.println("\t-Overloading is the act of defining multiple methods with identical names in the same class.");
        System.out.println("\t-Overloading is related to compile-time (or static) polymorphism.");
        System.out.println("\t-The overloaded methods must differ in the type and/ or number of their parameters.");
        System.out.println("\t-Overloaded may have different return types.");
        System.out.println("\t-Constructors can also be overloaded.");

        System.out.println("\nMethod Overriding");
        System.out.println("\t-Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes");
        System.out.println("\t-When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.");
        System.out.println("\t-Method overriding is one of the way by which java achieve Run Time Polymorphism.");
        System.out.println("\t-");

        System.out.println("\nDifferences between Overloading and Overriding");
        System.out.println("\t-Overloading is about identical name methods having different signatures. " +
                "Overriding is about the same method, same signature but different classes connected through inheritance.");
        System.out.println("\t-Overloading is an example of compiler-time polymorphism and overriding is an example of run time polymorphism.");
        System.out.println("\t-Method overloading is used to increase the readability of the program. Method overriding is used to provide the specific implementation of the method that is already provided by its super class.");
        System.out.println("\t-Method overloading is performed within class. Method overriding occurs in two classes that have IS-A (inheritance) relationship.");
        System.out.println("\t-\tIn case of method overloading, parameters must be different. In case of method overriding, parameters must be same.");
        System.out.println("\t-Return type can be same or different in method overloading. Return type must be same or covariant in method overriding.");
        System.out.println("\t-");
        System.out.println("\t-");
    }
}
