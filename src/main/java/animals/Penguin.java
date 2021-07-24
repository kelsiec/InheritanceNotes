package animals;

public class Penguin extends Bird {
    public Penguin() {
        super("yip?");
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
