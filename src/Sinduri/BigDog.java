package Sinduri;

public class BigDog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }

    //Bigdog cannot use this method from Dog if it extends from Animal. Overriding methods can only exist between a Super class and sub-class.
    /*@Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }*/
}
