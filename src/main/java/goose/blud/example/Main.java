package goose.blud.example;

import goose.blud.example.animals.AbstractAnimal;
import goose.blud.example.animals.Cat;
import goose.blud.example.animals.Dog;
import goose.blud.example.animals.Pigeon;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static void main() {

        // Upcasting
        AbstractAnimal animal;
        animal = new Dog();
        animal = new Cat(25.0);
        animal = new Pigeon(2.0);
        System.out.println("Class of animal is: " + animal.getClass()); // Should say 'class goose.blud.example.animals.Pigeon'

        // Down-casting
        Pigeon pigeon = (Pigeon) animal;
        // Will work, `animal` was already a `Pigeon`
        // If `animal` was anything else other than a `Pigeon` underneath, it'd throw a `ClassCastException`
        pigeon.flapWings();
        pigeon.glide();
        pigeon.fall();

        // Polymorphism
        AbstractAnimal cat = new Cat(30.0);
        System.out.println(cat.getLegs());
        System.out.println(cat.getSound());
        // System.out.println(cat.getPurrDecibels()); <- Won't work, as our cast is typed as AbstractAnimal

        // instanceOf
        boolean trueOrFalse = ThreadLocalRandom.current().nextBoolean();
        cat = trueOrFalse ? new Cat(30.0) : new Dog();

        if (cat instanceof Cat kitty) {
            kitty.fall();
        } else {
            System.out.println("I'm not a Cat, I'm a: " + cat.getClass() + "!"); // Should say class 'goose.blud.example.animals.Dog'
        }
    }
}
