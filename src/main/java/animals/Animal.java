package animals;

public abstract class Animal {
    private final String noise;

    public Animal(String noise) {
        this.noise = noise;
    }

    public abstract boolean layEggs();
    public abstract boolean haveFeathers();
    public abstract boolean canFly();

    public String getNoise() {
        return noise;
    }

    public void makeNoise() {
        System.out.println(noise);
    }

    public String toString() {
        return String.format(
                "The %s %s fly, and %s lay eggs.",
                this.getClass().getSimpleName(),
                (this.canFly() ? "can" : "cannot"),
                (this.layEggs() ? "does" : "does not")
        );
    }
}
