public class Person {
    String name;
    int age;
    double salary;

    // Initialize Person constructor
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
