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
        System.out.println("A2");

        System.out.println("Overloading");
        System.out.println("\t-");

    }
}
