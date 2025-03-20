class Person {
    private String name;
    private int age;
    private static final String DEFAULT_NAME = "Pratik";
    public Person() {
        name = DEFAULT_NAME;
        age = 20;
    }
    public Person(Person other) {
        name = other.name;
        age = other.age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Person2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
        Person p2 = new Person(p1);
        p2.display();
    }

    
}