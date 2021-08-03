package NewbeToOracle.Lesson23.Test1;

public class Y extends X {
    Y() { //пустой конструктор с дефолтным access modifier
    }

    @Override
    public void abc() {
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
