package animals;

public class YappyDog extends Dog {
    @Override
    public void makeNoise() {
        // System.out.println(this.noise + " " + this.noise); // no access to private fields

        // Call the method on the base class
//        super.makeNoise();
//        super.makeNoise();

        // Use accessor
        System.out.println(this.getNoise() + " " + this.getNoise());
    }

    public void makeEvenMoreNoise() {
        System.out.println("YAP YAP YAP YAP YAP");
    }
}
