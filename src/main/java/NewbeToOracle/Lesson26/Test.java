package NewbeToOracle.Lesson26;

public class Test {
    void abc(int i) {
        System.out.println("int");
    }

    void abc(byte i) {
        System.out.println("byte");
    }

    void abc(long i) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.abc(5);
    }
}
