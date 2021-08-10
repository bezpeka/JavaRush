package NewbeToOracle.Lesson26;

public class Test1 {
    void abc(short s) {System.out.println("byte");}
    void abc(int i) {System.out.println("int");}
    void abc(float f) {System.out.println("float");}
    void abc(Object o) {System.out.println("Object");}

    public static void main(String[] args) {
        Test1 t = new Test1();
        char c = 55;
        t.abc(c);
        t.abc(false);
        t.abc(3.14);
    }
}

class X {
    static String s = "";
    {s += "A";}
    static {s += "B";}
    {s += "C";}
}

class Z {
    public static void main(String[] args) {
        System.out.println(X.s);
        System.out.println(X.s);
        new X();
        new X();
        System.out.println(X.s);
    }
}
