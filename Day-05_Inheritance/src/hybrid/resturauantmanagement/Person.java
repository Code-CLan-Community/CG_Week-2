package hybridinheritance.resturauantmanagement;
class Person {
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display common details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}