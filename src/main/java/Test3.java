/**
 * Вводим целое число,
 * программа определяет,
 * является ли последняя цифра этого числа - цифрой 3
 */

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        System.out.println("Input random value, please");
        value = scan.nextInt();
        if(value % 10 == 3){
            System.out.println("The last digit of the entered variable is 3");
        } else {
            System.out.println("The last digit of the entered variable is not 3");
        }
        scan.close();
    }
}

class teststatic {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);
    }
}

class testA {
    public static void main(String[] args) {
        int a = 5;
        int result = a--;       // 5 значение декрементируется на следующем шаге
        result = result - --a;  // 5 - 3 = 2 тут декрементированное ранее значение, декрементируется еще раз в этом шаге
        result = result + ++a;  // 2 + 4 = 6 значение а инкрементируется в этом шаге
        result = result + a++;  // 6 + 4 = 10 значение а инкрементируется в следующем шае и станет 5
        result = result + a;    // 10 + 5 = 15
        System.out.println(result);
    }
}

class testB {
    public static void main(String[] args) {
        int b = 8;
        int resultb = ++b;       // 9
        resultb = resultb - b++; // 9 - 9 = 0
        resultb = resultb + ++b; // 0 + 10 = 10
        resultb = resultb - --b; // 10 - 9 = 1
        System.out.println(resultb);
    }
}