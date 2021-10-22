package NewbeToOracle.Lesson31;

public class Test24 {
}

class MyException extends Exception {
}

class Test241 {
    void abc(double d) throws MyException {
        System.out.println(d);
    }

    void def() {
        try {
            new Test241().abc(3.14);
        } catch (MyException e) {
        }
    }
}
