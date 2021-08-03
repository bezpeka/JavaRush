package NewbeToOracle.Lesson23.Test3;

public class X {
    public X() {
        System.out.println("Создали объект класса X");
    }

    public X(int i) {
        System.out.println("Создали объект класса X" + i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        X x = new Y(18);
        System.out.println(x.abc());
    }
}

class Y extends X {
    public Y(int i) {
        System.out.println("Создали объект класса Y с переменной int = " + i);
    }

    public boolean abc() {
        return true;
    }
}