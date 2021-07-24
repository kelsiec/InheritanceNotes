package animals;

public abstract class Mammal extends Animal {
    public Mammal(String noise) {
        super(noise);
    }

    public boolean layEggs() {
        return false;
    }

    public boolean haveFeathers() {
        return false;
    }

    public boolean canFly() {
        return false;
    }
}
