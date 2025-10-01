package SCU.CSEN160.Polymorphism;

import SCU.CSEN160.Polymorphism.Animal.Animal;

import java.util.ArrayList;
import java.util.Collection;

public class AMain_Animal {
    public static Collection<Animal> animals=new ArrayList<Animal>();

    public static void main(String[] args) {
        // Create randomly some animals
        for (int i=0;i<10;i++){
            if (Math.random()>0.3) {
                animals.add(new SCU.CSEN160.Polymorphism.AnimalImpl.Cat());
            } else if (Math.random()>0.6) {
                animals.add(new SCU.CSEN160.Polymorphism.AnimalImpl.Duck());
            }else {
                animals.add(new SCU.CSEN160.Polymorphism.AnimalImpl.Dog());
            }
        }

        // Make all animals eat, sleep and talk
        for (Animal animal:animals){
            animal.eat();
            animal.sleep();
            animal.talks();
        }
    }
}
