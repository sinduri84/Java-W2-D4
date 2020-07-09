package Sinduri;

public class Male extends Human {

    String humanName;

    public Male(String humanName) {
        this.humanName = humanName;
    }

    @Override
    public String getHumanName() {
        return humanName;
    }

    @Override
    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public void getChromosomes() {
        System.out.println("XY");
    }
}
