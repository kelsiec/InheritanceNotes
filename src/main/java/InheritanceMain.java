import animals.Platypus;

public class InheritanceMain {
    public static void main(String[] args) {
        // Animal animal = new Animal("blah"); cannot instantiate an abstract class
//        Duck duck = new Duck();
//        Goose goose = new Goose();
//        Penguin penguin = new Penguin();
//        Bird dack = new Bird("dack", "quock");

//        duck.makeNoise();
//        goose.makeNoise();
//
//        System.out.println(duck.canFly());
//        System.out.println(goose.canFly());
//        System.out.println(penguin.canFly());
//
//        Dog dog = new Dog();
//        dog.makeNoise();

//        YappyDog yapper = new YappyDog();
//        yapper.makeNoise();

        Platypus platty = new Platypus();
        System.out.println(platty.layEggs());
    }
}
