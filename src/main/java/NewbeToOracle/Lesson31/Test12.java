package NewbeToOracle.Lesson31;

public class Test12 {
    void abc() {
        try {
            def();
            return;
        } finally {
            System.out.println("finally");
        }
    }

    void def() {
        System.out.println("def");
        throw new StackOverflowError();
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        t.abc();
    }
}
