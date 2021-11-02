package NewbeToOracle.Lesson31;

public class Test32 {
    static int x = abc(1);
    //В этом примере вывод 1,3,2 обусловлен тем,
    // что вначале срабатывают статические инициализаторы,
    // а уже  потом нонстатик

    {
        x = abc(2);
    }

    static {
        x = abc(3);
    }

    public static void main(String[] args) {
        Test32 t = new Test32();
    }

    static int abc(int i) {
        System.out.println(i);
        return i;
    }
}
