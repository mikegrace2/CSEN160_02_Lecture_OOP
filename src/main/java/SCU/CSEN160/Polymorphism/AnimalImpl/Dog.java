package SCU.CSEN160.Polymorphism.AnimalImpl;

import SCU.CSEN160.Polymorphism.Animal.Animal;

public class Dog implements Animal {
    @Override
    public void talks() {
        System.out.println("I am a Dog "+Animal.animal+": wuff wuff");
    }

    @Override
    public void eat() {
        System.out.println("I am a Dog: I eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("I am a Dog: I sleep 4 hours a day");
    }
}
