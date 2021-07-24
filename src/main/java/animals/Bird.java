package animals;

public abstract class Bird extends Animal {
    public Bird(String noise) {
        super(noise);
    }

    @Override
    public boolean layEggs() {
        return true;
    }

    @Override
    public boolean haveFeathers() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
