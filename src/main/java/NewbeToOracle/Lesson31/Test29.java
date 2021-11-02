package NewbeToOracle.Lesson31;

public class Test29 {
}

class A29 {
    public int a = 3;

    public void abc() {
        System.out.println("Method abc");
    }

    public void def() {
        System.out.println("Method def");
    }
}

class B29 extends A29 {
    public int a = 5;

    public void abc() {
        System.out.println("Method abc");
    }
}

class C29 {
    public static void main(String[] args) {
        A29 test1 = new A29();
        A29 test2 = new B29();
        System.out.println(test1.a);
        System.out.println(test2.a);
    }
}