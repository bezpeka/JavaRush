package NewbeToOracle.Lesson31;

public class Test39 {
    static int a = 3;

    static void abc() {
        int a = 5; //это локальная переменная метода, она могла бы называться иначе, переменную класса она не меняет
        def();
    }

    static void def() {
        a += 2; // a = a + 2;

        ghi(a);
        System.out.println(a);
    }

    static void ghi(int a) {
        a -= 1; //a = a - 1; Это параметр метода, и он мог-бы называться иначе, переменную класса он тоже не меняет
    }

    public static void main(String[] args) {
        abc();
    }
}
