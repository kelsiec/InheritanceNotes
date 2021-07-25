import animals.*;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismMain {
    public static void main(String[] args) {
        // compiler and runtime are both dog
        Dog d1 = new Dog();

        // compiler-time type is Mammal; the runtime type is Dog
        Mammal d2 = new Dog();

        // compiler-type is Animal; the runtime type is dog
        Animal d3 = new Dog();
        Object d4 = new Dog();

//        d1.makeNoise();
//        d2.makeNoise();
//        d3.makeNoise();

//        List<Animal> zoo = new ArrayList<>();
//        zoo.add(d1);
//        zoo.add(new YappyDog());
//        zoo.add(new Platypus());
//        zoo.add(new Penguin());
//
//        for (Animal animal : zoo) {
//            animal.makeNoise();
//        }

        YappyDog y1 = new YappyDog();
        Dog y2 = new YappyDog();
        Animal y3 = new YappyDog();
        Object y4 = new YappyDog();

//        y1.makeEvenMoreNoise();
//        y1.makeScaryNoise();
//        // cast y2 to YappyDog
//        ((YappyDog) y2).makeEvenMoreNoise();
//        ((YappyDog) y3).makeEvenMoreNoise();
//        ((YappyDog) y4).makeEvenMoreNoise();

        // Upcast YappyDogs to Dogs
//        ((Dog) y1).makeEvenMoreNoise(); Compiler-error, compiler believes this is a dog
//        ((Dog) y1).makeScaryNoise(); Redundant, makeScaryNoise is available to both dogs and yappydogs
//        y2.makeScaryNoise();
//        ((Dog) y3).makeScaryNoise();
//        ((Dog) y4).makeScaryNoise();

        // Compiler thinks this a YappyDog. Our runtime knows this is a Dog.
        // Downcast - Error!
        ((YappyDog) d1).makeEvenMoreNoise();

    }
}

