package NewbeToOracle.Lesson31;

public class Test7 {
    public static void main(String[] args) {
        int a = 8;
        do {
            while (a++ < 12) {
                a += 4;
            }
        } while (a < 4);
        System.out.println(a);
    }
}
