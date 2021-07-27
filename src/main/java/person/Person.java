package person;

import animals.Dog;

public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person other = (Person) o;
            return this.name.equals(other.name) && this.age == other.age;
        }

        return false;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ben", 32);
        Person p2 = new Person("Ben", 32);
        Person p3 = new Person("Kelsie", 32);

        // int float boolean - primitive types ==
        // String Integer Float person.Person - reference/objects equals
//        String foo = "glah";
//        String bar = "glah";
//        System.out.println(foo.equals(bar));

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));

        Dog d1 = new Dog();
        System.out.println(p1.equals(d1));
    }
}
