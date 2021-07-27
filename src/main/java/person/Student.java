package person;

public class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // Don't do this! Creates the asymmetric situation seen in the main
    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student other = (Student) o;
            return this.getName().equals(other.getName()) &&
                    this.getAge() == other.getAge() &&
                    this.studentId == other.studentId;
        }

        return false;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ben", 32, 12345);
        Person p1 = new Person("Ben", 32);

        System.out.println(s1.equals(p1));
        System.out.println(p1.equals(s1));
    }
}
