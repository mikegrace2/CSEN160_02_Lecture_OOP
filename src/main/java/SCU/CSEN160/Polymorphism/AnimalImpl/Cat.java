package SCU.CSEN160.Polymorphism.AnimalImpl;

import SCU.CSEN160.Polymorphism.Animal.Animal;

public class Cat implements Animal {
    @Override
    public void talks() {
        System.out.println("I am a Cat "+Animal.animal+": Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("I am a Cat: I eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("I am a Cat: I sleep 16 hours a day");
    }
}
