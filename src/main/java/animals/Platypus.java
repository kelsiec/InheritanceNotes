package animals;


// public class Platypus extends Duck,  Beaver { // No multiple inheritance
public class Platypus extends Mammal {
    public Platypus() {
        super("pfttftffttttffttf");
    }

    @Override
    public boolean layEggs() {
        return true;
    }
}
