package NewbeToOracle.Lesson25;

public class Test3 {
}

class TestAnimal {
}

class Mouse extends TestAnimal {
    void abc() {
        def(new TestAnimal(), new Mouse());
        def(( Mouse ) new TestAnimal(), new Mouse());
    }

    void def(TestAnimal a1, Mouse m1) {
        Mouse m2 = ( Mouse ) a1;
        TestAnimal a2 = ( TestAnimal ) m1;
    }

    public static void main(String[] args) {
        new Mouse().abc();
    }
}