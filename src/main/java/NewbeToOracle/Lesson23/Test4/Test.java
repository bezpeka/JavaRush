package NewbeToOracle.Lesson23.Test4;

class X {
}

class Y extends X {
}

public class Test {
    public static void abc(X x, Y y) { // Эти три метода Overloaded, а не Override
        System.out.println("privet");
    }

    public static void abc(Y y, X x) { // Эти три метода Overloaded, а не Override
        System.out.println("poka");
    }

    public static void abc(Y a, Y b) { // Без этого метода, наш основной метод main работать не будет
        System.out.println("Third method");
    }

    public static void main(String[] args) {
        Y a = new Y();
//        X b = new Y();
        abc(a, a);
    }
}