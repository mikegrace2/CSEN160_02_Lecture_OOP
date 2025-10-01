package SCU.CSEN160.Polymorphism.AnimalImpl;

import SCU.CSEN160.Polymorphism.Animal.Animal;

public class Duck implements Animal {
    @Override
    public void talks() {
        System.out.println("I am a Duck "+Animal.animal+": Quack Quack");
    }

    @Override
    public void eat() {
        System.out.println("I am a Duck: I am eating bred");
    }

    @Override
    public void sleep() {
        System.out.println("I am a Duck: I am sleeping");
    }
}
