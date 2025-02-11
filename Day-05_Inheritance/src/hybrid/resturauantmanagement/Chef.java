package hybridinheritance.resturauantmanagement;
// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Overriding the method from Worker interface
    @Override
    public void performDuties() {
        System.out.println("Duties: Preparing meals, specializing in " + specialty);
    }
}