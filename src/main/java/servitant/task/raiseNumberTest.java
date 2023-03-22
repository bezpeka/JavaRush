package servitant.task;


import java.util.Scanner;

public class raiseNumberTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            raiseNumber();
        }
    }

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        return num;
    }

    public static int enterPower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a power:");
        int power = scanner.nextInt();
        return power;
    }

    public static void raiseNumber() {
        int num = enterNumber();
        int power = enterPower();
        int res_amount = (int) Math.pow(num, power);
        System.out.println(num + " to the power of " + power + " equals " + res_amount + ".");
    }
}
