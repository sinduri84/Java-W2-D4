package Sinduri;

public class Female extends Human {
    String humanName;

    public Female(String humanName) {
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
        System.out.println("XX");
    }
}
