public class EmoloyeeManagement {
    public static void main(String[] args) {
        Employee E = new Employee();
        E.displayDetails("XYZ", 100, 100000);

        Manager M = new Manager();
        M.getTeamSize(35);
        M.displayDetails("Vishal", 001, 400000);

        Developer D = new Developer();
        D.getprogramming("JAVA");
        D.displayDetails("Veer", 135, 575000);

        Intern I = new Intern();
        I.getDuration(5);
        I.displayDetails("Anuj Vishwakarma", 007, 13000);

    }
}