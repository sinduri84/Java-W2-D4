package Sinduri;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        //Animal class is abstract, so cannot be instantiated.
        //Animal animal4 = new Animal();

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
//        Dog dog3 = (Dog) animal3;
        //Class Dog cannot be cast to Class Cat
        //Cat cat2 = (Cat) animal2;
        dog2.greeting(dog2);
        dog2.greeting();
        //After changing the BigDog class as a sub-class to Animal, the Dog method with the parameter cannot be applied to BigDog.
/*        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);*/
    }
}

