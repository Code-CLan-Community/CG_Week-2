package hybridinheritance.resturauantmanagement;
class Waiter extends Person implements Worker {
    private String section;

    // Constructor
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    // Overriding the method from Worker interface
    @Override
    public void performDuties() {
        System.out.println("Duties: Serving customers in the " + section + " section.");
    }
}