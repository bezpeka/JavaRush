package NewbeToOracle.Lesson31;

public class Test38 {
    int a = 3;

    @org.jetbrains.annotations.NotNull
    public static Test38 abc(Test38 test1, Test38 test2) {
        final Test38 b = test1;
        b.a = 5;
        return b;
    }

    public static void main(String[] args) {
        final Test38 t1 = new Test38();
        Test38 t2 = new Test38();
        Test38 t3 = abc(t1, t2);
        System.out.println(t1 == t3);
        System.out.println(t1.equals(t3));
        System.out.println(t1.a == t3.a);
    }
}
