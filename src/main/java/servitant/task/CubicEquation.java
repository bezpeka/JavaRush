package servitant.task;

import java.util.Scanner;

public class CubicEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficient of x^3: ");
        double a = input.nextDouble();
        System.out.print("Enter the coefficient of x^2: ");
        double b = input.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        double c = input.nextDouble();
        System.out.print("Enter the constant: ");
        double d = input.nextDouble();

        double f = ((3*c/a) - ((b*b)/(a*a)))/3;
        double g = ((2*(b*b*b)/(a*a*a)) - (9*b*c/(a*a)) + (27*d/a))/27;
        double h = ((g*g)/4) + ((f*f*f)/27);

        if (h > 0) {
            System.out.println("The equation has one real root and two complex roots.");
        } else if (h == 0) {
            if (g == 0) {
                System.out.println("The equation has three real roots, all of which are the same.");
            } else {
                System.out.println("The equation has one real root and two identical complex roots.");
            }
        } else {
            System.out.println("The equation has three real roots.");
            double i = Math.sqrt(((g*g)/4) - h);
            double j = Math.cbrt(i);
            double k = Math.acos(-(g/(2*i)));
            double L = j * -1;
            double M = Math.cos(k/3);
            double N = Math.sqrt(3) * Math.sin(k/3);
            double P = (b/(3*a)) * -1;

            double root1 = (2 * j * Math.cos(k/3)) - (b/(3*a));
            double root2 = L * (M + N) + P;
            double root3 = L * (M - N) + P;

            System.out.println("The roots are: " + root1 + ", " + root2 + ", " + root3);
        }
    }
}

