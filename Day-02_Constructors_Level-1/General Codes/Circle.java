import java.util.*;

public class Circle {

    private double radius;
    private static final double DEFAULT_RADIUS = 1.0;

    public Circle() {
        this(DEFAULT_RADIUS);
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        Circle c1 = new Circle(radius);
        c1.display();
        sc.close();
    }
}