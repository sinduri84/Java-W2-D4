package Sinduri.A12;

abstract class Human {
    String humanName;

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public abstract void getChromosomes();
}
