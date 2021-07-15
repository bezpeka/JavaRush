package p4;

import p1.A;
import p1.p2.p3.C;
import p4.p5.E;

public class D {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        E e = new E();
        System.out.println(p1.p2.B.x+p1.p2.B.y);
    }
}
