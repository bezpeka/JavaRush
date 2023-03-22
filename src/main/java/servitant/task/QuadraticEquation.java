package servitant.task;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficient of x^2: ");
        double a = input.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        double b = input.nextDouble();
        System.out.print("Enter the constant: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double root1, root2;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
