package NewbeToOracle.Lesson31;

public class Test5 {
    static int j = 5;

    static void abc(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        abc(j++);
        System.out.println(j);
    }
}
