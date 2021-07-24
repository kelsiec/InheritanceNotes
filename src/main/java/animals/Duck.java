package animals;

public class Duck extends Bird {
    public Duck() {
        super("quack");
        // this.noise = "quack"; doesn't work, no access to private members of base class
    }

}
