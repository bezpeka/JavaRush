package NewbeToOracle.Lesson31;

public class Test28 {
    static int a = 3;

    public static void main(String[] args) {
        int b = 1 + (a = 5);
        System.out.println(b);
    }
}
