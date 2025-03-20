import java.util.Scanner;

class Circle {
    double radius;

    // method to calculate area of circle
    double area() {
        return Math.PI * radius * radius;
    }

    // method to calculate circumference of circle
    double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter Radius of Circle: ");
        c.radius = sc.nextDouble();
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Circumference of Circle: " + c.circumference());
        sc.close();
    }
}